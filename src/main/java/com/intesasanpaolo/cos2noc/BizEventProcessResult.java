//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.04.19 alle 11:11:23 AM CEST 
//


package com.intesasanpaolo.cos2noc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per bizEventProcessResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="bizEventProcessResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codicecanale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codicebanca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bizservice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bizEventProcessResult", propOrder = {
    "codicecanale",
    "codicebanca",
    "bizservice",
    "result"
})
public class BizEventProcessResult {

    @XmlElement(required = true)
    protected String codicecanale;
    @XmlElement(required = true)
    protected String codicebanca;
    @XmlElement(required = true)
    protected String bizservice;
    @XmlElement(required = true)
    protected String result;

    /**
     * Recupera il valore della proprietà codicecanale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodicecanale() {
        return codicecanale;
    }

    /**
     * Imposta il valore della proprietà codicecanale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodicecanale(String value) {
        this.codicecanale = value;
    }

    /**
     * Recupera il valore della proprietà codicebanca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodicebanca() {
        return codicebanca;
    }

    /**
     * Imposta il valore della proprietà codicebanca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodicebanca(String value) {
        this.codicebanca = value;
    }

    /**
     * Recupera il valore della proprietà bizservice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizservice() {
        return bizservice;
    }

    /**
     * Imposta il valore della proprietà bizservice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizservice(String value) {
        this.bizservice = value;
    }

    /**
     * Recupera il valore della proprietà result.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Imposta il valore della proprietà result.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

}
