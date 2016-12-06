
package eu.europa.ec.een.tools.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="u" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="db" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="da" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="o" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="im" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "u",
    "p",
    "pt",
    "dc",
    "db",
    "da",
    "sb",
    "sa",
    "ub",
    "ua",
    "o",
    "oc",
    "pi",
    "pb",
    "pa",
    "ci",
    "im"
})
@XmlRootElement(name = "GetProfiles")
public class GetProfiles {

    @XmlElementRef(name = "u", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> u;
    @XmlElementRef(name = "p", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> p;
    @XmlElementRef(name = "pt", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pt;
    @XmlElementRef(name = "dc", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dc;
    @XmlElementRef(name = "db", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> db;
    @XmlElementRef(name = "da", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> da;
    @XmlElementRef(name = "sb", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sb;
    @XmlElementRef(name = "sa", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sa;
    @XmlElementRef(name = "ub", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ub;
    @XmlElementRef(name = "ua", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ua;
    @XmlElementRef(name = "o", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> o;
    @XmlElementRef(name = "oc", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oc;
    @XmlElementRef(name = "pi", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pi;
    @XmlElementRef(name = "pb", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pb;
    @XmlElementRef(name = "pa", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pa;
    @XmlElementRef(name = "ci", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ci;
    @XmlElementRef(name = "im", namespace = "http://een.ec.europa.eu/tools/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> im;

    /**
     * Gets the value of the u property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getU() {
        return u;
    }

    /**
     * Sets the value of the u property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setU(JAXBElement<String> value) {
        this.u = value;
    }

    /**
     * Gets the value of the p property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getP() {
        return p;
    }

    /**
     * Sets the value of the p property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setP(JAXBElement<String> value) {
        this.p = value;
    }

    /**
     * Gets the value of the pt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPt() {
        return pt;
    }

    /**
     * Sets the value of the pt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPt(JAXBElement<String> value) {
        this.pt = value;
    }

    /**
     * Gets the value of the dc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDc() {
        return dc;
    }

    /**
     * Sets the value of the dc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDc(JAXBElement<String> value) {
        this.dc = value;
    }

    /**
     * Gets the value of the db property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDb() {
        return db;
    }

    /**
     * Sets the value of the db property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDb(JAXBElement<String> value) {
        this.db = value;
    }

    /**
     * Gets the value of the da property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDa() {
        return da;
    }

    /**
     * Sets the value of the da property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDa(JAXBElement<String> value) {
        this.da = value;
    }

    /**
     * Gets the value of the sb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSb() {
        return sb;
    }

    /**
     * Sets the value of the sb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSb(JAXBElement<String> value) {
        this.sb = value;
    }

    /**
     * Gets the value of the sa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSa() {
        return sa;
    }

    /**
     * Sets the value of the sa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSa(JAXBElement<String> value) {
        this.sa = value;
    }

    /**
     * Gets the value of the ub property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUb() {
        return ub;
    }

    /**
     * Sets the value of the ub property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUb(JAXBElement<String> value) {
        this.ub = value;
    }

    /**
     * Gets the value of the ua property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUa() {
        return ua;
    }

    /**
     * Sets the value of the ua property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUa(JAXBElement<String> value) {
        this.ua = value;
    }

    /**
     * Gets the value of the o property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getO() {
        return o;
    }

    /**
     * Sets the value of the o property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setO(JAXBElement<String> value) {
        this.o = value;
    }

    /**
     * Gets the value of the oc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOc() {
        return oc;
    }

    /**
     * Sets the value of the oc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOc(JAXBElement<String> value) {
        this.oc = value;
    }

    /**
     * Gets the value of the pi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPi() {
        return pi;
    }

    /**
     * Sets the value of the pi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPi(JAXBElement<String> value) {
        this.pi = value;
    }

    /**
     * Gets the value of the pb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPb() {
        return pb;
    }

    /**
     * Sets the value of the pb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPb(JAXBElement<String> value) {
        this.pb = value;
    }

    /**
     * Gets the value of the pa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPa() {
        return pa;
    }

    /**
     * Sets the value of the pa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPa(JAXBElement<String> value) {
        this.pa = value;
    }

    /**
     * Gets the value of the ci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCi() {
        return ci;
    }

    /**
     * Sets the value of the ci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCi(JAXBElement<String> value) {
        this.ci = value;
    }

    /**
     * Gets the value of the im property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIm() {
        return im;
    }

    /**
     * Sets the value of the im property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIm(JAXBElement<String> value) {
        this.im = value;
    }

}
