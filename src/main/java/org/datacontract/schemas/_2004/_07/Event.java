
package org.datacontract.schemas._2004._07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003_10.Serialization.Arrays.ArrayOfstring;


/**
 * <p>Java class for event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="event"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activateTheFacilityField" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="cityField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contactAttributesField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contactEmailField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contactFaxField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contactNameField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contactTelephoneField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="coorganisersField" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/&gt;
 *         &lt;element name="countryField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="countryISOField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="createdField" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="deadlineForRegisteringField" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="descriptionField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ecProgrammesField" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/&gt;
 *         &lt;element name="eventClosingDateField" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="eventEndDateField" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="eventStartDateField" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="eventStatusField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eventStyleField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eventTitleField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eventTypeField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hostOrganisationField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hotelWebPageField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="industrialSectorsField" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/&gt;
 *         &lt;element name="keywordField" type="{http://schemas.datacontract.org/2004/07/}eventKeyword"/&gt;
 *         &lt;element name="locationContactEmailField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locationContactFaxField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locationContactNameField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locationContactTelephoneField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locationDetailsCityField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locationDetailsContactFaxField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locationDetailsContactTelephoneField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locationDetailsCountryField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locationDetailsEventAddressField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locationDetailsNameField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locationDetailsWebPageField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nameOfEENPartnerField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nonEnterpriseEuropeNetworkOrganiserField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="otherPartnersInvolvedField" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/&gt;
 *         &lt;element name="preliminarytextField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sectorGroupsField" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/&gt;
 *         &lt;element name="statusField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="updatedField" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "event", propOrder = {
    "activateTheFacilityField",
    "cityField",
    "contactAttributesField",
    "contactEmailField",
    "contactFaxField",
    "contactNameField",
    "contactTelephoneField",
    "coorganisersField",
    "countryField",
    "countryISOField",
    "createdField",
    "deadlineForRegisteringField",
    "descriptionField",
    "ecProgrammesField",
    "eventClosingDateField",
    "eventEndDateField",
    "eventStartDateField",
    "eventStatusField",
    "eventStyleField",
    "eventTitleField",
    "eventTypeField",
    "hostOrganisationField",
    "hotelWebPageField",
    "idField",
    "industrialSectorsField",
    "keywordField",
    "locationContactEmailField",
    "locationContactFaxField",
    "locationContactNameField",
    "locationContactTelephoneField",
    "locationDetailsCityField",
    "locationDetailsContactFaxField",
    "locationDetailsContactTelephoneField",
    "locationDetailsCountryField",
    "locationDetailsEventAddressField",
    "locationDetailsNameField",
    "locationDetailsWebPageField",
    "nameOfEENPartnerField",
    "nonEnterpriseEuropeNetworkOrganiserField",
    "otherPartnersInvolvedField",
    "preliminarytextField",
    "sectorGroupsField",
    "statusField",
    "updatedField"
})
public class Event {

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean activateTheFacilityField;
    @XmlElement(required = true, nillable = true)
    protected String cityField;
    @XmlElement(required = true, nillable = true)
    protected String contactAttributesField;
    @XmlElement(required = true, nillable = true)
    protected String contactEmailField;
    @XmlElement(required = true, nillable = true)
    protected String contactFaxField;
    @XmlElement(required = true, nillable = true)
    protected String contactNameField;
    @XmlElement(required = true, nillable = true)
    protected String contactTelephoneField;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfstring coorganisersField;
    @XmlElement(required = true, nillable = true)
    protected String countryField;
    @XmlElement(required = true, nillable = true)
    protected String countryISOField;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdField;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deadlineForRegisteringField;
    @XmlElement(required = true, nillable = true)
    protected String descriptionField;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfstring ecProgrammesField;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventClosingDateField;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventEndDateField;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventStartDateField;
    @XmlElement(required = true, nillable = true)
    protected String eventStatusField;
    @XmlElement(required = true, nillable = true)
    protected String eventStyleField;
    @XmlElement(required = true, nillable = true)
    protected String eventTitleField;
    @XmlElement(required = true, nillable = true)
    protected String eventTypeField;
    @XmlElement(required = true, nillable = true)
    protected String hostOrganisationField;
    @XmlElement(required = true, nillable = true)
    protected String hotelWebPageField;
    @XmlElement(required = true, nillable = true)
    protected String idField;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfstring industrialSectorsField;
    @XmlElement(required = true, nillable = true)
    protected EventKeyword keywordField;
    @XmlElement(required = true, nillable = true)
    protected String locationContactEmailField;
    @XmlElement(required = true, nillable = true)
    protected String locationContactFaxField;
    @XmlElement(required = true, nillable = true)
    protected String locationContactNameField;
    @XmlElement(required = true, nillable = true)
    protected String locationContactTelephoneField;
    @XmlElement(required = true, nillable = true)
    protected String locationDetailsCityField;
    @XmlElement(required = true, nillable = true)
    protected String locationDetailsContactFaxField;
    @XmlElement(required = true, nillable = true)
    protected String locationDetailsContactTelephoneField;
    @XmlElement(required = true, nillable = true)
    protected String locationDetailsCountryField;
    @XmlElement(required = true, nillable = true)
    protected String locationDetailsEventAddressField;
    @XmlElement(required = true, nillable = true)
    protected String locationDetailsNameField;
    @XmlElement(required = true, nillable = true)
    protected String locationDetailsWebPageField;
    @XmlElement(required = true, nillable = true)
    protected String nameOfEENPartnerField;
    @XmlElement(required = true, nillable = true)
    protected String nonEnterpriseEuropeNetworkOrganiserField;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfstring otherPartnersInvolvedField;
    @XmlElement(required = true, nillable = true)
    protected String preliminarytextField;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfstring sectorGroupsField;
    @XmlElement(required = true, nillable = true)
    protected String statusField;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedField;

    /**
     * Gets the value of the activateTheFacilityField property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActivateTheFacilityField() {
        return activateTheFacilityField;
    }

    /**
     * Sets the value of the activateTheFacilityField property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActivateTheFacilityField(Boolean value) {
        this.activateTheFacilityField = value;
    }

    /**
     * Gets the value of the cityField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityField() {
        return cityField;
    }

    /**
     * Sets the value of the cityField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityField(String value) {
        this.cityField = value;
    }

    /**
     * Gets the value of the contactAttributesField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAttributesField() {
        return contactAttributesField;
    }

    /**
     * Sets the value of the contactAttributesField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAttributesField(String value) {
        this.contactAttributesField = value;
    }

    /**
     * Gets the value of the contactEmailField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmailField() {
        return contactEmailField;
    }

    /**
     * Sets the value of the contactEmailField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmailField(String value) {
        this.contactEmailField = value;
    }

    /**
     * Gets the value of the contactFaxField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFaxField() {
        return contactFaxField;
    }

    /**
     * Sets the value of the contactFaxField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFaxField(String value) {
        this.contactFaxField = value;
    }

    /**
     * Gets the value of the contactNameField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNameField() {
        return contactNameField;
    }

    /**
     * Sets the value of the contactNameField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNameField(String value) {
        this.contactNameField = value;
    }

    /**
     * Gets the value of the contactTelephoneField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTelephoneField() {
        return contactTelephoneField;
    }

    /**
     * Sets the value of the contactTelephoneField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTelephoneField(String value) {
        this.contactTelephoneField = value;
    }

    /**
     * Gets the value of the coorganisersField property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getCoorganisersField() {
        return coorganisersField;
    }

    /**
     * Sets the value of the coorganisersField property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setCoorganisersField(ArrayOfstring value) {
        this.coorganisersField = value;
    }

    /**
     * Gets the value of the countryField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryField() {
        return countryField;
    }

    /**
     * Sets the value of the countryField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryField(String value) {
        this.countryField = value;
    }

    /**
     * Gets the value of the countryISOField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISOField() {
        return countryISOField;
    }

    /**
     * Sets the value of the countryISOField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISOField(String value) {
        this.countryISOField = value;
    }

    /**
     * Gets the value of the createdField property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedField() {
        return createdField;
    }

    /**
     * Sets the value of the createdField property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedField(XMLGregorianCalendar value) {
        this.createdField = value;
    }

    /**
     * Gets the value of the deadlineForRegisteringField property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeadlineForRegisteringField() {
        return deadlineForRegisteringField;
    }

    /**
     * Sets the value of the deadlineForRegisteringField property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeadlineForRegisteringField(XMLGregorianCalendar value) {
        this.deadlineForRegisteringField = value;
    }

    /**
     * Gets the value of the descriptionField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionField() {
        return descriptionField;
    }

    /**
     * Sets the value of the descriptionField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionField(String value) {
        this.descriptionField = value;
    }

    /**
     * Gets the value of the ecProgrammesField property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getEcProgrammesField() {
        return ecProgrammesField;
    }

    /**
     * Sets the value of the ecProgrammesField property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setEcProgrammesField(ArrayOfstring value) {
        this.ecProgrammesField = value;
    }

    /**
     * Gets the value of the eventClosingDateField property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventClosingDateField() {
        return eventClosingDateField;
    }

    /**
     * Sets the value of the eventClosingDateField property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventClosingDateField(XMLGregorianCalendar value) {
        this.eventClosingDateField = value;
    }

    /**
     * Gets the value of the eventEndDateField property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventEndDateField() {
        return eventEndDateField;
    }

    /**
     * Sets the value of the eventEndDateField property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventEndDateField(XMLGregorianCalendar value) {
        this.eventEndDateField = value;
    }

    /**
     * Gets the value of the eventStartDateField property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventStartDateField() {
        return eventStartDateField;
    }

    /**
     * Sets the value of the eventStartDateField property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventStartDateField(XMLGregorianCalendar value) {
        this.eventStartDateField = value;
    }

    /**
     * Gets the value of the eventStatusField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventStatusField() {
        return eventStatusField;
    }

    /**
     * Sets the value of the eventStatusField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventStatusField(String value) {
        this.eventStatusField = value;
    }

    /**
     * Gets the value of the eventStyleField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventStyleField() {
        return eventStyleField;
    }

    /**
     * Sets the value of the eventStyleField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventStyleField(String value) {
        this.eventStyleField = value;
    }

    /**
     * Gets the value of the eventTitleField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTitleField() {
        return eventTitleField;
    }

    /**
     * Sets the value of the eventTitleField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTitleField(String value) {
        this.eventTitleField = value;
    }

    /**
     * Gets the value of the eventTypeField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTypeField() {
        return eventTypeField;
    }

    /**
     * Sets the value of the eventTypeField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTypeField(String value) {
        this.eventTypeField = value;
    }

    /**
     * Gets the value of the hostOrganisationField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostOrganisationField() {
        return hostOrganisationField;
    }

    /**
     * Sets the value of the hostOrganisationField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostOrganisationField(String value) {
        this.hostOrganisationField = value;
    }

    /**
     * Gets the value of the hotelWebPageField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelWebPageField() {
        return hotelWebPageField;
    }

    /**
     * Sets the value of the hotelWebPageField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelWebPageField(String value) {
        this.hotelWebPageField = value;
    }

    /**
     * Gets the value of the idField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdField() {
        return idField;
    }

    /**
     * Sets the value of the idField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdField(String value) {
        this.idField = value;
    }

    /**
     * Gets the value of the industrialSectorsField property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getIndustrialSectorsField() {
        return industrialSectorsField;
    }

    /**
     * Sets the value of the industrialSectorsField property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setIndustrialSectorsField(ArrayOfstring value) {
        this.industrialSectorsField = value;
    }

    /**
     * Gets the value of the keywordField property.
     * 
     * @return
     *     possible object is
     *     {@link EventKeyword }
     *     
     */
    public EventKeyword getKeywordField() {
        return keywordField;
    }

    /**
     * Sets the value of the keywordField property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventKeyword }
     *     
     */
    public void setKeywordField(EventKeyword value) {
        this.keywordField = value;
    }

    /**
     * Gets the value of the locationContactEmailField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationContactEmailField() {
        return locationContactEmailField;
    }

    /**
     * Sets the value of the locationContactEmailField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationContactEmailField(String value) {
        this.locationContactEmailField = value;
    }

    /**
     * Gets the value of the locationContactFaxField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationContactFaxField() {
        return locationContactFaxField;
    }

    /**
     * Sets the value of the locationContactFaxField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationContactFaxField(String value) {
        this.locationContactFaxField = value;
    }

    /**
     * Gets the value of the locationContactNameField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationContactNameField() {
        return locationContactNameField;
    }

    /**
     * Sets the value of the locationContactNameField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationContactNameField(String value) {
        this.locationContactNameField = value;
    }

    /**
     * Gets the value of the locationContactTelephoneField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationContactTelephoneField() {
        return locationContactTelephoneField;
    }

    /**
     * Sets the value of the locationContactTelephoneField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationContactTelephoneField(String value) {
        this.locationContactTelephoneField = value;
    }

    /**
     * Gets the value of the locationDetailsCityField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDetailsCityField() {
        return locationDetailsCityField;
    }

    /**
     * Sets the value of the locationDetailsCityField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDetailsCityField(String value) {
        this.locationDetailsCityField = value;
    }

    /**
     * Gets the value of the locationDetailsContactFaxField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDetailsContactFaxField() {
        return locationDetailsContactFaxField;
    }

    /**
     * Sets the value of the locationDetailsContactFaxField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDetailsContactFaxField(String value) {
        this.locationDetailsContactFaxField = value;
    }

    /**
     * Gets the value of the locationDetailsContactTelephoneField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDetailsContactTelephoneField() {
        return locationDetailsContactTelephoneField;
    }

    /**
     * Sets the value of the locationDetailsContactTelephoneField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDetailsContactTelephoneField(String value) {
        this.locationDetailsContactTelephoneField = value;
    }

    /**
     * Gets the value of the locationDetailsCountryField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDetailsCountryField() {
        return locationDetailsCountryField;
    }

    /**
     * Sets the value of the locationDetailsCountryField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDetailsCountryField(String value) {
        this.locationDetailsCountryField = value;
    }

    /**
     * Gets the value of the locationDetailsEventAddressField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDetailsEventAddressField() {
        return locationDetailsEventAddressField;
    }

    /**
     * Sets the value of the locationDetailsEventAddressField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDetailsEventAddressField(String value) {
        this.locationDetailsEventAddressField = value;
    }

    /**
     * Gets the value of the locationDetailsNameField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDetailsNameField() {
        return locationDetailsNameField;
    }

    /**
     * Sets the value of the locationDetailsNameField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDetailsNameField(String value) {
        this.locationDetailsNameField = value;
    }

    /**
     * Gets the value of the locationDetailsWebPageField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDetailsWebPageField() {
        return locationDetailsWebPageField;
    }

    /**
     * Sets the value of the locationDetailsWebPageField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDetailsWebPageField(String value) {
        this.locationDetailsWebPageField = value;
    }

    /**
     * Gets the value of the nameOfEENPartnerField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfEENPartnerField() {
        return nameOfEENPartnerField;
    }

    /**
     * Sets the value of the nameOfEENPartnerField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfEENPartnerField(String value) {
        this.nameOfEENPartnerField = value;
    }

    /**
     * Gets the value of the nonEnterpriseEuropeNetworkOrganiserField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonEnterpriseEuropeNetworkOrganiserField() {
        return nonEnterpriseEuropeNetworkOrganiserField;
    }

    /**
     * Sets the value of the nonEnterpriseEuropeNetworkOrganiserField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonEnterpriseEuropeNetworkOrganiserField(String value) {
        this.nonEnterpriseEuropeNetworkOrganiserField = value;
    }

    /**
     * Gets the value of the otherPartnersInvolvedField property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getOtherPartnersInvolvedField() {
        return otherPartnersInvolvedField;
    }

    /**
     * Sets the value of the otherPartnersInvolvedField property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setOtherPartnersInvolvedField(ArrayOfstring value) {
        this.otherPartnersInvolvedField = value;
    }

    /**
     * Gets the value of the preliminarytextField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreliminarytextField() {
        return preliminarytextField;
    }

    /**
     * Sets the value of the preliminarytextField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreliminarytextField(String value) {
        this.preliminarytextField = value;
    }

    /**
     * Gets the value of the sectorGroupsField property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getSectorGroupsField() {
        return sectorGroupsField;
    }

    /**
     * Sets the value of the sectorGroupsField property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setSectorGroupsField(ArrayOfstring value) {
        this.sectorGroupsField = value;
    }

    /**
     * Gets the value of the statusField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusField() {
        return statusField;
    }

    /**
     * Sets the value of the statusField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusField(String value) {
        this.statusField = value;
    }

    /**
     * Gets the value of the updatedField property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedField() {
        return updatedField;
    }

    /**
     * Sets the value of the updatedField property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedField(XMLGregorianCalendar value) {
        this.updatedField = value;
    }

}
