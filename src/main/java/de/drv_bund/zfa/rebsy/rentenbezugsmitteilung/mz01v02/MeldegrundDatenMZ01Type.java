//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.19 at 03:20:07 PM CET 
//


package de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v02;

import de.drv_bund.zfa.zfa_standardtypen.v02.TestmerkerType;
import model.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MeldegrundDatenMZ01Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeldegrundDatenMZ01Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KdNr" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}KdNrType"/>
 *         &lt;element name="MipfOrdBg" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}Ordnungsmerkmal_RBMSType" minOccurs="0"/>
 *         &lt;element name="LeMm" type="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v02}MerkmalLeistungType" minOccurs="0"/>
 *         &lt;element name="VtNr" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}VtNrType" minOccurs="0"/>
 *         &lt;element name="DtErstUr" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}DatumZeitMilliSecType" minOccurs="0"/>
 *         &lt;element name="DtErstAkt" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}DatumZeitMilliSecType"/>
 *         &lt;element name="MmMeld" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}MmMeldType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="testmerker" type="{http://www.zfa.drv-bund.de/zfa_standardtypen/v02}TestmerkerType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Entity(name = "MeldegrundDatenMZ01Type2")
@Table(name = "MeldegrundDatenMZ01Type2")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeldegrundDatenMZ01Type", propOrder = {
    "kdNr",
    "mipfOrdBg",
    "leMm",
    "vtNr",
    "dtErstUr",
    "dtErstAkt",
    "mmMeld"
})
public class MeldegrundDatenMZ01Type extends BaseEntity {

    @Column(name = "kdNr2")
    @XmlElement(name = "KdNr", required = true)
    protected String kdNr;
    @XmlElement(name = "MipfOrdBg")
    protected String mipfOrdBg;
    @XmlElement(name = "LeMm")
    protected String leMm;
    @XmlElement(name = "VtNr")
    protected String vtNr;
    @XmlElement(name = "DtErstUr")
    protected String dtErstUr;
    @XmlElement(name = "DtErstAkt", required = true)
    protected String dtErstAkt;
    @XmlElement(name = "MmMeld")
    @XmlSchemaType(name = "unsignedByte")
    protected short mmMeld;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TESTMERKER_ID")
    @XmlAttribute(name = "testmerker")
    protected TestmerkerType testmerker;

    /**
     * Gets the value of the kdNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdNr() {
        return kdNr;
    }

    /**
     * Sets the value of the kdNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdNr(String value) {
        this.kdNr = value;
    }

    /**
     * Gets the value of the mipfOrdBg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMipfOrdBg() {
        return mipfOrdBg;
    }

    /**
     * Sets the value of the mipfOrdBg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMipfOrdBg(String value) {
        this.mipfOrdBg = value;
    }

    /**
     * Gets the value of the leMm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeMm() {
        return leMm;
    }

    /**
     * Sets the value of the leMm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeMm(String value) {
        this.leMm = value;
    }

    /**
     * Gets the value of the vtNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtNr() {
        return vtNr;
    }

    /**
     * Sets the value of the vtNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtNr(String value) {
        this.vtNr = value;
    }

    /**
     * Gets the value of the dtErstUr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtErstUr() {
        return dtErstUr;
    }

    /**
     * Sets the value of the dtErstUr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtErstUr(String value) {
        this.dtErstUr = value;
    }

    /**
     * Gets the value of the dtErstAkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtErstAkt() {
        return dtErstAkt;
    }

    /**
     * Sets the value of the dtErstAkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtErstAkt(String value) {
        this.dtErstAkt = value;
    }

    /**
     * Gets the value of the mmMeld property.
     * 
     */
    public short getMmMeld() {
        return mmMeld;
    }

    /**
     * Sets the value of the mmMeld property.
     * 
     */
    public void setMmMeld(short value) {
        this.mmMeld = value;
    }

    /**
     * Gets the value of the testmerker property.
     * 
     * @return
     *     possible object is
     *     {@link TestmerkerType }
     *     
     */
    public TestmerkerType getTestmerker() {
        return testmerker;
    }

    /**
     * Sets the value of the testmerker property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestmerkerType }
     *     
     */
    public void setTestmerker(TestmerkerType value) {
        this.testmerker = value;
    }

}
