//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.19 at 03:20:07 PM CET 
//


package de.drv_bund.zfa.zfa_standardtypen.v02;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InlandsadresseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InlandsadresseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}AllgAdresseType">
 *       &lt;sequence>
 *         &lt;element name="Plz" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}PLZType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InlandsadresseType", propOrder = {
    "plz"
})
public class InlandsadresseType
    extends AllgAdresseType
{

    @XmlElement(name = "Plz", required = true)
    protected String plz;

    /**
     * Gets the value of the plz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlz() {
        return plz;
    }

    /**
     * Sets the value of the plz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlz(String value) {
        this.plz = value;
    }

}
