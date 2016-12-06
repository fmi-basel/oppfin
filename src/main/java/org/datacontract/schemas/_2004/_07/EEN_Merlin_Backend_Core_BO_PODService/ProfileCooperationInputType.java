
package org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profileCooperationInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profileCooperationInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="advino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ipr" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}ArrayOfprofileCooperationIprInput" minOccurs="0"/&gt;
 *         &lt;element name="iprcomments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partner" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileCooperationPartnerInput" minOccurs="0"/&gt;
 *         &lt;element name="profileorigin" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileOriginInput" minOccurs="0"/&gt;
 *         &lt;element name="stagedev" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileCooperationStagedevInput" minOccurs="0"/&gt;
 *         &lt;element name="stagedevcomments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="techspec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profileCooperationInput", propOrder = {
    "advino",
    "ipr",
    "iprcomments",
    "partner",
    "profileorigin",
    "stagedev",
    "stagedevcomments",
    "techspec"
})
public class ProfileCooperationInputType {

    @XmlElementRef(name = "advino", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> advino;
    @XmlElementRef(name = "ipr", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfprofileCooperationIprInputType> ipr;
    @XmlElementRef(name = "iprcomments", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iprcomments;
    @XmlElementRef(name = "partner", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileCooperationPartnerInputType> partner;
    @XmlElementRef(name = "profileorigin", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileOriginInputType> profileorigin;
    @XmlElementRef(name = "stagedev", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileCooperationStagedevInputType> stagedev;
    @XmlElementRef(name = "stagedevcomments", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stagedevcomments;
    @XmlElementRef(name = "techspec", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> techspec;

    /**
     * Gets the value of the advino property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdvino() {
        return advino;
    }

    /**
     * Sets the value of the advino property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdvino(JAXBElement<String> value) {
        this.advino = value;
    }

    /**
     * Gets the value of the ipr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfprofileCooperationIprInputType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfprofileCooperationIprInputType> getIpr() {
        return ipr;
    }

    /**
     * Sets the value of the ipr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfprofileCooperationIprInputType }{@code >}
     *     
     */
    public void setIpr(JAXBElement<ArrayOfprofileCooperationIprInputType> value) {
        this.ipr = value;
    }

    /**
     * Gets the value of the iprcomments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIprcomments() {
        return iprcomments;
    }

    /**
     * Sets the value of the iprcomments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIprcomments(JAXBElement<String> value) {
        this.iprcomments = value;
    }

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileCooperationPartnerInputType }{@code >}
     *     
     */
    public JAXBElement<ProfileCooperationPartnerInputType> getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileCooperationPartnerInputType }{@code >}
     *     
     */
    public void setPartner(JAXBElement<ProfileCooperationPartnerInputType> value) {
        this.partner = value;
    }

    /**
     * Gets the value of the profileorigin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileOriginInputType }{@code >}
     *     
     */
    public JAXBElement<ProfileOriginInputType> getProfileorigin() {
        return profileorigin;
    }

    /**
     * Sets the value of the profileorigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileOriginInputType }{@code >}
     *     
     */
    public void setProfileorigin(JAXBElement<ProfileOriginInputType> value) {
        this.profileorigin = value;
    }

    /**
     * Gets the value of the stagedev property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileCooperationStagedevInputType }{@code >}
     *     
     */
    public JAXBElement<ProfileCooperationStagedevInputType> getStagedev() {
        return stagedev;
    }

    /**
     * Sets the value of the stagedev property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileCooperationStagedevInputType }{@code >}
     *     
     */
    public void setStagedev(JAXBElement<ProfileCooperationStagedevInputType> value) {
        this.stagedev = value;
    }

    /**
     * Gets the value of the stagedevcomments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStagedevcomments() {
        return stagedevcomments;
    }

    /**
     * Sets the value of the stagedevcomments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStagedevcomments(JAXBElement<String> value) {
        this.stagedevcomments = value;
    }

    /**
     * Gets the value of the techspec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTechspec() {
        return techspec;
    }

    /**
     * Sets the value of the techspec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTechspec(JAXBElement<String> value) {
        this.techspec = value;
    }

}
