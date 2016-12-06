
package org.datacontract.schemas._2004._07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventKeywordNace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventKeywordNace"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="keyField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="labelField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventKeywordNace", propOrder = {
    "keyField",
    "labelField"
})
public class EventKeywordNace {

    @XmlElement(required = true, nillable = true)
    protected String keyField;
    @XmlElement(required = true, nillable = true)
    protected String labelField;

    /**
     * Gets the value of the keyField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyField() {
        return keyField;
    }

    /**
     * Sets the value of the keyField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyField(String value) {
        this.keyField = value;
    }

    /**
     * Gets the value of the labelField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelField() {
        return labelField;
    }

    /**
     * Sets the value of the labelField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelField(String value) {
        this.labelField = value;
    }

}
