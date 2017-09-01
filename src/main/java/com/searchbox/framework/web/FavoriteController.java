/*
 * Copyright 2017 anhlucky.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.searchbox.framework.web;

import com.searchbox.core.SearchCollector;
import com.searchbox.core.SearchElement;
import com.searchbox.core.dm.Collection;
import com.searchbox.core.dm.FieldAttribute;
import com.searchbox.core.dm.SearchableCollection;
import com.searchbox.core.engine.SearchEngine;
import com.searchbox.core.search.AbstractSearchCondition;
import com.searchbox.core.search.RetryElement;
import com.searchbox.framework.model.Favorite;
import com.searchbox.framework.model.FieldAttributeEntity;
import com.searchbox.framework.model.PresetEntity;
import com.searchbox.framework.model.SearchConditionEntity;
import com.searchbox.framework.model.SearchboxEntity;
import com.searchbox.framework.model.UserEntity;
import com.searchbox.framework.model.UserFavoriteEntity;
import com.searchbox.framework.repository.PresetRepository;
import com.searchbox.framework.repository.SearchboxRepository;
import com.searchbox.framework.service.SearchElementService;
import com.searchbox.framework.service.SearchService;
import com.searchbox.framework.service.UserFavoriteService;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.solr.internal.csv.CSVStrategy;
import org.apache.solr.internal.csv.CSVUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author anhlucky
 */
@Controller
public class FavoriteController {

    private static final Logger logger = LoggerFactory.getLogger(Auth0LoginController.class);

    @Autowired
    ApplicationConversionService conversionService;

    @Autowired
    SearchService searchService;

    @Autowired
    SearchboxRepository searchboxRepository;

    @Autowired
    protected PresetRepository presetRepository;

    @Autowired
    protected SearchElementService elementService;
    @Autowired
    private UserFavoriteService service;

