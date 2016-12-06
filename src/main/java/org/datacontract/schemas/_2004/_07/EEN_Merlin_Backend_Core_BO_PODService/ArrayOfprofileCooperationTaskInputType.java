
package org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfprofileCooperationTaskInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfprofileCooperationTaskInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="profileCooperationTaskInput" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}profileCooperationTaskInput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfprofileCooperationTaskInput", propOrder = {
    "profileCooperationTaskInput"
})
public class ArrayOfprofileCooperationTaskInputType {

    @XmlElement(nillable = true)
    protected List<ProfileCooperationTaskInputType> profileCooperationTaskInput;

    /**
     * Gets the value of the profileCooperationTaskInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileCooperationTaskInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileCooperationTaskInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileCooperationTaskInputType }
     * 
     * 
     */
    public List<ProfileCooperationTaskInputType> getProfileCooperationTaskInput() {
        if (profileCooperationTaskInput == null) {
            profileCooperationTaskInput = new ArrayList<ProfileCooperationTaskInputType>();
        }
        return this.profileCooperationTaskInput;
    }

}
