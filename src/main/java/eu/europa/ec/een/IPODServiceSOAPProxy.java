/*
 * Copyright 2016 anhlucky.
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
package eu.europa.ec.een;

import com.searchbox.collection.oppfin.EENCollection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.ArrayOfevent;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.ArrayOfprofileType;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.CredentialsType;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.EventQueryRequestType;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.KeywordQueryRequestType;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.KeywordsType;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.Profile;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.ProfileDatum;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.ProfileInputType;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.ProfileQueryRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author anhlucky
 */
public class IPODServiceSOAPProxy implements IPODServiceSOAP {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(EENCollection.class);

    IPODServiceSOAP iPODServiceSOAP = null;

    public IPODServiceSOAPProxy() {
        _initIPODServiceSOAPProxy();
    }

    public IPODServiceSOAPProxy(String endpoint) {
        _initIPODServiceSOAPProxy();
    }

    private void _initIPODServiceSOAPProxy() {
        iPODServiceSOAP = (new QueryService()).getBasicHttpBindingIPODServiceSOAP();
    }

    @Override
    public ArrayOfprofileType getProfilesSOAP(ProfileQueryRequest request) {
        if (iPODServiceSOAP == null) {
            _initIPODServiceSOAPProxy();
        }
        return iPODServiceSOAP.getProfilesSOAP(request);
    }

    @Override
    public String saveProfile(ProfileInputType request, CredentialsType credentials) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayOfevent getEvents(EventQueryRequestType request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public KeywordsType getKeywordsSOAP(KeywordQueryRequestType request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Profile[] getProfiles(ProfileQueryRequest request) {
        try{
        ArrayOfprofileType a = getProfilesSOAP(request);
        List<Profile> list =  a.getProfile();
        Profile[] profileArr = new Profile[list.size()];
        return (Profile[]) list.toArray(profileArr);
        } catch (Exception e){
            LOGGER.error("===> Get List Profiles",e);
            throw e;
        }
    }

}
