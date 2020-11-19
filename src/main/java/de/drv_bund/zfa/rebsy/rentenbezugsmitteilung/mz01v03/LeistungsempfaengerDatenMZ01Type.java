//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.19 at 03:20:07 PM CET 
//


package de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import de.drv_bund.zfa.zfa_standardtypen.v03.AuslandsadresseType;


/**
 * <p>Java class for LeistungsempfaengerDatenMZ01Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeistungsempfaengerDatenMZ01Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdNr" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v03}IdNrType"/>
 *         &lt;element name="NName" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v03}NachnameType"/>
 *         &lt;element name="VWort" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v03}VWortType" minOccurs="0"/>
 *         &lt;element name="NamZu" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v03}NamenszusatzType" minOccurs="0"/>
 *         &lt;element name="Titel" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v03}TitelType" minOccurs="0"/>
 *         &lt;element name="VName" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v03}NameType"/>
 *         &lt;element name="GebDt" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v03}DatumMit0Type"/>
 *         &lt;element ref="{http://www.zfa.drv-bund.de/zfa_standardtypen/v03}Auslandsadresse" minOccurs="0"/>
 *         &lt;element name="StaatAn" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v03}StaatSchluesselType" maxOccurs="50" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeistungsempfaengerDatenMZ01Type", propOrder = {
    "idNr",
    "nName",
    "vWort",
    "namZu",
    "titel",
    "vName",
    "gebDt",
    "auslandsadresse",
    "staatAn"
})
public class LeistungsempfaengerDatenMZ01Type {

    @XmlElement(name = "IdNr", required = true)
    protected String idNr;
    @XmlElement(name = "NName", required = true)
    protected String nName;
    @XmlElement(name = "VWort")
    protected String vWort;
    @XmlElement(name = "NamZu")
    protected String namZu;
    @XmlElement(name = "Titel")
    protected String titel;
    @XmlElement(name = "VName", required = true)
    protected String vName;
    @XmlElement(name = "GebDt", required = true)
    protected String gebDt;
    @XmlElement(name = "Auslandsadresse", namespace = "http://www.zfa.drv-bund.de/zfa_standardtypen/v03")
    protected AuslandsadresseType auslandsadresse;
    @XmlElement(name = "StaatAn")
    protected List<String> staatAn;

    /**
     * Gets the value of the idNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNr() {
        return idNr;
    }

    /**
     * Sets the value of the idNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNr(String value) {
        this.idNr = value;
    }

    /**
     * Gets the value of the nName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNName() {
        return nName;
    }

    /**
     * Sets the value of the nName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNName(String value) {
        this.nName = value;
    }

    /**
     * Gets the value of the vWort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVWort() {
        return vWort;
    }

    /**
     * Sets the value of the vWort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVWort(String value) {
        this.vWort = value;
    }

    /**
     * Gets the value of the namZu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamZu() {
        return namZu;
    }

    /**
     * Sets the value of the namZu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamZu(String value) {
        this.namZu = value;
    }

    /**
     * Gets the value of the titel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the value of the titel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Gets the value of the vName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVName() {
        return vName;
    }

    /**
     * Sets the value of the vName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVName(String value) {
        this.vName = value;
    }

    /**
     * Gets the value of the gebDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGebDt() {
        return gebDt;
    }

    /**
     * Sets the value of the gebDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGebDt(String value) {
        this.gebDt = value;
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
     * Gets the value of the staatAn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staatAn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaatAn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStaatAn() {
        if (staatAn == null) {
            staatAn = new ArrayList<String>();
        }
        return this.staatAn;
    }

}
