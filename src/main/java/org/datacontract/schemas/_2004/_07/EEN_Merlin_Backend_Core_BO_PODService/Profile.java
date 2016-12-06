
package org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003_10.Serialization.Arrays.ArrayOfstring;


/**
 * <p>Java class for profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="company" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileCompany" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileContact" minOccurs="0"/&gt;
 *         &lt;element name="content" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileContent" minOccurs="0"/&gt;
 *         &lt;element name="cooperation" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileCooperation" minOccurs="0"/&gt;
 *         &lt;element name="customprops" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileCustomprops" minOccurs="0"/&gt;
 *         &lt;element name="datum" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileDatum" minOccurs="0"/&gt;
 *         &lt;element name="dissemination" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileDissemination" minOccurs="0"/&gt;
 *         &lt;element name="eoi" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileEoi" minOccurs="0"/&gt;
 *         &lt;element name="files" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}ArrayOfprofileFile" minOccurs="0"/&gt;
 *         &lt;element name="keyword" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileKeyword" minOccurs="0"/&gt;
 *         &lt;element name="partnerships" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="program" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileProgram" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profile", propOrder = {
    "company",
    "contact",
    "content",
    "cooperation",
    "customprops",
    "datum",
    "dissemination",
    "eoi",
    "files",
    "keyword",
    "partnerships",
    "program",
    "reference"
})
public class Profile {

    @XmlElementRef(name = "company", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileCompanyType> company;
    @XmlElementRef(name = "contact", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileContactType> contact;
    @XmlElementRef(name = "content", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileContentType> content;
    @XmlElementRef(name = "cooperation", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileCooperationType> cooperation;
    @XmlElementRef(name = "customprops", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileCustompropsType> customprops;
    @XmlElementRef(name = "datum", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileDatum> datum;
    @XmlElementRef(name = "dissemination", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileDissemination> dissemination;
    @XmlElementRef(name = "eoi", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileEoiType> eoi;
    @XmlElementRef(name = "files", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfprofileFileType> files;
    @XmlElementRef(name = "keyword", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileKeywordType> keyword;
    @XmlElementRef(name = "partnerships", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> partnerships;
    @XmlElementRef(name = "program", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileProgramType> program;
    @XmlElementRef(name = "reference", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileReference> reference;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileCompanyType }{@code >}
     *     
     */
    public JAXBElement<ProfileCompanyType> getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileCompanyType }{@code >}
     *     
     */
    public void setCompany(JAXBElement<ProfileCompanyType> value) {
        this.company = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileContactType }{@code >}
     *     
     */
    public JAXBElement<ProfileContactType> getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileContactType }{@code >}
     *     
     */
    public void setContact(JAXBElement<ProfileContactType> value) {
        this.contact = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileContentType }{@code >}
     *     
     */
    public JAXBElement<ProfileContentType> getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileContentType }{@code >}
     *     
     */
    public void setContent(JAXBElement<ProfileContentType> value) {
        this.content = value;
    }

    /**
     * Gets the value of the cooperation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileCooperationType }{@code >}
     *     
     */
    public JAXBElement<ProfileCooperationType> getCooperation() {
        return cooperation;
    }

    /**
     * Sets the value of the cooperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileCooperationType }{@code >}
     *     
     */
    public void setCooperation(JAXBElement<ProfileCooperationType> value) {
        this.cooperation = value;
    }

    /**
     * Gets the value of the customprops property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileCustompropsType }{@code >}
     *     
     */
    public JAXBElement<ProfileCustompropsType> getCustomprops() {
        return customprops;
    }

    /**
     * Sets the value of the customprops property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileCustompropsType }{@code >}
     *     
     */
    public void setCustomprops(JAXBElement<ProfileCustompropsType> value) {
        this.customprops = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileDatum }{@code >}
     *     
     */
    public JAXBElement<ProfileDatum> getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileDatum }{@code >}
     *     
     */
    public void setDatum(JAXBElement<ProfileDatum> value) {
        this.datum = value;
    }

    /**
     * Gets the value of the dissemination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileDissemination }{@code >}
     *     
     */
    public JAXBElement<ProfileDissemination> getDissemination() {
        return dissemination;
    }

    /**
     * Sets the value of the dissemination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileDissemination }{@code >}
     *     
     */
    public void setDissemination(JAXBElement<ProfileDissemination> value) {
        this.dissemination = value;
    }

    /**
     * Gets the value of the eoi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileEoiType }{@code >}
     *     
     */
    public JAXBElement<ProfileEoiType> getEoi() {
        return eoi;
    }

    /**
     * Sets the value of the eoi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileEoiType }{@code >}
     *     
     */
    public void setEoi(JAXBElement<ProfileEoiType> value) {
        this.eoi = value;
    }

    /**
     * Gets the value of the files property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfprofileFileType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfprofileFileType> getFiles() {
        return files;
    }

    /**
     * Sets the value of the files property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfprofileFileType }{@code >}
     *     
     */
    public void setFiles(JAXBElement<ArrayOfprofileFileType> value) {
        this.files = value;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileKeywordType }{@code >}
     *     
     */
    public JAXBElement<ProfileKeywordType> getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileKeywordType }{@code >}
     *     
     */
    public void setKeyword(JAXBElement<ProfileKeywordType> value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the partnerships property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getPartnerships() {
        return partnerships;
    }

    /**
     * Sets the value of the partnerships property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setPartnerships(JAXBElement<ArrayOfstring> value) {
        this.partnerships = value;
    }

    /**
     * Gets the value of the program property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileProgramType }{@code >}
     *     
     */
    public JAXBElement<ProfileProgramType> getProgram() {
        return program;
    }

    /**
     * Sets the value of the program property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileProgramType }{@code >}
     *     
     */
    public void setProgram(JAXBElement<ProfileProgramType> value) {
        this.program = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileReference }{@code >}
     *     
     */
    public JAXBElement<ProfileReference> getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileReference }{@code >}
     *     
     */
    public void setReference(JAXBElement<ProfileReference> value) {
        this.reference = value;
    }
}
