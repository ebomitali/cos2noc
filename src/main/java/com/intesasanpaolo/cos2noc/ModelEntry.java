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
 * <p>Classe Java per modelEntry complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="modelEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceCanale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codiceBanca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bizService" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descrizioneCanale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descrizioneBanca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modelEntry", propOrder = {
    "codiceCanale",
    "codiceBanca",
    "bizService",
    "descrizioneCanale",
    "descrizioneBanca"
})
public class ModelEntry {

    @XmlElement(required = true)
    protected String codiceCanale;
    @XmlElement(required = true)
    protected String codiceBanca;
    @XmlElement(required = true)
    protected String bizService;
    @XmlElement(required = true)
    protected String descrizioneCanale;
    @XmlElement(required = true)
    protected String descrizioneBanca;

    /**
     * Recupera il valore della proprietà codiceCanale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceCanale() {
        return codiceCanale;
    }

    /**
     * Imposta il valore della proprietà codiceCanale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceCanale(String value) {
        this.codiceCanale = value;
    }

    /**
     * Recupera il valore della proprietà codiceBanca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceBanca() {
        return codiceBanca;
    }

    /**
     * Imposta il valore della proprietà codiceBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceBanca(String value) {
        this.codiceBanca = value;
    }

    /**
     * Recupera il valore della proprietà bizService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizService() {
        return bizService;
    }

    /**
     * Imposta il valore della proprietà bizService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizService(String value) {
        this.bizService = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneCanale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneCanale() {
        return descrizioneCanale;
    }

    /**
     * Imposta il valore della proprietà descrizioneCanale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneCanale(String value) {
        this.descrizioneCanale = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneBanca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneBanca() {
        return descrizioneBanca;
    }

    /**
     * Imposta il valore della proprietà descrizioneBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneBanca(String value) {
        this.descrizioneBanca = value;
    }

}
