//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.12.12 às 06:33:26 PM BRST 
//


package com.soap.template.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.template.webservices package. 
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

    private final static QName _Basic_QNAME = new QName("http://webservices.template.soap.com", "Basic");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.template.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Basic }
     * 
     */
    public Basic createBasic() {
        return new Basic();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Basic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.template.soap.com", name = "Basic")
    public JAXBElement<Basic> createBasic(Basic value) {
        return new JAXBElement<Basic>(_Basic_QNAME, Basic.class, null, value);
    }

}
