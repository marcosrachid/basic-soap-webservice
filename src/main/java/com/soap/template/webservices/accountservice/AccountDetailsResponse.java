//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.12.09 às 02:06:36 AM BRST 
//


package com.soap.template.webservices.accountservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.soap.template.webservices.Account;


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
 *         &lt;element name="AccountDetails" type="{http://webservices.template.soap.com}Account"/>
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
    "accountDetails"
})
@XmlRootElement(name = "AccountDetailsResponse")
public class AccountDetailsResponse {

    @XmlElement(name = "AccountDetails", required = true)
    protected Account accountDetails;

    /**
     * Obtém o valor da propriedade accountDetails.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccountDetails() {
        return accountDetails;
    }

    /**
     * Define o valor da propriedade accountDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccountDetails(Account value) {
        this.accountDetails = value;
    }

}
