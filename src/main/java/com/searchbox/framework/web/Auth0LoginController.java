
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

import com.auth0.Auth0User;
import com.auth0.NonceUtils;
import com.auth0.SessionUtils;
import com.searchbox.framework.config.AuthOConfig;
import com.searchbox.framework.domain.Role;
import com.searchbox.framework.model.UserEntity;
import com.searchbox.framework.repository.UserRepository;
import com.searchbox.framework.util.SecurityUtil;
import java.io.IOException;
import java.security.Principal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author anhlucky
 */
@Controller
public class Auth0LoginController {

    private static final Logger logger = LoggerFactory.getLogger(Auth0LoginController.class);

    private AuthOConfig appConfig;
    @Autowired
    private UserRepository repository;

    @Autowired
    public Auth0LoginController(AuthOConfig appConfig) {
        this.appConfig = appConfig;
    }

    @RequestMapping(value = "/user/auth0Login", method = RequestMethod.GET)
    protected String login(final Map<String, Object> model, final HttpServletRequest req) {
        logger.info("Performing login");
        detectError(model);
        // add a Nonce value to session storage
        NonceUtils.addNonceToStorage(req);
        model.put("clientId", appConfig.getClientId());
        model.put("clientDomain", appConfig.getDomain());
        model.put("loginCallback", appConfig.getLoginCallback());
        model.put("state", SessionUtils.getState(req));
        String url = String.format("%s://%s:%d/",req.getScheme(),  req.getServerName(), req.getServerPort());
        String redirectUrl = appConfig.getIssuer()+"authorize?"
                + "response_type=code&scope=openid%20profile&"
                + "client_id="+appConfig.getClientId()+"&"
                + "state="+SessionUtils.getState(req)
                + "&redirect_uri="+url+"callback";
        return "redirect:" + redirectUrl;
        //return "/user/auth0Login";
    }

    private void detectError(final Map<String, Object> model) {
        if (model.get("error") != null) {
            model.put("error", true);
        } else {
            model.put("error", false);
        }
    }

    @RequestMapping("/error")
    protected String error(final RedirectAttributes redirectAttributes) throws IOException {
        logger.error("Handling error");
        final String logoutPath = appConfig.getOnLogoutRedirectTo();
        redirectAttributes.addFlashAttribute("error", true);
        return "redirect:" + logoutPath;
    }

    @RequestMapping(value = "/portal/home")
    protected ModelAndView home(final Map<String, Object> model, final HttpServletRequest req, final Principal principal) {
        logger.info("Home page");
        try {
            final Auth0User auth0User = SessionUtils.getAuth0User(req);
            model.put("user", auth0User);
            logger.info("USER: " + auth0User.getName());
            String email = auth0User.getEmail();
            UserEntity user = repository.findByEmail(auth0User.getEmail());
            logger.info("Found user: {}", user);
            if (user == null) {
                user = new UserEntity();
                user.setUsername(email);
                user.setEmail(email);
//      user.setFirstName(attributes.get("firstname"));
//      user.setFirstName(attributes.get("lastname"));
                user.getRoles().add(Role.USER);

                logger.info("Saving user " + email);

                user = repository.save(user);

            }
            SecurityUtil.logInUser(user);
            logger.info("User {} has been signed in", user.getEmail());
        } catch (Exception e) {
            logger.error("ERROR:" + e);
        }
        ModelAndView mav = new ModelAndView(new RedirectView("/oppfin", true));
        return mav;
    }

    @ModelAttribute("user")
    public UserEntity getUser(@AuthenticationPrincipal UserEntity user) {
        return user;
    }
}
