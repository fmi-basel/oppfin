
package org.datacontract.schemas._2004._07;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfeventKeywordMarket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfeventKeywordMarket"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventKeywordMarket" type="{http://schemas.datacontract.org/2004/07/}eventKeywordMarket" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfeventKeywordMarket", propOrder = {
    "eventKeywordMarket"
})
public class ArrayOfeventKeywordMarket {

    @XmlElement(nillable = true)
    protected List<EventKeywordMarket> eventKeywordMarket;

    /**
     * Gets the value of the eventKeywordMarket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventKeywordMarket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventKeywordMarket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventKeywordMarket }
     * 
     * 
     */
    public List<EventKeywordMarket> getEventKeywordMarket() {
        if (eventKeywordMarket == null) {
            eventKeywordMarket = new ArrayList<EventKeywordMarket>();
        }
        return this.eventKeywordMarket;
    }

}
