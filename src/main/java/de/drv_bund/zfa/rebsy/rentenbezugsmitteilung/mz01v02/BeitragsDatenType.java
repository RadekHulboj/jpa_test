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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeitragsDatenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeitragsDatenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BezBeginn" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}DatumJHJJ-MM-2020Type" minOccurs="0"/>
 *         &lt;element name="BezEnde" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}DatumJHJJ-MM-2020Type" minOccurs="0"/>
 *         &lt;element name="BetragArt" type="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v02}BetragArtType"/>
 *         &lt;element name="Betrag" type="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v02}PositiverBetragType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeitragsDatenType", propOrder = {
    "bezBeginn",
    "bezEnde",
    "betragArt",
    "betrag"
})
public class BeitragsDatenType {

    @XmlElement(name = "BezBeginn")
    protected String bezBeginn;
    @XmlElement(name = "BezEnde")
    protected String bezEnde;
    @XmlElement(name = "BetragArt", required = true)
    protected String betragArt;
    @XmlElement(name = "Betrag", required = true)
    protected String betrag;

    /**
     * Gets the value of the bezBeginn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezBeginn() {
        return bezBeginn;
    }

    /**
     * Sets the value of the bezBeginn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezBeginn(String value) {
        this.bezBeginn = value;
    }

    /**
     * Gets the value of the bezEnde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezEnde() {
        return bezEnde;
    }

    /**
     * Sets the value of the bezEnde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezEnde(String value) {
        this.bezEnde = value;
    }

    /**
     * Gets the value of the betragArt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetragArt() {
        return betragArt;
    }

    /**
     * Sets the value of the betragArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetragArt(String value) {
        this.betragArt = value;
    }

    /**
     * Gets the value of the betrag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetrag() {
        return betrag;
    }

    /**
     * Sets the value of the betrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetrag(String value) {
        this.betrag = value;
    }

}
