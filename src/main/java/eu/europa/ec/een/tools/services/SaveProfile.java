
package eu.europa.ec.een.tools.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.CredentialsType;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.ProfileInputType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileInput" minOccurs="0"/&gt;
 *         &lt;element name="credentials" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}credentials" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "credentials"
})
@XmlRootElement(name = "SaveProfile")
public class SaveProfile {

    @XmlElementRef(name = "request", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileInputType> request;
    @XmlElementRef(name = "credentials", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<CredentialsType> credentials;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileInputType }{@code >}
     *     
     */
    public JAXBElement<ProfileInputType> getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileInputType }{@code >}
     *     
     */
    public void setRequest(JAXBElement<ProfileInputType> value) {
        this.request = value;
    }

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CredentialsType }{@code >}
     *     
     */
    public JAXBElement<CredentialsType> getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CredentialsType }{@code >}
     *     
     */
    public void setCredentials(JAXBElement<CredentialsType> value) {
        this.credentials = value;
    }

}
