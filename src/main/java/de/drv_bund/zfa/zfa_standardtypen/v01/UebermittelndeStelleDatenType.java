//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.19 at 03:20:07 PM CET 
//


package de.drv_bund.zfa.zfa_standardtypen.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UebermittelndeStelleDatenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UebermittelndeStelleDatenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bez" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v01}BezType"/>
 *         &lt;element name="AnName" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v01}AnNameType" minOccurs="0"/>
 *         &lt;element name="AnTel" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v01}AnTelType" minOccurs="0"/>
 *         &lt;element name="AnDurchwahl" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v01}DurchwahlType" minOccurs="0"/>
 *         &lt;element name="AnMail" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v01}AnEmailType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="Inlandsadresse" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v01}InlandsadresseType"/>
 *           &lt;element name="Auslandsadresse" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v01}AuslandsadresseType"/>
 *           &lt;element name="Postfachadresse" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v01}UeStPostfachadresseType"/>
 *           &lt;element name="Grosskundenadresse" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v01}GrosskundenadresseType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UebermittelndeStelleDatenType", propOrder = {
    "bez",
    "anName",
    "anTel",
    "anDurchwahl",
    "anMail",
    "inlandsadresse",
    "auslandsadresse",
    "postfachadresse",
    "grosskundenadresse"
})
public class UebermittelndeStelleDatenType {

    @XmlElement(name = "Bez", required = true)
    protected String bez;
    @XmlElement(name = "AnName")
    protected String anName;
    @XmlElement(name = "AnTel")
    protected String anTel;
    @XmlElement(name = "AnDurchwahl")
    protected String anDurchwahl;
    @XmlElement(name = "AnMail")
    protected String anMail;
    @XmlElement(name = "Inlandsadresse")
    protected InlandsadresseType inlandsadresse;
    @XmlElement(name = "Auslandsadresse")
    protected AuslandsadresseType auslandsadresse;
    @XmlElement(name = "Postfachadresse")
    protected UeStPostfachadresseType postfachadresse;
    @XmlElement(name = "Grosskundenadresse")
    protected GrosskundenadresseType grosskundenadresse;

    /**
     * Gets the value of the bez property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBez() {
        return bez;
    }

    /**
     * Sets the value of the bez property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBez(String value) {
        this.bez = value;
    }

    /**
     * Gets the value of the anName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnName() {
        return anName;
    }

    /**
     * Sets the value of the anName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnName(String value) {
        this.anName = value;
    }

    /**
     * Gets the value of the anTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnTel() {
        return anTel;
    }

    /**
     * Sets the value of the anTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnTel(String value) {
        this.anTel = value;
    }

    /**
     * Gets the value of the anDurchwahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnDurchwahl() {
        return anDurchwahl;
    }

    /**
     * Sets the value of the anDurchwahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnDurchwahl(String value) {
        this.anDurchwahl = value;
    }

    /**
     * Gets the value of the anMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnMail() {
        return anMail;
    }

    /**
     * Sets the value of the anMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnMail(String value) {
        this.anMail = value;
    }

    /**
     * Gets the value of the inlandsadresse property.
     * 
     * @return
     *     possible object is
     *     {@link InlandsadresseType }
     *     
     */
    public InlandsadresseType getInlandsadresse() {
        return inlandsadresse;
    }

    /**
     * Sets the value of the inlandsadresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link InlandsadresseType }
     *     
     */
    public void setInlandsadresse(InlandsadresseType value) {
        this.inlandsadresse = value;
    }

    /**
     * Gets the value of the auslandsadresse property.
     * 
     * @return
     *     possible object is
     *     {@link AuslandsadresseType }
     *     
     */
    public AuslandsadresseType getAuslandsadresse() {
        return auslandsadresse;
    }

    /**
     * Sets the value of the auslandsadresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuslandsadresseType }
     *     
     */
    public void setAuslandsadresse(AuslandsadresseType value) {
        this.auslandsadresse = value;
    }

    /**
     * Gets the value of the postfachadresse property.
     * 
     * @return
     *     possible object is
     *     {@link UeStPostfachadresseType }
     *     
     */
    public UeStPostfachadresseType getPostfachadresse() {
        return postfachadresse;
    }

    /**
     * Sets the value of the postfachadresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UeStPostfachadresseType }
     *     
     */
    public void setPostfachadresse(UeStPostfachadresseType value) {
        this.postfachadresse = value;
    }

    /**
     * Gets the value of the grosskundenadresse property.
     * 
     * @return
     *     possible object is
     *     {@link GrosskundenadresseType }
     *     
     */
    public GrosskundenadresseType getGrosskundenadresse() {
        return grosskundenadresse;
    }

    /**
     * Sets the value of the grosskundenadresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrosskundenadresseType }
     *     
     */
    public void setGrosskundenadresse(GrosskundenadresseType value) {
        this.grosskundenadresse = value;
    }

}
