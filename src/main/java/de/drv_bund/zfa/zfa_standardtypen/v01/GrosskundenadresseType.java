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
 * <p>Java class for GrosskundenadresseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrosskundenadresseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GkOrt" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v01}OrtType"/>
 *         &lt;element name="GkPlz" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v01}PLZType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrosskundenadresseType", propOrder = {
    "gkOrt",
    "gkPlz"
})
public class GrosskundenadresseType {

    @XmlElement(name = "GkOrt", required = true)
    protected String gkOrt;
    @XmlElement(name = "GkPlz", required = true)
    protected String gkPlz;

    /**
     * Gets the value of the gkOrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGkOrt() {
        return gkOrt;
    }

    /**
     * Sets the value of the gkOrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGkOrt(String value) {
        this.gkOrt = value;
    }

    /**
     * Gets the value of the gkPlz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGkPlz() {
        return gkPlz;
    }

    /**
     * Sets the value of the gkPlz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGkPlz(String value) {
        this.gkPlz = value;
    }

}
