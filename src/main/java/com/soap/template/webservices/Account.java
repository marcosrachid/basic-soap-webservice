//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.12.09 às 02:06:36 AM BRST 
//


package com.soap.template.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Account complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountBalance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AccountStatus" type="{http://webservices.template.soap.com}EnumAccountStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "accountNumber",
    "accountName",
    "accountBalance",
    "accountStatus"
})
public class Account {

    @XmlElement(name = "AccountNumber", required = true)
    protected String accountNumber;
    @XmlElement(name = "AccountName", required = true)
    protected String accountName;
    @XmlElement(name = "AccountBalance")
    protected double accountBalance;
    @XmlElement(name = "AccountStatus", required = true)
    protected EnumAccountStatus accountStatus;

    /**
     * Obtém o valor da propriedade accountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Define o valor da propriedade accountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Obtém o valor da propriedade accountName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Define o valor da propriedade accountName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Obtém o valor da propriedade accountBalance.
     * 
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Define o valor da propriedade accountBalance.
     * 
     */
    public void setAccountBalance(double value) {
        this.accountBalance = value;
    }

    /**
     * Obtém o valor da propriedade accountStatus.
     * 
     * @return
     *     possible object is
     *     {@link EnumAccountStatus }
     *     
     */
    public EnumAccountStatus getAccountStatus() {
        return accountStatus;
    }

    /**
     * Define o valor da propriedade accountStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumAccountStatus }
     *     
     */
    public void setAccountStatus(EnumAccountStatus value) {
        this.accountStatus = value;
    }

}
