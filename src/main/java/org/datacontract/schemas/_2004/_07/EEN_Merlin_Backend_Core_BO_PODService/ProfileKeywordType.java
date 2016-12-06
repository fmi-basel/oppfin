
package org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profileKeyword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profileKeyword"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="markets" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}ArrayOfmarket" minOccurs="0"/&gt;
 *         &lt;element name="naces" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}ArrayOfnace" minOccurs="0"/&gt;
 *         &lt;element name="technologies" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}ArrayOftechnology" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profileKeyword", propOrder = {
    "markets",
    "naces",
    "technologies"
})
public class ProfileKeywordType {

    @XmlElementRef(name = "markets", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfmarketType> markets;
    @XmlElementRef(name = "naces", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfnaceType> naces;
    @XmlElementRef(name = "technologies", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOftechnologyType> technologies;

    /**
     * Gets the value of the markets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfmarketType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfmarketType> getMarkets() {
        return markets;
    }

    /**
     * Sets the value of the markets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfmarketType }{@code >}
     *     
     */
    public void setMarkets(JAXBElement<ArrayOfmarketType> value) {
        this.markets = value;
    }

    /**
     * Gets the value of the naces property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfnaceType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfnaceType> getNaces() {
        return naces;
    }

    /**
     * Sets the value of the naces property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfnaceType }{@code >}
     *     
     */
    public void setNaces(JAXBElement<ArrayOfnaceType> value) {
        this.naces = value;
    }

    /**
     * Gets the value of the technologies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOftechnologyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOftechnologyType> getTechnologies() {
        return technologies;
    }

    /**
     * Sets the value of the technologies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOftechnologyType }{@code >}
     *     
     */
    public void setTechnologies(JAXBElement<ArrayOftechnologyType> value) {
        this.technologies = value;
    }

}
