//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.04.19 alle 11:11:23 AM CEST 
//


package com.intesasanpaolo.cos2noc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per bizEvent complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="bizEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codicecanale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codicebanca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bizservice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abend" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="volumi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="inflight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="old" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tempirisposta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="eventtimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="reason" type="{http://intesasanpaolo.com/cos2noc}reasonType" maxOccurs="5"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bizEvent", propOrder = {
    "codicecanale",
    "codicebanca",
    "bizservice",
    "abend",
    "volumi",
    "inflight",
    "old",
    "tempirisposta",
    "eventtimestamp",
    "reason"
})
public class BizEvent {

    @XmlElement(required = true)
    protected String codicecanale;
    @XmlElement(required = true)
    protected String codicebanca;
    @XmlElement(required = true)
    protected String bizservice;
    protected int abend;
    protected int volumi;
    protected int inflight;
    protected int old;
    protected int tempirisposta;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventtimestamp;
    @XmlElement(required = true)
    protected List<ReasonType> reason;

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
     * Recupera il valore della proprietà abend.
     * 
     */
    public int getAbend() {
        return abend;
    }

    /**
     * Imposta il valore della proprietà abend.
     * 
     */
    public void setAbend(int value) {
        this.abend = value;
    }

    /**
     * Recupera il valore della proprietà volumi.
     * 
     */
    public int getVolumi() {
        return volumi;
    }

    /**
     * Imposta il valore della proprietà volumi.
     * 
     */
    public void setVolumi(int value) {
        this.volumi = value;
    }

    /**
     * Recupera il valore della proprietà inflight.
     * 
     */
    public int getInflight() {
        return inflight;
    }

    /**
     * Imposta il valore della proprietà inflight.
     * 
     */
    public void setInflight(int value) {
        this.inflight = value;
    }

    /**
     * Recupera il valore della proprietà old.
     * 
     */
    public int getOld() {
        return old;
    }

    /**
     * Imposta il valore della proprietà old.
     * 
     */
    public void setOld(int value) {
        this.old = value;
    }

    /**
     * Recupera il valore della proprietà tempirisposta.
     * 
     */
    public int getTempirisposta() {
        return tempirisposta;
    }

    /**
     * Imposta il valore della proprietà tempirisposta.
     * 
     */
    public void setTempirisposta(int value) {
        this.tempirisposta = value;
    }

    /**
     * Recupera il valore della proprietà eventtimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventtimestamp() {
        return eventtimestamp;
    }

    /**
     * Imposta il valore della proprietà eventtimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventtimestamp(XMLGregorianCalendar value) {
        this.eventtimestamp = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReasonType }
     * 
     * 
     */
    public List<ReasonType> getReason() {
        if (reason == null) {
            reason = new ArrayList<ReasonType>();
        }
        return this.reason;
    }

}
