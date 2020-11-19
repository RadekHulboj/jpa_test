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
 * <p>Java class for VorzeitraeumeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VorzeitraeumeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VorBeginn" type="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v02}Datum1900Type" minOccurs="0"/>
 *         &lt;element name="VorEnde" type="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v02}Datum1900Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VorzeitraeumeType", propOrder = {
    "vorBeginn",
    "vorEnde"
})
public class VorzeitraeumeType {

    @XmlElement(name = "VorBeginn")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vorBeginn;
    @XmlElement(name = "VorEnde")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vorEnde;

    /**
     * Gets the value of the vorBeginn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVorBeginn() {
        return vorBeginn;
    }

    /**
     * Sets the value of the vorBeginn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVorBeginn(XMLGregorianCalendar value) {
        this.vorBeginn = value;
    }

    /**
     * Gets the value of the vorEnde property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVorEnde() {
        return vorEnde;
    }

    /**
     * Sets the value of the vorEnde property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVorEnde(XMLGregorianCalendar value) {
        this.vorEnde = value;
    }

}
