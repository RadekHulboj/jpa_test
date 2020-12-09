//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.19 at 03:20:07 PM CET 
//


package de.drv_bund.zfa.zfa_standardtypen.v02;

import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v02.Daten;
import model.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FehlerDatenFachlichType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FehlerDatenFachlichType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeDtRueck" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}DatumZeitMilliSecType"/>
 *         &lt;element name="FeNr" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}FehlerNrType"/>
 *         &lt;element name="FeTx" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}FehlertextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Entity(name="FehlerDatenFachlichType")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FehlerDatenFachlichType", propOrder = {
        "feDtRueck",
        "feNr",
        "feTx",
        "daten"
})
public class FehlerDatenFachlichType extends BaseEntity {

    @XmlElement(name = "FeDtRueck", required = true)
    protected String feDtRueck;
    @XmlElement(name = "FeNr", required = true)
    protected String feNr;
    @XmlElement(name = "FeTx")
    protected String feTx;


    @ManyToOne
    @JoinColumn(name="fk_daten_id")
    private Daten daten;

    /**
     * Gets the value of the feDtRueck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeDtRueck() {
        return feDtRueck;
    }

    /**
     * Sets the value of the feDtRueck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeDtRueck(String value) {
        this.feDtRueck = value;
    }

    /**
     * Gets the value of the feNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeNr() {
        return feNr;
    }

    /**
     * Sets the value of the feNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeNr(String value) {
        this.feNr = value;
    }

    /**
     * Gets the value of the feTx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeTx() {
        return feTx;
    }

    /**
     * Sets the value of the feTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeTx(String value) {
        this.feTx = value;
    }

}
