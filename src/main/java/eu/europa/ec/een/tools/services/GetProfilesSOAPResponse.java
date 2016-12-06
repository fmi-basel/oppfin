
package eu.europa.ec.een.tools.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.ArrayOfprofileType;


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
 *         &lt;element name="GetProfilesSOAPResult" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}ArrayOfprofile" minOccurs="0"/&gt;
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
    "getProfilesSOAPResult"
})
@XmlRootElement(name = "GetProfilesSOAPResponse")
public class GetProfilesSOAPResponse {

    @XmlElementRef(name = "GetProfilesSOAPResult", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfprofileType> getProfilesSOAPResult;

    /**
     * Gets the value of the getProfilesSOAPResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfprofileType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfprofileType> getGetProfilesSOAPResult() {
        return getProfilesSOAPResult;
    }

    /**
     * Sets the value of the getProfilesSOAPResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfprofileType }{@code >}
     *     
     */
    public void setGetProfilesSOAPResult(JAXBElement<ArrayOfprofileType> value) {
        this.getProfilesSOAPResult = value;
    }

}
