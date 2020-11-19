//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.19 at 03:20:07 PM CET 
//


package de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GarantierenteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GarantierenteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErbGebDt" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}DatumMit0Type" minOccurs="0"/>
 *         &lt;element name="ErbLeBeginn" type="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v02}Datum1900Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GarantierenteType", propOrder = {
    "erbGebDt",
    "erbLeBeginn"
})
public class GarantierenteType {

    @XmlElement(name = "ErbGebDt")
    protected String erbGebDt;
    @XmlElement(name = "ErbLeBeginn")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar erbLeBeginn;

    /**
     * Gets the value of the erbGebDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErbGebDt() {
        return erbGebDt;
    }

    /**
     * Sets the value of the erbGebDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErbGebDt(String value) {
        this.erbGebDt = value;
    }

    /**
     * Gets the value of the erbLeBeginn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErbLeBeginn() {
        return erbLeBeginn;
    }

    /**
     * Sets the value of the erbLeBeginn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErbLeBeginn(XMLGregorianCalendar value) {
        this.erbLeBeginn = value;
    }

}
