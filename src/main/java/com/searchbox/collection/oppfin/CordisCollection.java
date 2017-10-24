/**
 * *****************************************************************************
 * Copyright Searchbox - http://www.searchbox.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *****************************************************************************
 */
package com.searchbox.collection.oppfin;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.builder.FlowJobBuilder;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;

import com.searchbox.collection.AbstractBatchCollection;
import com.searchbox.collection.StandardCollection;
import com.searchbox.collection.SynchronizedCollection;
import com.searchbox.core.dm.Field;
import com.searchbox.core.dm.FieldMap;
import com.searchbox.framework.util.Unzip;
import java.io.File;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

@Configurable
public class CordisCollection extends AbstractBatchCollection implements
        SynchronizedCollection, StandardCollection {

    @Autowired
    ApplicationContext context;

    @Autowired
    StepBuilderFactory stepBuilderFactory;

    DateFormat df;

    private static final Logger LOGGER = LoggerFactory
            .getLogger(CordisCollection.class);

    public static List<Field> GET_FIELDS() {
        List<Field> fields = new ArrayList<Field>();
        fields.add(new Field(String.class, "docSource"));
        fields.add(new Field(String.class, "cordisId"));
        fields.add(new Field(String.class, "cordisTag"));
        fields.add(new Field(Integer.class, "cordisStartYear"));
        fields.add(new Field(Date.class, "cordisProjectStartDate"));
        fields.add(new Field(Float.class, "cordisProjectFunding"));
        fields.add(new Field(String.class, "cordisContractType"));

        fields.add(new Field(String.class, "cordisProjectStatus"));
        fields.add(new Field(String.class, "cordisUrl"));
        fields.add(new Field(String.class, "cordisCategory"));
        fields.add(new Field(String.class, "cordisProgram"));
        fields.add(new Field(Float.class, "cordisProjectCost"));
        fields.add(new Field(Date.class, "cordisProjectEndDate"));

        fields.add(new Field(Integer.class, "cordisProjectDuration"));
        fields.add(new Field(String.class, "cordisSnippet"));
        fields.add(new Field(String.class, "cordisSubProgrammArea"));
        fields.add(new Field(String.class, "cordisCallIdentifier"));
        fields.add(new Field(String.class, "cordisTitle"));
        fields.add(new Field(String.class, "cordisCountryCode"));
        fields.add(new Field(String.class, "cordisArea"));
        fields.add(new Field(String.class, "cordisSubjectIndexCode"));
        fields.add(new Field(String.class, "cordisLanguage"));
        fields.add(new Field(String.class, "cordisProjectTeaser"));
        fields.add(new Field(String.class, "cordisCallTitle"));
        return fields;
    }

    public CordisCollection() {
        this.df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        this.df.setTimeZone(TimeZone.getTimeZone("UTC"));

    }

    public CordisCollection(String name) {
        super(name);
    }

    public ItemReader<JSONObject> reader() throws IOException {

        return new ItemReader<JSONObject>() {

            JSONArray cordisData = new JSONArray();
            Iterator iterator;

            {
                String url_fp7 = env.getProperty("data.fp7");
                download(url_fp7);
                String url_h2020 = env.getProperty("data.h2020");
                download(url_h2020);
                LOGGER.info("Starting collection / ItemReader");
                String strFolder = context.getResource("classpath:data/xml").getFile().getAbsolutePath();
//                String strFolder = "/tmp/xml";
                LOGGER.info("=====>xml folder:" + strFolder);
                File folder = new File(strFolder);
                File[] fXml = folder.listFiles();
                LOGGER.info("folder size:" + fXml.length);
                for (int i = 0; i < fXml.length; i++) {
                    JSONObject json = readFromFile(fXml[i]);
                    if (json == null) {
                        continue;
                    } else {
                        cordisData.add(json);
                    }
                }
                LOGGER.info("=====>Cordis data is parsed {}", cordisData.size());
                iterator = cordisData.iterator();
            }

            @Override
            public JSONObject read() {
                if (iterator.hasNext()) {
                    return (JSONObject) iterator.next();
                }
                return null;
            }
        };
    }

    public ItemProcessor<JSONObject, FieldMap> itemProcessor() {
        return new ItemProcessor<JSONObject, FieldMap>() {
            @Override
            public FieldMap process(JSONObject item) throws IOException {
                DateFormat dfSource = new SimpleDateFormat(
                        "EEE MMM dd kk:mm:ss z yyyy", Locale.ENGLISH);

                LOGGER.info("Processing cordis {}", item.get("id"));
                FieldMap doc = new FieldMap();

                doc.put("docSource", "Cordis");
                doc.put("docType", "Cordis");
                doc.put("programme", item.get("program"));

                doc.put("cordisId", item.get("id"));
                doc.put("cordisTag", item.get("tag"));
                doc.put("cordisStartYear", item.get("start_year"));
                doc.put("cordisProjectFunding", new Float((String) item.get("projectfunding")));
                doc.put("cordisContractType", item.get("contract_type"));
                doc.put("cordisProjectStatus", item.get("project_status"));
                doc.put("cordisUrl", item.get("url"));
                doc.put("cordisCategory", item.get("category"));
                doc.put("cordisProgram", item.get("program"));
                doc.put("cordisProjectCost", new Float((String) item.get("projectcost")));
                doc.put("cordisProjectDuration", item.get("projectduration"));
                doc.put("cordisSnippet", item.get("snippet"));
                doc.put("cordisSubProgrammArea", item.get("subprogrammearea"));
                doc.put("cordisCallIdentifier", item.get("call_identifier"));
                doc.put("cordisTitle", item.get("title"));
                doc.put("cordisCountryCode", item.get("country_code"));
                doc.put("cordisArea", item.get("aera"));
                doc.put("cordisSubjectIndexCode", item.get("subjectindexcode"));
                doc.put("cordisProjectTeaser", item.get("teaser"));
                doc.put("cordisCallTitle", item.get("cordisCallTitle"));

                try {
                    doc.put("cordisProjectStartDate", item.get("projectstartdate"));
                } catch (Exception e) {
                    LOGGER.error("Cannot parse date", e);
                }

                try {
                    doc.put("cordisProjectEndDate", item.get("projectenddate"));
                } catch (Exception e) {
                    LOGGER.error("Cannot parse date", e);
                }

                return doc;
            }
        };
    }

    @Override
    public String getIdValue(FieldMap fields) {
        return (String) fields.get("cordisId").get(0);
    }

    @Override
    public String getTitleValue(FieldMap fields) {
        return (String) fields.get("cordisTitle").get(0);
    }

    @Override
    public String getBodyValue(FieldMap fields) {
        return null;// (String) fields.get("cordisSnippet").get(0);
    }

    @Override
    public Date getPublishedValue(FieldMap fields) {
        return null;
    }

    @Override
    public Date getUpdateValue(FieldMap fields) {
        return null;
    }

    @Override
    protected FlowJobBuilder getJobFlow(JobBuilder builder) {
        Step step = null;
        try {
            step = stepBuilderFactory.get("getFile")
                    .<JSONObject, FieldMap>chunk(500).reader(reader())
                    .processor(itemProcessor()).writer(fieldMapWriter()).build();
        } catch (IOException e) {
            LOGGER.error("Could not build step.", e);
        }
        return builder.flow(step).end();
    }

    public void download(String URL_LOCATION) {
        LOGGER.info("Starting download form: " + URL_LOCATION);
        String dataFolder = null;
        try {
            dataFolder = context.getResource("classpath:data").getFile().getAbsolutePath();
        } catch (IOException ex) {
            LOGGER.error(" file not exist", ex);
        }
        String zipFile = dataFolder + "/data.zip";
        File dstFile = new File(zipFile);
        try {

            URL url = new URL(URL_LOCATION);
            FileUtils.copyURLToFile(url, dstFile);
            LOGGER.info("file download success");
            LOGGER.info("file name:" + zipFile);
            Unzip.unZipIt(zipFile, dataFolder + "/xml");
            LOGGER.info("file unzip success");
        } catch (Exception e) {
            LOGGER.error("download Cordis:", e);
        }

    }

    public JSONObject readFromFile(File file) {
        LOGGER.info("read file:" + file.getName());
        DateFormat dfSource = new SimpleDateFormat(
                "yyyy-mm-dd", Locale.ENGLISH);
        JSONObject json = new JSONObject();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        Document document = null;
        try {
            builder = factory.newDocumentBuilder();
            document = builder.parse(file);
            NodeList nl = document.getElementsByTagName("programme");
            Element relatedProgramme = null;
            for (int i = 0; i < nl.getLength(); i++) {
                Element e = (Element) nl.item(i);
                if ("relatedProgramme".equals(e.getAttribute("type"))) {
                    relatedProgramme = e;
                    String value = e.getElementsByTagName("frameworkProgramme").item(0).getTextContent();
                    json.put("program", value);
                }
            }
            try{
            String id = document.getElementsByTagName("reference").item(0).getTextContent();
            json.put("id", id);
            if (id == null) {
                LOGGER.error("=====>id null:" + file.getName());
            }
            
            } catch (Exception ex) {
                LOGGER.error("reference error:" + file.getName());
                return null;
            }
            String startDate = "";
            try {
                startDate = document.getElementsByTagName("startDate").item(0).getTextContent();
                json.put("start_year", startDate.substring(0, 4));
                json.put("projectstartdate", dfSource.parse(startDate));
            } catch (Exception ex) {
                LOGGER.error("startDate error:" + file.getName());
                return null;
            }
            try{
            String ProjectFunding = document.getElementsByTagName("totalCost").item(0).getTextContent();
            json.put("projectfunding", ProjectFunding);

            } catch (Exception ex) {
                LOGGER.error("totalCost error:" + file.getName());
                return null;
            }
            NodeList categogries = document.getElementsByTagName("category");
            String contactType = "";
            for (int i = 0; i < categogries.getLength(); i++) {
                Element e = (Element) categogries.item(i);
                if ("projectFundingSchemeCategory".equals(e.getAttribute("classification"))) {
                    contactType = e.getElementsByTagName("code").item(0).getTextContent();
                    json.put("contract_type", contactType);
                }
            }
            String projectStatus = "";
            try {
                projectStatus = document.getElementsByTagName("status").item(0).getTextContent();
                json.put("project_status", projectStatus);
            } catch (Exception ex) {
                json.put("project_status", "");
            }
            String url = document.getElementsByTagName("rcn").item(0).getTextContent();
            url = "http://cordis.europa.eu/projects/rcn/" + url + "_en.html";
            json.put("url", url);
            String program = document.getElementsByTagName("frameworkProgramme").item(0).getTextContent();
            json.put("program", program);
            String totalCost = document.getElementsByTagName("totalCost").item(0).getTextContent();
            json.put("projectcost", totalCost);
            try{
            String projectEndDate = document.getElementsByTagName("endDate").item(0).getTextContent();
            json.put("projectenddate", dfSource.parse(projectEndDate));
            
            } catch (Exception ex) {
                LOGGER.error("endDate error:" + file.getName());
                return null;
            }
            String projectDuration = document.getElementsByTagName("duration").item(0).getTextContent();
            json.put("projectduration", projectDuration);
            String teaser = document.getElementsByTagName("teaser").item(0).getTextContent();
            json.put("teaser", teaser);
            String snippet = document.getElementsByTagName("objective").item(0).getTextContent();
            json.put("snippet", snippet);

            NodeList subPA = document.getElementsByTagName("programme");
            for (int i = 0; i < subPA.getLength(); i++) {
                Element e = (Element) subPA.item(i);
                if ("relatedSubProgramme".equals(e.getAttribute("type"))) {
                    String SubProgrammArea = e.getElementsByTagName("code").item(0).getTextContent();
                    json.put("subprogrammearea", SubProgrammArea);
                }
            }

            NodeList call = document.getElementsByTagName("call");
            for (int i = 0; i < call.getLength(); i++) {
                Element e = (Element) call.item(i);
                if ("relatedCall".equals(e.getAttribute("type"))) {
                    String CallIdentifier = e.getElementsByTagName("identifier").item(0).getTextContent();
                    json.put("call_identifier", CallIdentifier);
                }
            }
            NodeList nodeTitle = document.getElementsByTagName("title");
            String title = nodeTitle.item(0).getTextContent();
            if (title == null || title.equals("")) {
                LOGGER.error("title null:" + file.getName());
                return null;
            }
            json.put("title", title);
            NodeList callTitle = document.getElementsByTagName("call");
            for (int i = 0; i < callTitle.getLength(); i++) {
                Element e = (Element) callTitle.item(i);
                if ("relatedCall".equals(e.getAttribute("type"))) {
                    try {
                        if (e.getElementsByTagName("title") != null) {
                            String cordisCallTitle = e.getElementsByTagName("title").item(0).getTextContent();
                            json.put("cordisCallTitle", cordisCallTitle);
                        } else {
                            json.put("cordisCallTitle", "");
                        }
                    } catch (Exception dOMException) {
                        json.put("cordisCallTitle", "");
                    }
                }
            }
            Element coordinator = null;
            NodeList countryCode = document.getElementsByTagName("organization");
            for (int i = 0; i < countryCode.getLength(); i++) {
                Element e = (Element) countryCode.item(i);
                if ("coordinator".equals(e.getAttribute("type"))) {
                    coordinator = e;
                    try {
                        String countrycode = e.getElementsByTagName("isoCode").item(0).getTextContent();
                        json.put("country_code", countrycode);
                    } catch (Exception ex) {
                        json.put("country_code", "");
                    }
                }
            }
            String area = "";
            for (int i = 0; i < nl.getLength(); i++) {
                Element e = (Element) nl.item(i);
                if ("relatedProgramme".equals(e.getAttribute("type"))) {
                    try {
                        area = e.getElementsByTagName("shortTitle").item(0).getTextContent();
                    } catch (Exception ex) {
                        area = "";
                    }
                    String subjectindexcode = e.getElementsByTagName("code").item(0).getTextContent();
                    json.put("subjectindexcode", subjectindexcode);
                }
            }

            String language = document.getElementsByTagName("language").item(0).getTextContent();
            json.put("language", language);
            String legalName = "";
            NodeList organize = document.getElementsByTagName("organization");
            for (int i = 0; i < countryCode.getLength(); i++) {
                Element e = (Element) countryCode.item(i);
                if ("coordinator".equals(e.getAttribute("type"))) {
                    legalName = coordinator.getElementsByTagName("legalName").item(0).getTextContent();
                }
            }

            String tag[] = {area, contactType, legalName};
            json.put("tag", tag);
            String cordisProjectCoordinatorCountry = "";
            for (int i = 0; i < countryCode.getLength(); i++) {
                Element e = (Element) countryCode.item(i);
                if ("coordinator".equals(e.getAttribute("type"))) {
                    cordisProjectCoordinatorCountry = coordinator.getElementsByTagName("country").item(0).getTextContent();
                }
            }

            String[] category = {cordisProjectCoordinatorCountry, area, projectStatus, program};
            json.put("category", category);
        } catch (Exception e) {
            LOGGER.error("readFile", e);
            LOGGER.info(" file error:" + file.getName());
            return null;
        }
        return json;
    }
}
