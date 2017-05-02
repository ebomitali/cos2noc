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
 * <p>Classe Java per processBizEventRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="processBizEventRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batchid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="batchtimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="bizEventList" type="{http://intesasanpaolo.com/cos2noc}bizEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processBizEventRequest", propOrder = {
    "batchid",
    "total",
    "batchtimestamp",
    "bizEventList"
})
public class ProcessBizEventRequest {

    protected int batchid;
    protected int total;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar batchtimestamp;
    @XmlElement(nillable = true)
    protected List<BizEvent> bizEventList;

    /**
     * Recupera il valore della proprietà batchid.
     * 
     */
    public int getBatchid() {
        return batchid;
    }

    /**
     * Imposta il valore della proprietà batchid.
     * 
     */
    public void setBatchid(int value) {
        this.batchid = value;
    }

    /**
     * Recupera il valore della proprietà total.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Imposta il valore della proprietà total.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Recupera il valore della proprietà batchtimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBatchtimestamp() {
        return batchtimestamp;
    }

    /**
     * Imposta il valore della proprietà batchtimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBatchtimestamp(XMLGregorianCalendar value) {
        this.batchtimestamp = value;
    }

    /**
     * Gets the value of the bizEventList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bizEventList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBizEventList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BizEvent }
     * 
     * 
     */
    public List<BizEvent> getBizEventList() {
        if (bizEventList == null) {
            bizEventList = new ArrayList<BizEvent>();
        }
        return this.bizEventList;
    }

}
