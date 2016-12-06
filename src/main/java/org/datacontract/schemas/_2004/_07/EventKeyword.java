
package org.datacontract.schemas._2004._07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventKeyword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventKeyword"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="marketsField" type="{http://schemas.datacontract.org/2004/07/}ArrayOfeventKeywordMarket"/&gt;
 *         &lt;element name="nacesField" type="{http://schemas.datacontract.org/2004/07/}ArrayOfeventKeywordNace"/&gt;
 *         &lt;element name="technologiesField" type="{http://schemas.datacontract.org/2004/07/}ArrayOfeventKeywordTechnology"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventKeyword", propOrder = {
    "marketsField",
    "nacesField",
    "technologiesField"
})
public class EventKeyword {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfeventKeywordMarket marketsField;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfeventKeywordNace nacesField;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfeventKeywordTechnology technologiesField;

    /**
     * Gets the value of the marketsField property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfeventKeywordMarket }
     *     
     */
    public ArrayOfeventKeywordMarket getMarketsField() {
        return marketsField;
    }

    /**
     * Sets the value of the marketsField property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfeventKeywordMarket }
     *     
     */
    public void setMarketsField(ArrayOfeventKeywordMarket value) {
        this.marketsField = value;
    }

    /**
     * Gets the value of the nacesField property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfeventKeywordNace }
     *     
     */
    public ArrayOfeventKeywordNace getNacesField() {
        return nacesField;
    }

    /**
     * Sets the value of the nacesField property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfeventKeywordNace }
     *     
     */
    public void setNacesField(ArrayOfeventKeywordNace value) {
        this.nacesField = value;
    }

    /**
     * Gets the value of the technologiesField property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfeventKeywordTechnology }
     *     
     */
    public ArrayOfeventKeywordTechnology getTechnologiesField() {
        return technologiesField;
    }

    /**
     * Sets the value of the technologiesField property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfeventKeywordTechnology }
     *     
     */
    public void setTechnologiesField(ArrayOfeventKeywordTechnology value) {
        this.technologiesField = value;
    }

}
