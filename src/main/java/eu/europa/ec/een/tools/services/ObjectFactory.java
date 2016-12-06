
package eu.europa.ec.een.tools.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.ArrayOfevent;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.ArrayOfprofileType;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.CredentialsType;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.EventQueryRequestType;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.KeywordQueryRequestType;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.KeywordsType;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.ProfileInputType;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.ProfileQueryRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.ec.een.tools.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetProfilesU_QNAME = new QName("http://een.ec.europa.eu/tools/services", "u");
    private final static QName _GetProfilesP_QNAME = new QName("http://een.ec.europa.eu/tools/services", "p");
    private final static QName _GetProfilesPt_QNAME = new QName("http://een.ec.europa.eu/tools/services", "pt");
    private final static QName _GetProfilesDc_QNAME = new QName("http://een.ec.europa.eu/tools/services", "dc");
    private final static QName _GetProfilesDb_QNAME = new QName("http://een.ec.europa.eu/tools/services", "db");
    private final static QName _GetProfilesDa_QNAME = new QName("http://een.ec.europa.eu/tools/services", "da");
    private final static QName _GetProfilesSb_QNAME = new QName("http://een.ec.europa.eu/tools/services", "sb");
    private final static QName _GetProfilesSa_QNAME = new QName("http://een.ec.europa.eu/tools/services", "sa");
    private final static QName _GetProfilesUb_QNAME = new QName("http://een.ec.europa.eu/tools/services", "ub");
    private final static QName _GetProfilesUa_QNAME = new QName("http://een.ec.europa.eu/tools/services", "ua");
    private final static QName _GetProfilesO_QNAME = new QName("http://een.ec.europa.eu/tools/services", "o");
    private final static QName _GetProfilesOc_QNAME = new QName("http://een.ec.europa.eu/tools/services", "oc");
    private final static QName _GetProfilesPi_QNAME = new QName("http://een.ec.europa.eu/tools/services", "pi");
    private final static QName _GetProfilesPb_QNAME = new QName("http://een.ec.europa.eu/tools/services", "pb");
    private final static QName _GetProfilesPa_QNAME = new QName("http://een.ec.europa.eu/tools/services", "pa");
    private final static QName _GetProfilesCi_QNAME = new QName("http://een.ec.europa.eu/tools/services", "ci");
    private final static QName _GetProfilesIm_QNAME = new QName("http://een.ec.europa.eu/tools/services", "im");
    private final static QName _GetEventsRestCtry_QNAME = new QName("http://een.ec.europa.eu/tools/services", "ctry");
    private final static QName _GetEventsRestOctry_QNAME = new QName("http://een.ec.europa.eu/tools/services", "octry");
    private final static QName _GetEventsRestTy_QNAME = new QName("http://een.ec.europa.eu/tools/services", "ty");
    private final static QName _GetProfilesSOAPRequest_QNAME = new QName("http://een.ec.europa.eu/tools/services", "request");
    private final static QName _GetProfilesSOAPResponseGetProfilesSOAPResult_QNAME = new QName("http://een.ec.europa.eu/tools/services", "GetProfilesSOAPResult");
    private final static QName _GetKeywordsSOAPResponseGetKeywordsSOAPResult_QNAME = new QName("http://een.ec.europa.eu/tools/services", "GetKeywordsSOAPResult");
    private final static QName _SaveProfileCredentials_QNAME = new QName("http://een.ec.europa.eu/tools/services", "credentials");
    private final static QName _SaveProfileResponseSaveProfileResult_QNAME = new QName("http://een.ec.europa.eu/tools/services", "SaveProfileResult");
    private final static QName _GetEventsResponseGetEventsResult_QNAME = new QName("http://een.ec.europa.eu/tools/services", "GetEventsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.ec.een.tools.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProfiles }
     * 
     */
    public GetProfiles createGetProfiles() {
        return new GetProfiles();
    }

    /**
     * Create an instance of {@link GetProfilesResponse }
     * 
     */
    public GetProfilesResponse createGetProfilesResponse() {
        return new GetProfilesResponse();
    }

    /**
     * Create an instance of {@link GetKeywords }
     * 
     */
    public GetKeywords createGetKeywords() {
        return new GetKeywords();
    }

    /**
     * Create an instance of {@link GetKeywordsResponse }
     * 
     */
    public GetKeywordsResponse createGetKeywordsResponse() {
        return new GetKeywordsResponse();
    }

    /**
     * Create an instance of {@link GetEventsRest }
     * 
     */
    public GetEventsRest createGetEventsRest() {
        return new GetEventsRest();
    }

    /**
     * Create an instance of {@link GetEventsRestResponse }
     * 
     */
    public GetEventsRestResponse createGetEventsRestResponse() {
        return new GetEventsRestResponse();
    }

    /**
     * Create an instance of {@link GetProfilesSOAP }
     * 
     */
    public GetProfilesSOAP createGetProfilesSOAP() {
        return new GetProfilesSOAP();
    }

    /**
     * Create an instance of {@link GetProfilesSOAPResponse }
     * 
     */
    public GetProfilesSOAPResponse createGetProfilesSOAPResponse() {
        return new GetProfilesSOAPResponse();
    }

    /**
     * Create an instance of {@link GetKeywordsSOAP }
     * 
     */
    public GetKeywordsSOAP createGetKeywordsSOAP() {
        return new GetKeywordsSOAP();
    }

    /**
     * Create an instance of {@link GetKeywordsSOAPResponse }
     * 
     */
    public GetKeywordsSOAPResponse createGetKeywordsSOAPResponse() {
        return new GetKeywordsSOAPResponse();
    }

    /**
     * Create an instance of {@link SaveProfile }
     * 
     */
    public SaveProfile createSaveProfile() {
        return new SaveProfile();
    }

    /**
     * Create an instance of {@link SaveProfileResponse }
     * 
     */
    public SaveProfileResponse createSaveProfileResponse() {
        return new SaveProfileResponse();
    }

    /**
     * Create an instance of {@link GetEvents }
     * 
     */
    public GetEvents createGetEvents() {
        return new GetEvents();
    }

    /**
     * Create an instance of {@link GetEventsResponse }
     * 
     */
    public GetEventsResponse createGetEventsResponse() {
        return new GetEventsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "u", scope = GetProfiles.class)
    public JAXBElement<String> createGetProfilesU(String value) {
        return new JAXBElement<String>(_GetProfilesU_QNAME, String.class, GetProfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "p", scope = GetProfiles.class)
    public JAXBElement<String> createGetProfilesP(String value) {
        return new JAXBElement<String>(_GetProfilesP_QNAME, String.class, GetProfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "pt", scope = GetProfiles.class)
    public JAXBElement<String> createGetProfilesPt(String value) {
        return new JAXBElement<String>(_GetProfilesPt_QNAME, String.class, GetProfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "dc", scope = GetProfiles.class)
    public JAXBElement<String> createGetProfilesDc(String value) {
        return new JAXBElement<String>(_GetProfilesDc_QNAME, String.class, GetProfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "db", scope = GetProfiles.class)
    public JAXBElement<String> createGetProfilesDb(String value) {
        return new JAXBElement<String>(_GetProfilesDb_QNAME, String.class, GetProfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "da", scope = GetProfiles.class)
    public JAXBElement<String> createGetProfilesDa(String value) {
        return new JAXBElement<String>(_GetProfilesDa_QNAME, String.class, GetProfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "sb", scope = GetProfiles.class)
    public JAXBElement<String> createGetProfilesSb(String value) {
        return new JAXBElement<String>(_GetProfilesSb_QNAME, String.class, GetProfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "sa", scope = GetProfiles.class)
    public JAXBElement<String> createGetProfilesSa(String value) {
        return new JAXBElement<String>(_GetProfilesSa_QNAME, String.class, GetProfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "ub", scope = GetProfiles.class)
    public JAXBElement<String> createGetProfilesUb(String value) {
        return new JAXBElement<String>(_GetProfilesUb_QNAME, String.class, GetProfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "ua", scope = GetProfiles.class)
    public JAXBElement<String> createGetProfilesUa(String value) {
        return new JAXBElement<String>(_GetProfilesUa_QNAME, String.class, GetProfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "o", scope = GetProfiles.class)
    public JAXBElement<String> createGetProfilesO(String value) {
        return new JAXBElement<String>(_GetProfilesO_QNAME, String.class, GetProfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "oc", scope = GetProfiles.class)
    public JAXBElement<String> createGetProfilesOc(String value) {
        return new JAXBElement<String>(_GetProfilesOc_QNAME, String.class, GetProfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "pi", scope = GetProfiles.class)
    public JAXBElement<String> createGetProfilesPi(String value) {
        return new JAXBElement<String>(_GetProfilesPi_QNAME, String.class, GetProfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "pb", scope = GetProfiles.class)
    public JAXBElement<String> createGetProfilesPb(String value) {
        return new JAXBElement<String>(_GetProfilesPb_QNAME, String.class, GetProfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "pa", scope = GetProfiles.class)
    public JAXBElement<String> createGetProfilesPa(String value) {
        return new JAXBElement<String>(_GetProfilesPa_QNAME, String.class, GetProfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "ci", scope = GetProfiles.class)
    public JAXBElement<String> createGetProfilesCi(String value) {
        return new JAXBElement<String>(_GetProfilesCi_QNAME, String.class, GetProfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "im", scope = GetProfiles.class)
    public JAXBElement<String> createGetProfilesIm(String value) {
        return new JAXBElement<String>(_GetProfilesIm_QNAME, String.class, GetProfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "u", scope = GetKeywords.class)
    public JAXBElement<String> createGetKeywordsU(String value) {
        return new JAXBElement<String>(_GetProfilesU_QNAME, String.class, GetKeywords.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "p", scope = GetKeywords.class)
    public JAXBElement<String> createGetKeywordsP(String value) {
        return new JAXBElement<String>(_GetProfilesP_QNAME, String.class, GetKeywords.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "u", scope = GetEventsRest.class)
    public JAXBElement<String> createGetEventsRestU(String value) {
        return new JAXBElement<String>(_GetProfilesU_QNAME, String.class, GetEventsRest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "p", scope = GetEventsRest.class)
    public JAXBElement<String> createGetEventsRestP(String value) {
        return new JAXBElement<String>(_GetProfilesP_QNAME, String.class, GetEventsRest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "da", scope = GetEventsRest.class)
    public JAXBElement<String> createGetEventsRestDa(String value) {
        return new JAXBElement<String>(_GetProfilesDa_QNAME, String.class, GetEventsRest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "db", scope = GetEventsRest.class)
    public JAXBElement<String> createGetEventsRestDb(String value) {
        return new JAXBElement<String>(_GetProfilesDb_QNAME, String.class, GetEventsRest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "ctry", scope = GetEventsRest.class)
    public JAXBElement<String> createGetEventsRestCtry(String value) {
        return new JAXBElement<String>(_GetEventsRestCtry_QNAME, String.class, GetEventsRest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "octry", scope = GetEventsRest.class)
    public JAXBElement<String> createGetEventsRestOctry(String value) {
        return new JAXBElement<String>(_GetEventsRestOctry_QNAME, String.class, GetEventsRest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "ty", scope = GetEventsRest.class)
    public JAXBElement<String> createGetEventsRestTy(String value) {
        return new JAXBElement<String>(_GetEventsRestTy_QNAME, String.class, GetEventsRest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileQueryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "request", scope = GetProfilesSOAP.class)
    public JAXBElement<ProfileQueryRequest> createGetProfilesSOAPRequest(ProfileQueryRequest value) {
        return new JAXBElement<ProfileQueryRequest>(_GetProfilesSOAPRequest_QNAME, ProfileQueryRequest.class, GetProfilesSOAP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfprofileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "GetProfilesSOAPResult", scope = GetProfilesSOAPResponse.class)
    public JAXBElement<ArrayOfprofileType> createGetProfilesSOAPResponseGetProfilesSOAPResult(ArrayOfprofileType value) {
        return new JAXBElement<ArrayOfprofileType>(_GetProfilesSOAPResponseGetProfilesSOAPResult_QNAME, ArrayOfprofileType.class, GetProfilesSOAPResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordQueryRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "request", scope = GetKeywordsSOAP.class)
    public JAXBElement<KeywordQueryRequestType> createGetKeywordsSOAPRequest(KeywordQueryRequestType value) {
        return new JAXBElement<KeywordQueryRequestType>(_GetProfilesSOAPRequest_QNAME, KeywordQueryRequestType.class, GetKeywordsSOAP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "GetKeywordsSOAPResult", scope = GetKeywordsSOAPResponse.class)
    public JAXBElement<KeywordsType> createGetKeywordsSOAPResponseGetKeywordsSOAPResult(KeywordsType value) {
        return new JAXBElement<KeywordsType>(_GetKeywordsSOAPResponseGetKeywordsSOAPResult_QNAME, KeywordsType.class, GetKeywordsSOAPResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "request", scope = SaveProfile.class)
    public JAXBElement<ProfileInputType> createSaveProfileRequest(ProfileInputType value) {
        return new JAXBElement<ProfileInputType>(_GetProfilesSOAPRequest_QNAME, ProfileInputType.class, SaveProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CredentialsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "credentials", scope = SaveProfile.class)
    public JAXBElement<CredentialsType> createSaveProfileCredentials(CredentialsType value) {
        return new JAXBElement<CredentialsType>(_SaveProfileCredentials_QNAME, CredentialsType.class, SaveProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "SaveProfileResult", scope = SaveProfileResponse.class)
    public JAXBElement<String> createSaveProfileResponseSaveProfileResult(String value) {
        return new JAXBElement<String>(_SaveProfileResponseSaveProfileResult_QNAME, String.class, SaveProfileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventQueryRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "request", scope = GetEvents.class)
    public JAXBElement<EventQueryRequestType> createGetEventsRequest(EventQueryRequestType value) {
        return new JAXBElement<EventQueryRequestType>(_GetProfilesSOAPRequest_QNAME, EventQueryRequestType.class, GetEvents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfevent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://een.ec.europa.eu/tools/services", name = "GetEventsResult", scope = GetEventsResponse.class)
    public JAXBElement<ArrayOfevent> createGetEventsResponseGetEventsResult(ArrayOfevent value) {
        return new JAXBElement<ArrayOfevent>(_GetEventsResponseGetEventsResult_QNAME, ArrayOfevent.class, GetEventsResponse.class, value);
    }

}
