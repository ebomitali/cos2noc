//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.04.19 alle 11:11:23 AM CEST 
//


package com.intesasanpaolo.cos2noc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.intesasanpaolo.cos2noc package. 
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

    private final static QName _ProcessBizEventResponse_QNAME = new QName("http://intesasanpaolo.com/cos2noc", "processBizEventResponse");
    private final static QName _ProcessBizEventRequest_QNAME = new QName("http://intesasanpaolo.com/cos2noc", "processBizEventRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.intesasanpaolo.cos2noc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessBizEventRequest }
     * 
     */
    public ProcessBizEventRequest createProcessBizEventRequest() {
        return new ProcessBizEventRequest();
    }

    /**
     * Create an instance of {@link ProcessBizEventResponse }
     * 
     */
    public ProcessBizEventResponse createProcessBizEventResponse() {
        return new ProcessBizEventResponse();
    }

    /**
     * Create an instance of {@link SetModelRequest }
     * 
     */
    public SetModelRequest createSetModelRequest() {
        return new SetModelRequest();
    }

    /**
     * Create an instance of {@link Model }
     * 
     */
    public Model createModel() {
        return new Model();
    }

    /**
     * Create an instance of {@link SetModelResponse }
     * 
     */
    public SetModelResponse createSetModelResponse() {
        return new SetModelResponse();
    }

    /**
     * Create an instance of {@link BizEventProcessResult }
     * 
     */
    public BizEventProcessResult createBizEventProcessResult() {
        return new BizEventProcessResult();
    }

    /**
     * Create an instance of {@link BizEvent }
     * 
     */
    public BizEvent createBizEvent() {
        return new BizEvent();
    }

    /**
     * Create an instance of {@link ModelEntry }
     * 
     */
    public ModelEntry createModelEntry() {
        return new ModelEntry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessBizEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://intesasanpaolo.com/cos2noc", name = "processBizEventResponse")
    public JAXBElement<ProcessBizEventResponse> createProcessBizEventResponse(ProcessBizEventResponse value) {
        return new JAXBElement<ProcessBizEventResponse>(_ProcessBizEventResponse_QNAME, ProcessBizEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessBizEventRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://intesasanpaolo.com/cos2noc", name = "processBizEventRequest")
    public JAXBElement<ProcessBizEventRequest> createProcessBizEventRequest(ProcessBizEventRequest value) {
        return new JAXBElement<ProcessBizEventRequest>(_ProcessBizEventRequest_QNAME, ProcessBizEventRequest.class, null, value);
    }

}
