
package org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profileCooperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profileCooperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exploitations" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileCooperationExploitations" minOccurs="0"/&gt;
 *         &lt;element name="ipr" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileCooperationIpr" minOccurs="0"/&gt;
 *         &lt;element name="partner" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileCooperationPartner" minOccurs="0"/&gt;
 *         &lt;element name="plusvalue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stagedev" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileCooperationStagedev" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profileCooperation", propOrder = {
    "exploitations",
    "ipr",
    "partner",
    "plusvalue",
    "stagedev"
})
public class ProfileCooperationType {

    @XmlElementRef(name = "exploitations", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileCooperationExploitationsType> exploitations;
    @XmlElementRef(name = "ipr", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileCooperationIprType> ipr;
    @XmlElementRef(name = "partner", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileCooperationPartnerType> partner;
    @XmlElementRef(name = "plusvalue", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> plusvalue;
    @XmlElementRef(name = "stagedev", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileCooperationStagedevType> stagedev;

    /**
     * Gets the value of the exploitations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileCooperationExploitationsType }{@code >}
     *     
     */
    public JAXBElement<ProfileCooperationExploitationsType> getExploitations() {
        return exploitations;
    }

    /**
     * Sets the value of the exploitations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileCooperationExploitationsType }{@code >}
     *     
     */
    public void setExploitations(JAXBElement<ProfileCooperationExploitationsType> value) {
        this.exploitations = value;
    }

    /**
     * Gets the value of the ipr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileCooperationIprType }{@code >}
     *     
     */
    public JAXBElement<ProfileCooperationIprType> getIpr() {
        return ipr;
    }

    /**
     * Sets the value of the ipr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileCooperationIprType }{@code >}
     *     
     */
    public void setIpr(JAXBElement<ProfileCooperationIprType> value) {
        this.ipr = value;
    }

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileCooperationPartnerType }{@code >}
     *     
     */
    public JAXBElement<ProfileCooperationPartnerType> getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileCooperationPartnerType }{@code >}
     *     
     */
    public void setPartner(JAXBElement<ProfileCooperationPartnerType> value) {
        this.partner = value;
    }

    /**
     * Gets the value of the plusvalue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlusvalue() {
        return plusvalue;
    }

    /**
     * Sets the value of the plusvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlusvalue(JAXBElement<String> value) {
        this.plusvalue = value;
    }

    /**
     * Gets the value of the stagedev property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileCooperationStagedevType }{@code >}
     *     
     */
    public JAXBElement<ProfileCooperationStagedevType> getStagedev() {
        return stagedev;
    }

    /**
     * Sets the value of the stagedev property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileCooperationStagedevType }{@code >}
     *     
     */
    public void setStagedev(JAXBElement<ProfileCooperationStagedevType> value) {
        this.stagedev = value;
    }

}
