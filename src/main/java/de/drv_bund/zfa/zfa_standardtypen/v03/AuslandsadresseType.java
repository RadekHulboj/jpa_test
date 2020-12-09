//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.19 at 03:20:07 PM CET 
//


package de.drv_bund.zfa.zfa_standardtypen.v03;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuslandsadresseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuslandsadresseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.zfa.drv-bund.de/zfa_standardtypen/v03}AllgAdresseType">
 *       &lt;sequence>
 *         &lt;element name="StaatId" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v03}AuslandsStaatSchluesselType"/>
 *         &lt;element name="Plz" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v03}AuslPLZType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Entity(name="AuslandsadresseType3")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuslandsadresseType", propOrder = {
    "staatId",
    "plz"
})
public class AuslandsadresseType
    extends AllgAdresseType
{

    @XmlElement(name = "StaatId", required = true)
    protected String staatId;
    @XmlElement(name = "Plz")
    protected String plz;

    /**
     * Gets the value of the staatId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaatId() {
        return staatId;
    }

    /**
     * Sets the value of the staatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaatId(String value) {
        this.staatId = value;
    }

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
