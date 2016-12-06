
package org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profileCooperationPartnerInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profileCooperationPartnerInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partnershiptype" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}ArrayOfprofileCooperationPartnershipInput" minOccurs="0"/&gt;
 *         &lt;element name="sought" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="task" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}ArrayOfprofileCooperationTaskInput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profileCooperationPartnerInput", propOrder = {
    "partnershiptype",
    "sought",
    "task"
})
public class ProfileCooperationPartnerInputType {

    @XmlElementRef(name = "partnershiptype", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfprofileCooperationPartnershipInputType> partnershiptype;
    @XmlElementRef(name = "sought", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sought;
    @XmlElementRef(name = "task", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfprofileCooperationTaskInputType> task;

    /**
     * Gets the value of the partnershiptype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfprofileCooperationPartnershipInputType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfprofileCooperationPartnershipInputType> getPartnershiptype() {
        return partnershiptype;
    }

    /**
     * Sets the value of the partnershiptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfprofileCooperationPartnershipInputType }{@code >}
     *     
     */
    public void setPartnershiptype(JAXBElement<ArrayOfprofileCooperationPartnershipInputType> value) {
        this.partnershiptype = value;
    }

    /**
     * Gets the value of the sought property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSought() {
        return sought;
    }

    /**
     * Sets the value of the sought property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSought(JAXBElement<String> value) {
        this.sought = value;
    }

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfprofileCooperationTaskInputType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfprofileCooperationTaskInputType> getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfprofileCooperationTaskInputType }{@code >}
     *     
     */
    public void setTask(JAXBElement<ArrayOfprofileCooperationTaskInputType> value) {
        this.task = value;
    }

}
