
package org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profileInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profileInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="company" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileCompanyInput" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileContactInput" minOccurs="0"/&gt;
 *         &lt;element name="content" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileContentInput" minOccurs="0"/&gt;
 *         &lt;element name="cooperation" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileCooperationInput" minOccurs="0"/&gt;
 *         &lt;element name="dissemination" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileDisseminationInput" minOccurs="0"/&gt;
 *         &lt;element name="eoi" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileEoiInput" minOccurs="0"/&gt;
 *         &lt;element name="files" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}ArrayOfprofileFileInput" minOccurs="0"/&gt;
 *         &lt;element name="keyword" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileKeywordInput" minOccurs="0"/&gt;
 *         &lt;element name="program" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileProgramInput" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileReferenceInput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profileInput", propOrder = {
    "company",
    "contact",
    "content",
    "cooperation",
    "dissemination",
    "eoi",
    "files",
    "keyword",
    "program",
    "reference"
})
public class ProfileInputType {

    @XmlElementRef(name = "company", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileCompanyInputType> company;
    @XmlElementRef(name = "contact", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileContactInputType> contact;
    @XmlElementRef(name = "content", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileContentInputType> content;
    @XmlElementRef(name = "cooperation", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileCooperationInputType> cooperation;
    @XmlElementRef(name = "dissemination", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileDisseminationInputType> dissemination;
    @XmlElementRef(name = "eoi", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileEoiInputType> eoi;
    @XmlElementRef(name = "files", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfprofileFileInputType> files;
    @XmlElementRef(name = "keyword", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileKeywordInputType> keyword;
    @XmlElementRef(name = "program", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileProgramInputType> program;
    @XmlElementRef(name = "reference", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileReferenceInputType> reference;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileCompanyInputType }{@code >}
     *     
     */
    public JAXBElement<ProfileCompanyInputType> getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileCompanyInputType }{@code >}
     *     
     */
    public void setCompany(JAXBElement<ProfileCompanyInputType> value) {
        this.company = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileContactInputType }{@code >}
     *     
     */
    public JAXBElement<ProfileContactInputType> getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileContactInputType }{@code >}
     *     
     */
    public void setContact(JAXBElement<ProfileContactInputType> value) {
        this.contact = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileContentInputType }{@code >}
     *     
     */
    public JAXBElement<ProfileContentInputType> getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileContentInputType }{@code >}
     *     
     */
    public void setContent(JAXBElement<ProfileContentInputType> value) {
        this.content = value;
    }

    /**
     * Gets the value of the cooperation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileCooperationInputType }{@code >}
     *     
     */
    public JAXBElement<ProfileCooperationInputType> getCooperation() {
        return cooperation;
    }

    /**
     * Sets the value of the cooperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileCooperationInputType }{@code >}
     *     
     */
    public void setCooperation(JAXBElement<ProfileCooperationInputType> value) {
        this.cooperation = value;
    }

    /**
     * Gets the value of the dissemination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileDisseminationInputType }{@code >}
     *     
     */
    public JAXBElement<ProfileDisseminationInputType> getDissemination() {
        return dissemination;
    }

    /**
     * Sets the value of the dissemination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileDisseminationInputType }{@code >}
     *     
     */
    public void setDissemination(JAXBElement<ProfileDisseminationInputType> value) {
        this.dissemination = value;
    }

    /**
     * Gets the value of the eoi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileEoiInputType }{@code >}
     *     
     */
    public JAXBElement<ProfileEoiInputType> getEoi() {
        return eoi;
    }

    /**
     * Sets the value of the eoi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileEoiInputType }{@code >}
     *     
     */
    public void setEoi(JAXBElement<ProfileEoiInputType> value) {
        this.eoi = value;
    }

    /**
     * Gets the value of the files property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfprofileFileInputType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfprofileFileInputType> getFiles() {
        return files;
    }

    /**
     * Sets the value of the files property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfprofileFileInputType }{@code >}
     *     
     */
    public void setFiles(JAXBElement<ArrayOfprofileFileInputType> value) {
        this.files = value;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileKeywordInputType }{@code >}
     *     
     */
    public JAXBElement<ProfileKeywordInputType> getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileKeywordInputType }{@code >}
     *     
     */
    public void setKeyword(JAXBElement<ProfileKeywordInputType> value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the program property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileProgramInputType }{@code >}
     *     
     */
    public JAXBElement<ProfileProgramInputType> getProgram() {
        return program;
    }

    /**
     * Sets the value of the program property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileProgramInputType }{@code >}
     *     
     */
    public void setProgram(JAXBElement<ProfileProgramInputType> value) {
        this.program = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileReferenceInputType }{@code >}
     *     
     */
    public JAXBElement<ProfileReferenceInputType> getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileReferenceInputType }{@code >}
     *     
     */
    public void setReference(JAXBElement<ProfileReferenceInputType> value) {
        this.reference = value;
    }

}
