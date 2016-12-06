
package org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfprofileCustompropsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfprofileCustompropsItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="profileCustompropsItem" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileCustompropsItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfprofileCustompropsItem", propOrder = {
    "profileCustompropsItem"
})
public class ArrayOfprofileCustompropsItemType {

    @XmlElement(nillable = true)
    protected List<ProfileCustompropsItemType> profileCustompropsItem;

    /**
     * Gets the value of the profileCustompropsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileCustompropsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileCustompropsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileCustompropsItemType }
     * 
     * 
     */
    public List<ProfileCustompropsItemType> getProfileCustompropsItem() {
        if (profileCustompropsItem == null) {
            profileCustompropsItem = new ArrayList<ProfileCustompropsItemType>();
        }
        return this.profileCustompropsItem;
    }

}
