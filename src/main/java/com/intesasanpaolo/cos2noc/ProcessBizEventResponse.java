//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.04.19 alle 11:11:23 AM CEST 
//


package com.intesasanpaolo.cos2noc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per processBizEventResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="processBizEventResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processResult" type="{http://intesasanpaolo.com/cos2noc}bizEventProcessResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processBizEventResponse", propOrder = {
    "processResult"
})
public class ProcessBizEventResponse {

    protected BizEventProcessResult processResult;

    /**
     * Recupera il valore della proprietà processResult.
     * 
     * @return
     *     possible object is
     *     {@link BizEventProcessResult }
     *     
     */
    public BizEventProcessResult getProcessResult() {
        return processResult;
    }

    /**
     * Imposta il valore della proprietà processResult.
     * 
     * @param value
     *     allowed object is
     *     {@link BizEventProcessResult }
     *     
     */
    public void setProcessResult(BizEventProcessResult value) {
        this.processResult = value;
    }

}
