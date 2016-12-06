
package org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profileCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profileCompany"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certifications" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}ArrayOfcertification" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileCompanyCountry" minOccurs="0"/&gt;
 *         &lt;element name="experience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="languages" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}ArrayOflanguage" minOccurs="0"/&gt;
 *         &lt;element name="since" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transnational" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="turnover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profileCompany", propOrder = {
    "certifications",
    "country",
    "experience",
    "kind",
    "languages",
    "since",
    "transnational",
    "turnover"
})
public class ProfileCompanyType {

    @XmlElementRef(name = "certifications", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfcertificationType> certifications;
    @XmlElementRef(name = "country", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileCompanyCountryType> country;
    @XmlElementRef(name = "experience", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> experience;
    @XmlElementRef(name = "kind", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kind;
    @XmlElementRef(name = "languages", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflanguageType> languages;
    @XmlElementRef(name = "since", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> since;
    @XmlElementRef(name = "transnational", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> transnational;
    @XmlElementRef(name = "turnover", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> turnover;

    /**
     * Gets the value of the certifications property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfcertificationType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfcertificationType> getCertifications() {
        return certifications;
    }

    /**
     * Sets the value of the certifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfcertificationType }{@code >}
     *     
     */
    public void setCertifications(JAXBElement<ArrayOfcertificationType> value) {
        this.certifications = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileCompanyCountryType }{@code >}
     *     
     */
    public JAXBElement<ProfileCompanyCountryType> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileCompanyCountryType }{@code >}
     *     
     */
    public void setCountry(JAXBElement<ProfileCompanyCountryType> value) {
        this.country = value;
    }

    /**
     * Gets the value of the experience property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExperience() {
        return experience;
    }

    /**
     * Sets the value of the experience property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExperience(JAXBElement<String> value) {
        this.experience = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKind(JAXBElement<String> value) {
        this.kind = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflanguageType }{@code >}
     *     
     */
    public JAXBElement<ArrayOflanguageType> getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflanguageType }{@code >}
     *     
     */
    public void setLanguages(JAXBElement<ArrayOflanguageType> value) {
        this.languages = value;
    }

    /**
     * Gets the value of the since property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSince() {
        return since;
    }

    /**
     * Sets the value of the since property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSince(JAXBElement<String> value) {
        this.since = value;
    }

    /**
     * Gets the value of the transnational property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTransnational() {
        return transnational;
    }

    /**
     * Sets the value of the transnational property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTransnational(JAXBElement<Boolean> value) {
        this.transnational = value;
    }

    /**
     * Gets the value of the turnover property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTurnover() {
        return turnover;
    }

    /**
     * Sets the value of the turnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTurnover(JAXBElement<String> value) {
        this.turnover = value;
    }

}
