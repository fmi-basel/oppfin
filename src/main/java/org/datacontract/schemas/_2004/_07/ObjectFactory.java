
package org.datacontract.schemas._2004._07;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfevent_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfevent");
    private final static QName _Event_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "event");
    private final static QName _EventKeyword_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "eventKeyword");
    private final static QName _ArrayOfeventKeywordMarket_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfeventKeywordMarket");
    private final static QName _EventKeywordMarket_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "eventKeywordMarket");
    private final static QName _ArrayOfeventKeywordNace_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfeventKeywordNace");
    private final static QName _EventKeywordNace_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "eventKeywordNace");
    private final static QName _ArrayOfeventKeywordTechnology_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfeventKeywordTechnology");
    private final static QName _EventKeywordTechnology_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "eventKeywordTechnology");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfevent }
     * 
     */
    public ArrayOfevent createArrayOfevent() {
        return new ArrayOfevent();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link EventKeyword }
     * 
     */
    public EventKeyword createEventKeyword() {
        return new EventKeyword();
    }

    /**
     * Create an instance of {@link ArrayOfeventKeywordMarket }
     * 
     */
    public ArrayOfeventKeywordMarket createArrayOfeventKeywordMarket() {
        return new ArrayOfeventKeywordMarket();
    }

    /**
     * Create an instance of {@link EventKeywordMarket }
     * 
     */
    public EventKeywordMarket createEventKeywordMarket() {
        return new EventKeywordMarket();
    }

    /**
     * Create an instance of {@link ArrayOfeventKeywordNace }
     * 
     */
    public ArrayOfeventKeywordNace createArrayOfeventKeywordNace() {
        return new ArrayOfeventKeywordNace();
    }

    /**
     * Create an instance of {@link EventKeywordNace }
     * 
     */
    public EventKeywordNace createEventKeywordNace() {
        return new EventKeywordNace();
    }

    /**
     * Create an instance of {@link ArrayOfeventKeywordTechnology }
     * 
     */
    public ArrayOfeventKeywordTechnology createArrayOfeventKeywordTechnology() {
        return new ArrayOfeventKeywordTechnology();
    }

    /**
     * Create an instance of {@link EventKeywordTechnology }
     * 
     */
    public EventKeywordTechnology createEventKeywordTechnology() {
        return new EventKeywordTechnology();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfevent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfevent")
    public JAXBElement<ArrayOfevent> createArrayOfevent(ArrayOfevent value) {
        return new JAXBElement<ArrayOfevent>(_ArrayOfevent_QNAME, ArrayOfevent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Event }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "event")
    public JAXBElement<Event> createEvent(Event value) {
        return new JAXBElement<Event>(_Event_QNAME, Event.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventKeyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "eventKeyword")
    public JAXBElement<EventKeyword> createEventKeyword(EventKeyword value) {
        return new JAXBElement<EventKeyword>(_EventKeyword_QNAME, EventKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfeventKeywordMarket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfeventKeywordMarket")
    public JAXBElement<ArrayOfeventKeywordMarket> createArrayOfeventKeywordMarket(ArrayOfeventKeywordMarket value) {
        return new JAXBElement<ArrayOfeventKeywordMarket>(_ArrayOfeventKeywordMarket_QNAME, ArrayOfeventKeywordMarket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventKeywordMarket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "eventKeywordMarket")
    public JAXBElement<EventKeywordMarket> createEventKeywordMarket(EventKeywordMarket value) {
        return new JAXBElement<EventKeywordMarket>(_EventKeywordMarket_QNAME, EventKeywordMarket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfeventKeywordNace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfeventKeywordNace")
    public JAXBElement<ArrayOfeventKeywordNace> createArrayOfeventKeywordNace(ArrayOfeventKeywordNace value) {
        return new JAXBElement<ArrayOfeventKeywordNace>(_ArrayOfeventKeywordNace_QNAME, ArrayOfeventKeywordNace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventKeywordNace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "eventKeywordNace")
    public JAXBElement<EventKeywordNace> createEventKeywordNace(EventKeywordNace value) {
        return new JAXBElement<EventKeywordNace>(_EventKeywordNace_QNAME, EventKeywordNace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfeventKeywordTechnology }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfeventKeywordTechnology")
    public JAXBElement<ArrayOfeventKeywordTechnology> createArrayOfeventKeywordTechnology(ArrayOfeventKeywordTechnology value) {
        return new JAXBElement<ArrayOfeventKeywordTechnology>(_ArrayOfeventKeywordTechnology_QNAME, ArrayOfeventKeywordTechnology.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventKeywordTechnology }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "eventKeywordTechnology")
    public JAXBElement<EventKeywordTechnology> createEventKeywordTechnology(EventKeywordTechnology value) {
        return new JAXBElement<EventKeywordTechnology>(_EventKeywordTechnology_QNAME, EventKeywordTechnology.class, null, value);
    }

}
