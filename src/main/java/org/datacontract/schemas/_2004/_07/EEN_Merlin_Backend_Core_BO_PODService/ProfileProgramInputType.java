
package org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for profileProgramInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profileProgramInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acronym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="call" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coordinator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="evaluation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="framework" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileFrameworkProgram" minOccurs="0"/&gt;
 *         &lt;element name="funding" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileFundingScheme" minOccurs="0"/&gt;
 *         &lt;element name="prebudget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profileProgramInput", propOrder = {
    "acronym",
    "call",
    "coordinator",
    "deadline",
    "duration",
    "evaluation",
    "framework",
    "funding",
    "prebudget",
    "url"
})
public class ProfileProgramInputType {

    @XmlElementRef(name = "acronym", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acronym;
    @XmlElementRef(name = "call", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> call;
    @XmlElementRef(name = "coordinator", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> coordinator;
    @XmlElementRef(name = "deadline", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> deadline;
    protected Integer duration;
    @XmlElementRef(name = "evaluation", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evaluation;
    @XmlElementRef(name = "framework", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileFrameworkProgramType> framework;
    @XmlElementRef(name = "funding", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileFundingSchemeType> funding;
    @XmlElementRef(name = "prebudget", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prebudget;
    @XmlElementRef(name = "url", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> url;

    /**
     * Gets the value of the acronym property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcronym() {
        return acronym;
    }

    /**
     * Sets the value of the acronym property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcronym(JAXBElement<String> value) {
        this.acronym = value;
    }

    /**
     * Gets the value of the call property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCall() {
        return call;
    }

    /**
     * Sets the value of the call property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCall(JAXBElement<String> value) {
        this.call = value;
    }

    /**
     * Gets the value of the coordinator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCoordinator() {
        return coordinator;
    }

    /**
     * Sets the value of the coordinator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCoordinator(JAXBElement<Boolean> value) {
        this.coordinator = value;
    }

    /**
     * Gets the value of the deadline property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDeadline() {
        return deadline;
    }

    /**
     * Sets the value of the deadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDeadline(JAXBElement<XMLGregorianCalendar> value) {
        this.deadline = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the evaluation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvaluation() {
        return evaluation;
    }

    /**
     * Sets the value of the evaluation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvaluation(JAXBElement<String> value) {
        this.evaluation = value;
    }

    /**
     * Gets the value of the framework property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileFrameworkProgramType }{@code >}
     *     
     */
    public JAXBElement<ProfileFrameworkProgramType> getFramework() {
        return framework;
    }

    /**
     * Sets the value of the framework property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileFrameworkProgramType }{@code >}
     *     
     */
    public void setFramework(JAXBElement<ProfileFrameworkProgramType> value) {
        this.framework = value;
    }

    /**
     * Gets the value of the funding property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileFundingSchemeType }{@code >}
     *     
     */
    public JAXBElement<ProfileFundingSchemeType> getFunding() {
        return funding;
    }

    /**
     * Sets the value of the funding property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileFundingSchemeType }{@code >}
     *     
     */
    public void setFunding(JAXBElement<ProfileFundingSchemeType> value) {
        this.funding = value;
    }

    /**
     * Gets the value of the prebudget property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrebudget() {
        return prebudget;
    }

    /**
     * Sets the value of the prebudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrebudget(JAXBElement<String> value) {
        this.prebudget = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrl(JAXBElement<String> value) {
        this.url = value;
    }

}
