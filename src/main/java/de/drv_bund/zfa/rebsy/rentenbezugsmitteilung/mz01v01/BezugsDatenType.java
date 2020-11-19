//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.19 at 03:20:07 PM CET 
//


package de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import de.drv_bund.zfa.zfa_standardtypen.v01.ISO4217Type;


/**
 * <p>Java class for BezugsDatenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BezugsDatenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LeWkz" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v01}ISO-4217Type"/>
 *         &lt;element name="LeJahr" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v01}LeistungsJahrMZ01V01Type"/>
 *         &lt;element name="LeApBtr" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v01}BetragSignedType" minOccurs="0"/>
 *         &lt;element name="LeBeginn" type="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v01}Datum1900Type"/>
 *         &lt;element name="LeEnde" type="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v01}Datum1900Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BezugsDatenType", propOrder = {
    "leWkz",
    "leJahr",
    "leApBtr",
    "leBeginn",
    "leEnde"
})
public class BezugsDatenType {

    @XmlElement(name = "LeWkz", required = true)
    @XmlSchemaType(name = "string")
    protected ISO4217Type leWkz;
    @XmlElement(name = "LeJahr", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar leJahr;
    @XmlElement(name = "LeApBtr")
    protected String leApBtr;
    @XmlElement(name = "LeBeginn", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar leBeginn;
    @XmlElement(name = "LeEnde")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar leEnde;

    /**
     * Gets the value of the leWkz property.
     * 
     * @return
     *     possible object is
     *     {@link ISO4217Type }
     *     
     */
    public ISO4217Type getLeWkz() {
        return leWkz;
    }

    /**
     * Sets the value of the leWkz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISO4217Type }
     *     
     */
    public void setLeWkz(ISO4217Type value) {
        this.leWkz = value;
    }

    /**
     * Gets the value of the leJahr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLeJahr() {
        return leJahr;
    }

    /**
     * Sets the value of the leJahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLeJahr(XMLGregorianCalendar value) {
        this.leJahr = value;
    }

    /**
     * Gets the value of the leApBtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeApBtr() {
        return leApBtr;
    }

    /**
     * Sets the value of the leApBtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeApBtr(String value) {
        this.leApBtr = value;
    }

    /**
     * Gets the value of the leBeginn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLeBeginn() {
        return leBeginn;
    }

    /**
     * Sets the value of the leBeginn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLeBeginn(XMLGregorianCalendar value) {
        this.leBeginn = value;
    }

    /**
     * Gets the value of the leEnde property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLeEnde() {
        return leEnde;
    }

    /**
     * Sets the value of the leEnde property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLeEnde(XMLGregorianCalendar value) {
        this.leEnde = value;
    }

}
