//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.12.12 às 06:59:58 PM BRST 
//


package com.soap.template.webservices.basicservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.template.webservices.basicservice package. 
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

    private final static QName _NewResponse_QNAME = new QName("http://com/soap/template/webservices/basicservice", "NewResponse");
    private final static QName _EchoRequest_QNAME = new QName("http://com/soap/template/webservices/basicservice", "EchoRequest");
    private final static QName _EchoResponse_QNAME = new QName("http://com/soap/template/webservices/basicservice", "EchoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.template.webservices.basicservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NewRequest }
     * 
     */
    public NewRequest createNewRequest() {
        return new NewRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/soap/template/webservices/basicservice", name = "NewResponse")
    public JAXBElement<String> createNewResponse(String value) {
        return new JAXBElement<String>(_NewResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/soap/template/webservices/basicservice", name = "EchoRequest")
    public JAXBElement<String> createEchoRequest(String value) {
        return new JAXBElement<String>(_EchoRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/soap/template/webservices/basicservice", name = "EchoResponse")
    public JAXBElement<String> createEchoResponse(String value) {
        return new JAXBElement<String>(_EchoResponse_QNAME, String.class, null, value);
    }

}
