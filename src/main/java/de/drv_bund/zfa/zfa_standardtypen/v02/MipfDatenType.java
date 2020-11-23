//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.19 at 03:20:07 PM CET 
//


package de.drv_bund.zfa.zfa_standardtypen.v02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MipfDatenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MipfDatenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WIdNr" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}WIdNrType" minOccurs="0"/>
 *         &lt;element name="StNr" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}StNrType" minOccurs="0"/>
 *         &lt;element name="MipfBez" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}BezType"/>
 *         &lt;element name="MipfAnName" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}AnNameType" minOccurs="0"/>
 *         &lt;element name="MipfAnTel" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}TelType" minOccurs="0"/>
 *         &lt;element name="MipfAnDurchwahl" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}DurchwahlType" minOccurs="0"/>
 *         &lt;element name="MipfAnMail" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}EmailType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="Inlandsadresse" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}InlandsadresseType"/>
 *           &lt;element name="Auslandsadresse" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}AuslandsadresseType"/>
 *           &lt;element name="Postfachadresse" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}PostfachadresseType"/>
 *           &lt;element name="Grosskundenadresse" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}GrosskundenadresseType"/>
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
@XmlType(name = "MipfDatenType", propOrder = {
    "wIdNr",
    "stNr",
    "mipfBez",
    "mipfAnName",
    "mipfAnTel",
    "mipfAnDurchwahl",
    "mipfAnMail",
    "inlandsadresse",
    "auslandsadresse",
    "postfachadresse",
    "grosskundenadresse"
})
public class MipfDatenType {

    @XmlElement(name = "WIdNr")
    protected String wIdNr;
    @XmlElement(name = "StNr")
    protected String stNr;
    @XmlElement(name = "MipfBez", required = true)
    protected String mipfBez;
    @XmlElement(name = "MipfAnName")
    protected String mipfAnName;
    @XmlElement(name = "MipfAnTel")
    protected String mipfAnTel;
    @XmlElement(name = "MipfAnDurchwahl")
    protected String mipfAnDurchwahl;
    @XmlElement(name = "MipfAnMail")
    protected String mipfAnMail;
    @XmlElement(name = "Inlandsadresse")
    protected InlandsadresseType inlandsadresse;
    @XmlElement(name = "Auslandsadresse")
    protected AuslandsadresseType auslandsadresse;
    @XmlElement(name = "Postfachadresse")
    protected PostfachadresseType postfachadresse;
    @XmlElement(name = "Grosskundenadresse")
    protected GrosskundenadresseType grosskundenadresse;

    /**
     * Gets the value of the wIdNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWIdNr() {
        return wIdNr;
    }

    /**
     * Sets the value of the wIdNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWIdNr(String value) {
        this.wIdNr = value;
    }

    /**
     * Gets the value of the stNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStNr() {
        return stNr;
    }

    /**
     * Sets the value of the stNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStNr(String value) {
        this.stNr = value;
    }

    /**
     * Gets the value of the mipfBez property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMipfBez() {
        return mipfBez;
    }

    /**
     * Sets the value of the mipfBez property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMipfBez(String value) {
        this.mipfBez = value;
    }

    /**
     * Gets the value of the mipfAnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMipfAnName() {
        return mipfAnName;
    }

    /**
     * Sets the value of the mipfAnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMipfAnName(String value) {
        this.mipfAnName = value;
    }

    /**
     * Gets the value of the mipfAnTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMipfAnTel() {
        return mipfAnTel;
    }

    /**
     * Sets the value of the mipfAnTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMipfAnTel(String value) {
        this.mipfAnTel = value;
    }

    /**
     * Gets the value of the mipfAnDurchwahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMipfAnDurchwahl() {
        return mipfAnDurchwahl;
    }

    /**
     * Sets the value of the mipfAnDurchwahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMipfAnDurchwahl(String value) {
        this.mipfAnDurchwahl = value;
    }

    /**
     * Gets the value of the mipfAnMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMipfAnMail() {
        return mipfAnMail;
    }

    /**
     * Sets the value of the mipfAnMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMipfAnMail(String value) {
        this.mipfAnMail = value;
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
     *     {@link PostfachadresseType }
     *     
     */
    public PostfachadresseType getPostfachadresse() {
        return postfachadresse;
    }

    /**
     * Sets the value of the postfachadresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostfachadresseType }
     *     
     */
    public void setPostfachadresse(PostfachadresseType value) {
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