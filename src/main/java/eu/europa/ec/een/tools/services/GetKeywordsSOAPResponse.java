
package eu.europa.ec.een.tools.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService.KeywordsType;


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
 *         &lt;element name="GetKeywordsSOAPResult" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}keywords" minOccurs="0"/&gt;
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
    "getKeywordsSOAPResult"
})
@XmlRootElement(name = "GetKeywordsSOAPResponse")
public class GetKeywordsSOAPResponse {

    @XmlElementRef(name = "GetKeywordsSOAPResult", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<KeywordsType> getKeywordsSOAPResult;

    /**
     * Gets the value of the getKeywordsSOAPResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KeywordsType }{@code >}
     *     
     */
    public JAXBElement<KeywordsType> getGetKeywordsSOAPResult() {
        return getKeywordsSOAPResult;
    }

    /**
     * Sets the value of the getKeywordsSOAPResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KeywordsType }{@code >}
     *     
     */
    public void setGetKeywordsSOAPResult(JAXBElement<KeywordsType> value) {
        this.getKeywordsSOAPResult = value;
    }

}
