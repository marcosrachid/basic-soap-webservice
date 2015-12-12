//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.12.12 às 06:33:26 PM BRST 
//


package com.soap.template.webservices.basicservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.soap.template.webservices.Basic;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Basic" type="{http://webservices.template.soap.com}Basic"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "basic"
})
@XmlRootElement(name = "NewResponse")
public class NewResponse {

    @XmlElement(name = "Basic", required = true)
    protected Basic basic;

    /**
     * Obtém o valor da propriedade basic.
     * 
     * @return
     *     possible object is
     *     {@link Basic }
     *     
     */
    public Basic getBasic() {
        return basic;
    }

    /**
     * Define o valor da propriedade basic.
     * 
     * @param value
     *     allowed object is
     *     {@link Basic }
     *     
     */
    public void setBasic(Basic value) {
        this.basic = value;
    }

}
