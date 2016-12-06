
package org.datacontract.schemas._2004._07.EEN_Merlin_Backend_Core_BO_PODService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profileKeywordInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profileKeywordInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="markets" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}ArrayOfmarketInput" minOccurs="0"/&gt;
 *         &lt;element name="naces" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}ArrayOfnaceInput" minOccurs="0"/&gt;
 *         &lt;element name="technologies" type="{http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService}ArrayOftechnologyInput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profileKeywordInput", propOrder = {
    "markets",
    "naces",
    "technologies"
})
public class ProfileKeywordInputType {

    @XmlElementRef(name = "markets", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfmarketInputType> markets;
    @XmlElementRef(name = "naces", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfnaceInputType> naces;
    @XmlElementRef(name = "technologies", namespace = "http://schemas.datacontract.org/2004/07/EEN.Merlin.Backend.Core.BO.PODService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOftechnologyInputType> technologies;

    /**
     * Gets the value of the markets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfmarketInputType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfmarketInputType> getMarkets() {
        return markets;
    }

    /**
     * Sets the value of the markets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfmarketInputType }{@code >}
     *     
     */
    public void setMarkets(JAXBElement<ArrayOfmarketInputType> value) {
        this.markets = value;
    }

    /**
     * Gets the value of the naces property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfnaceInputType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfnaceInputType> getNaces() {
        return naces;
    }

    /**
     * Sets the value of the naces property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfnaceInputType }{@code >}
     *     
     */
    public void setNaces(JAXBElement<ArrayOfnaceInputType> value) {
        this.naces = value;
    }

    /**
     * Gets the value of the technologies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOftechnologyInputType }{@code >}
     *     
     */
    public JAXBElement<ArrayOftechnologyInputType> getTechnologies() {
        return technologies;
    }

    /**
     * Sets the value of the technologies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOftechnologyInputType }{@code >}
     *     
     */
    public void setTechnologies(JAXBElement<ArrayOftechnologyInputType> value) {
        this.technologies = value;
    }

}
