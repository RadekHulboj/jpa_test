//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.19 at 03:20:07 PM CET 
//


package de.drv_bund.zfa.zfa_standardtypen.v02;

import model.BaseEntity;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllgAdresseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllgAdresseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Str" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}StrType" minOccurs="0"/>
 *         &lt;element name="HausNr" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}HausNrType" minOccurs="0"/>
 *         &lt;element name="HausNrZu" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}HausNrZusatzType" minOccurs="0"/>
 *         &lt;element name="AdressErg" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}AdressErgType" minOccurs="0"/>
 *         &lt;element name="Ort" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}OrtType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllgAdresseType", propOrder = {
    "str",
    "hausNr",
    "hausNrZu",
    "adressErg",
    "ort"
})
@XmlSeeAlso({
    InlandsadresseType.class,
    AuslandsadresseType.class
})
public class AllgAdresseType extends BaseEntity {

    @XmlElement(name = "Str")
    protected String str;
    @XmlElement(name = "HausNr")
    @XmlSchemaType(name = "integer")
    protected Integer hausNr;
    @XmlElement(name = "HausNrZu")
    protected String hausNrZu;
    @XmlElement(name = "AdressErg")
    protected String adressErg;
    @XmlElement(name = "Ort", required = true)
    protected String ort;

    /**
     * Gets the value of the str property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStr() {
        return str;
    }

    /**
     * Sets the value of the str property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStr(String value) {
        this.str = value;
    }

    /**
     * Gets the value of the hausNr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHausNr() {
        return hausNr;
    }

    /**
     * Sets the value of the hausNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHausNr(Integer value) {
        this.hausNr = value;
    }

    /**
     * Gets the value of the hausNrZu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHausNrZu() {
        return hausNrZu;
    }

    /**
     * Sets the value of the hausNrZu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHausNrZu(String value) {
        this.hausNrZu = value;
    }

    /**
     * Gets the value of the adressErg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressErg() {
        return adressErg;
    }

    /**
     * Sets the value of the adressErg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressErg(String value) {
        this.adressErg = value;
    }

    /**
     * Gets the value of the ort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Sets the value of the ort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrt(String value) {
        this.ort = value;
    }

}
