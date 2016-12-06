
package eu.europa.ec.een.tools.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetProfilesResult" type="{http://schemas.microsoft.com/Message}StreamBody"/&gt;
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
    "getProfilesResult"
})
@XmlRootElement(name = "GetProfilesResponse")
public class GetProfilesResponse {

    @XmlElement(name = "GetProfilesResult", required = true)
    protected byte[] getProfilesResult;

    /**
     * Gets the value of the getProfilesResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetProfilesResult() {
        return getProfilesResult;
    }

    /**
     * Sets the value of the getProfilesResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetProfilesResult(byte[] value) {
        this.getProfilesResult = value;
    }

}