    @RequestMapping(value = "/{searchbox}/{preset}/{process}/mark_favorite", method = RequestMethod.GET)
    public String markFavorite(@RequestParam String id, @RequestParam String title, @RequestParam String field, HttpServletRequest request, ModelAndView model, @PathVariable String process, @PathVariable PresetEntity preset,
            @ModelAttribute("collector") SearchCollector collector)
            throws ServletException, IOException {
//        ModelAndView redirect = new ModelAndView(new RedirectView("/"
//                + searchbox.getSlug() + "/" + preset.getSlug() + "/search" , true));
//        String redirect = "redirect:/" + preset.getSlug() + "/search";
        logger.info("===========Mark Favorite=============");
        logger.info("=====>opp id:" + id);
        logger.info("=====>opp title:" + title);
        logger.info("=====>opp fieldId:" + field);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            UserEntity user = (UserEntity) authentication.getPrincipal();
            logger.info("=====>userId:" + user.getId());
            List<UserFavoriteEntity> list = service.findFavoriteByUserId(user);
            for (int i = 0; i < list.size(); i++) {
                UserFavoriteEntity u = list.get(i);
                if (u.getFavoriteId().equals(id)) {
                    String referer = request.getHeader("Referer");
                    return "redirect:" + referer;
                }
            }

            service.markFavorite(user, id, title, field);
        }
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }

    @RequestMapping(value = "/{searchbox}/{preset}/{process}/un_mark_favorite", method = RequestMethod.GET)
    public String unMarkFavorite(@RequestParam String id, HttpServletRequest request, ModelAndView model, @PathVariable String process, @PathVariable PresetEntity preset,
            @ModelAttribute("collector") SearchCollector collector)
            throws ServletException, IOException {
        logger.info("===========Un Mark Favorite=============");
        logger.info("=====>opp id:" + id);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            UserEntity user = (UserEntity) authentication.getPrincipal();

            service.unMarkFavorite(user, id);
        }
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }

    protected String getViewFolder() {
        return "search";
    }

    @ModelAttribute("user")
    public UserEntity getUser(@AuthenticationPrincipal UserEntity user) {
        return user;
    }

    private Set<FieldAttribute> getAllFieldAttribute(PresetEntity preset) {

        Set<FieldAttribute> fieldAttributes = new HashSet<>();
        for (FieldAttributeEntity def : preset.getFieldAttributes(true)) {
            fieldAttributes.add(def.build());
        }

        return fieldAttributes;
    }

    private Set<AbstractSearchCondition> getAllSearchConditions(
            PresetEntity preset) {
        Set<AbstractSearchCondition> fieldAttributes = new HashSet<>();
        for (SearchConditionEntity<?> def : preset.getSearchConditions(true)) {
            logger.info("Got Search Condition entity: {}", def);
            fieldAttributes.add(def.build());
        }
        return fieldAttributes;
    }

    protected Set<SearchElement> executeRequest(SearchboxEntity searchbox,
            PresetEntity preset, String process,
            Set<AbstractSearchCondition> conditions, SearchCollector collector) {

        Set<SearchElement> searchElements = elementService.getSearchElements(preset, process);
        logger.debug("Required Search elements are {}", searchElements);

        Set<FieldAttribute> fieldAttributes = getAllFieldAttribute(preset);

        Set<AbstractSearchCondition> presetConditions = getAllSearchConditions(preset);
        logger.info("Required preset Conditions are {}", presetConditions);

        Collection collection = preset.getCollection().build();

        if (!(SearchableCollection.class.isAssignableFrom(collection.getClass()))) {
            logger.error("Collection {} does NOT implement SearchableCollection!!!",
                    collection.getName());
        }

        SearchEngine<?, ?> searchEngine = ((SearchableCollection) collection).getSearchEngine();

        logger.debug("Current SearchEngine: {}", searchEngine);
        logger.debug("Current Collection: {}", collection);
        logger.debug("presetConditions: {}" + presetConditions);
        logger.debug("conditions: {}" + conditions);

        Set<SearchElement> resultElements = searchService.execute(searchEngine,
                collection, searchElements, fieldAttributes,
                presetConditions, conditions, collector);
        logger.debug("Resulting SearchElements are {}", resultElements);

        // Check if we have a retry clause
        boolean retry = false;
        for (SearchElement element : resultElements) {
            if (RetryElement.class.isAssignableFrom(element.getClass())) {
                if (((RetryElement) element).shouldRetry()) {
                    logger.debug("RetryElement:" + element.getLabel());
                    retry = true;
                }
            }
        }

        if (retry) {
            logger.debug("========>Start retry");
            logger.debug("Current SearchEngine: {}", searchEngine);
            logger.debug("Current Collection: {}", collection);

            resultElements = searchService.execute(searchEngine, collection,
                    searchElements, fieldAttributes, presetConditions, conditions, collector);
        }
        return resultElements;
    }

    public List<String> getFavoriteId() {
        List<String> param = new ArrayList();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            UserEntity user = (UserEntity) authentication.getPrincipal();
            logger.info("=====>Get Fav ID");
            logger.info("=====>userId:" + user.getId());
            List<UserFavoriteEntity> list = service.findFavoriteByUserId(user);
            for (int i = 0; i < list.size(); i++) {
                UserFavoriteEntity u = list.get(i);
                String uid = u.getFavoriteId();
                param.add(uid);
                logger.info("=====>userFav:" + uid);
            }

        }
        return param;
    }

    @RequestMapping(value = "/favorite/list_favorite", method = RequestMethod.GET)
    public ModelAndView listFavorite(@RequestParam PresetEntity preset, @RequestParam SearchboxEntity searchbox, ModelAndView model) {
        logger.info("===========List Favorite=============");
        logger.info("===========>Preset==" + preset);
        logger.info("===========>Searchbox==" + searchbox);
        List<String> idFields = new ArrayList<String>();
        String presetSlug = "all";
        if (preset != null) {
            presetSlug = preset.getSlug();
        }
        if ("funding".equals(presetSlug)) {
            idFields.add("topicIdentifier");
        } else if ("cooperations".equals(presetSlug)) {
            idFields.add("eenReferenceExternal");
            idFields.add("uid");
        } else if ("funded".equals(presetSlug)) {
            idFields.add("cordisId");
        }
        List<UserFavoriteEntity> list = null;
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            UserEntity user = (UserEntity) authentication.getPrincipal();
            logger.info("=====>userId:" + user.getId());
            if ("all".equals(presetSlug)) {
                list = service.findFavoriteByUserId(user);
            } else {
                list = service.findByPreset(user, idFields);
            }
        }
        model.addObject("preset", preset);
        model.addObject("searchbox", searchbox);
        model.addObject("favorites", list);
        return model;
    }

    @RequestMapping(value = "/favorite/admin", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView listAllFavorite(@RequestParam String sort, @Qualifier("favoriteTable") Pageable page, ModelAndView model) {
        logger.info("===========List Favorite=============");
        // timeMarked name
        if (sort == null || sort.equals("")) {
            sort = "asc";
        }
        List<List> results = new ArrayList();
        model.addObject("favoriteTable", page);
        model.addObject("favoriteCount", service.countAllFavorite());
        List<Favorite> list = service.findAllCount(sort, page);
        model.addObject("favorites", list);
        model.addObject("sort", sort);
        return model;
    }

    @RequestMapping(value = "/favorite/downloadCSV")
    public void downloadCSV(@RequestParam String sort, @Qualifier("favoriteTable") Pageable page, HttpServletResponse response, HttpServletRequest request) throws IOException {
        String csvFileName = "favorites.csv";
        response.setContentType("text/csv");
        // creates mock data
        String headerKey = "Content-Disposition";
        String headerValue = String.format("attachment; filename=\"%s\"",
                csvFileName);
        response.setHeader(headerKey, headerValue);
        List<Favorite> list = service.findAllCount(sort, new PageRequest(0, Integer.MAX_VALUE));
        String result = "Id, Title, Url, Time \n";
        for (Favorite f : list) {
            String[] row = new String[4];
            row[0] = f.getFavoriteId();
            row[1] = f.getTitle();
            URL url = new URL(request.getRequestURL().toString());
            row[2] =  url.getHost()+ "/oppfin/all/view/?ff=" + f.getIdField() + "[" + f.getFavoriteId() + "]";
            row[3] = f.getTime().toString();
            result = result + CSVUtils.printLine(row, CSVStrategy.EXCEL_STRATEGY) + "\n";
        }
        response.getWriter().print(result);
    }
}
