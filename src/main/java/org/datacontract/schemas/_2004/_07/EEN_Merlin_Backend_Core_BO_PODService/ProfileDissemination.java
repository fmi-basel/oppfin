
package org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profileDissemination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profileDissemination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="export" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileDisseminationExport" minOccurs="0"/&gt;
 *         &lt;element name="preferred" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}ArrayOfcountry" minOccurs="0"/&gt;
 *         &lt;element name="publish" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileDisseminationPublish" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profileDissemination", propOrder = {
    "export",
    "preferred",
    "publish"
})
public class ProfileDissemination {

    @XmlElementRef(name = "export", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileDisseminationExportType> export;
    @XmlElementRef(name = "preferred", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfcountryType> preferred;
    @XmlElementRef(name = "publish", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileDisseminationPublishType> publish;

    /**
     * Gets the value of the export property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileDisseminationExportType }{@code >}
     *     
     */
    public JAXBElement<ProfileDisseminationExportType> getExport() {
        return export;
    }

    /**
     * Sets the value of the export property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileDisseminationExportType }{@code >}
     *     
     */
    public void setExport(JAXBElement<ProfileDisseminationExportType> value) {
        this.export = value;
    }

    /**
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfcountryType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfcountryType> getPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfcountryType }{@code >}
     *     
     */
    public void setPreferred(JAXBElement<ArrayOfcountryType> value) {
        this.preferred = value;
    }

    /**
     * Gets the value of the publish property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileDisseminationPublishType }{@code >}
     *     
     */
    public JAXBElement<ProfileDisseminationPublishType> getPublish() {
        return publish;
    }

    /**
     * Sets the value of the publish property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileDisseminationPublishType }{@code >}
     *     
     */
    public void setPublish(JAXBElement<ProfileDisseminationPublishType> value) {
        this.publish = value;
    }

}
