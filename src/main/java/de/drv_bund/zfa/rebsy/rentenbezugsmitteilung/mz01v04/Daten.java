//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.19 at 03:20:07 PM CET 
//


package de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v04;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import de.drv_bund.zfa.zfa_standardtypen.v03.AuftragnehmerDatenType;
import de.drv_bund.zfa.zfa_standardtypen.v03.FehlerDatenFachlichType;
import de.drv_bund.zfa.zfa_standardtypen.v03.MitteilungspflichtigeStelleDatenType;
import model.BaseEntity;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeldegrundDaten" type="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v04}MeldegrundDatenMZ01Type"/>
 *         &lt;element ref="{http://www.zfa.drv-bund.de/zfa_standardtypen/v03}FehlerDaten" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.zfa.drv-bund.de/zfa_standardtypen/v03}MitteilungspflichtigeStelleDaten"/>
 *         &lt;element name="LeistungsempfaengerDaten" type="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v04}LeistungsempfaengerDatenMZ01Type"/>
 *         &lt;element name="BezugsDaten" type="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v04}BezugsDatenType"/>
 *         &lt;element name="Leistungsbetrag" type="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v04}LeistungsbetragType" maxOccurs="55"/>
 *         &lt;element name="Vorzeitraeume" type="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v04}VorzeitraeumeType" maxOccurs="30" minOccurs="0"/>
 *         &lt;element name="BeitragsDaten" type="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v04}BeitragsDatenType" maxOccurs="96" minOccurs="0"/>
 *         &lt;element ref="{http://www.zfa.drv-bund.de/zfa_standardtypen/v03}AuftragnehmerDaten" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Entity(name="daten4")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "mz04MeldungId",
    "meldegrundDaten",
    "fehlerDaten",
    "mitteilungspflichtigeStelleDaten",
    "leistungsempfaengerDaten",
    "bezugsDaten",
    "leistungsbetrag",
    "vorzeitraeume",
    "beitragsDaten",
    "auftragnehmerDaten"
})
@XmlRootElement(name = "Daten")
public class Daten extends BaseEntity {

    @Column(name = "MZ04MELDUNG_ID")
    private Long mz04MeldungId;

    public void setMz04MeldungId(Long mz04MeldungId) {
        this.mz04MeldungId = mz04MeldungId;
    }

    public Long getMz04MeldungId() {
        return mz04MeldungId;
    }

    @ManyToOne
    @JoinColumn(name ="fk_meldegrunddaten")
    @XmlElement(name = "MeldegrundDaten", required = true)
    protected MeldegrundDatenMZ01Type meldegrundDaten;
    @OneToMany(mappedBy = "daten")
    @XmlElement(name = "FehlerDaten", namespace = "http://www.zfa.drv-bund.de/zfa_standardtypen/v03")
    protected List<FehlerDatenFachlichType> fehlerDaten;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_mitteilungspflichtigestelledaten")
    @XmlElement(name = "MitteilungspflichtigeStelleDaten", namespace = "http://www.zfa.drv-bund.de/zfa_standardtypen/v03", required = true)
    protected MitteilungspflichtigeStelleDatenType mitteilungspflichtigeStelleDaten;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_leistungsempfaengerdaten")
    @XmlElement(name = "LeistungsempfaengerDaten", required = true)
    protected LeistungsempfaengerDatenMZ01Type leistungsempfaengerDaten;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_bezugsdaten")
    @XmlElement(name = "BezugsDaten", required = true)
    protected BezugsDatenType bezugsDaten;
    @OneToMany(mappedBy = "daten")
    @XmlElement(name = "Leistungsbetrag", required = true)
    protected List<LeistungsbetragType> leistungsbetrag;
    @Transient
    @XmlElement(name = "Vorzeitraeume")
    protected List<VorzeitraeumeType> vorzeitraeume;
    @Transient
    @XmlElement(name = "BeitragsDaten")
    protected List<BeitragsDatenType> beitragsDaten;
    @Transient
    @XmlElement(name = "AuftragnehmerDaten", namespace = "http://www.zfa.drv-bund.de/zfa_standardtypen/v03")
    protected AuftragnehmerDatenType auftragnehmerDaten;

    /**
     * Gets the value of the meldegrundDaten property.
     * 
     * @return
     *     possible object is
     *     {@link MeldegrundDatenMZ01Type }
     *     
     */
    public MeldegrundDatenMZ01Type getMeldegrundDaten() {
        return meldegrundDaten;
    }

    /**
     * Sets the value of the meldegrundDaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeldegrundDatenMZ01Type }
     *     
     */
    public void setMeldegrundDaten(MeldegrundDatenMZ01Type value) {
        this.meldegrundDaten = value;
    }

    /**
     * Gets the value of the fehlerDaten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fehlerDaten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFehlerDaten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FehlerDatenFachlichType }
     * 
     * 
     */
    public List<FehlerDatenFachlichType> getFehlerDaten() {
        if (fehlerDaten == null) {
            fehlerDaten = new ArrayList<FehlerDatenFachlichType>();
        }
        return this.fehlerDaten;
    }

    /**
     * Gets the value of the mitteilungspflichtigeStelleDaten property.
     * 
     * @return
     *     possible object is
     *     {@link MitteilungspflichtigeStelleDatenType }
     *     
     */
    public MitteilungspflichtigeStelleDatenType getMitteilungspflichtigeStelleDaten() {
        return mitteilungspflichtigeStelleDaten;
    }

    /**
     * Sets the value of the mitteilungspflichtigeStelleDaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link MitteilungspflichtigeStelleDatenType }
     *     
     */
    public void setMitteilungspflichtigeStelleDaten(MitteilungspflichtigeStelleDatenType value) {
        this.mitteilungspflichtigeStelleDaten = value;
    }

    /**
     * Gets the value of the leistungsempfaengerDaten property.
     * 
     * @return
     *     possible object is
     *     {@link LeistungsempfaengerDatenMZ01Type }
     *     
     */
    public LeistungsempfaengerDatenMZ01Type getLeistungsempfaengerDaten() {
        return leistungsempfaengerDaten;
    }

    /**
     * Sets the value of the leistungsempfaengerDaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeistungsempfaengerDatenMZ01Type }
     *     
     */
    public void setLeistungsempfaengerDaten(LeistungsempfaengerDatenMZ01Type value) {
        this.leistungsempfaengerDaten = value;
    }

    /**
     * Gets the value of the bezugsDaten property.
     * 
     * @return
     *     possible object is
     *     {@link BezugsDatenType }
     *     
     */
    public BezugsDatenType getBezugsDaten() {
        return bezugsDaten;
    }

    /**
     * Sets the value of the bezugsDaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link BezugsDatenType }
     *     
     */
    public void setBezugsDaten(BezugsDatenType value) {
        this.bezugsDaten = value;
    }

    /**
     * Gets the value of the leistungsbetrag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leistungsbetrag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeistungsbetrag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LeistungsbetragType }
     * 
     * 
     */
    public List<LeistungsbetragType> getLeistungsbetrag() {
        if (leistungsbetrag == null) {
            leistungsbetrag = new ArrayList<LeistungsbetragType>();
        }
        return this.leistungsbetrag;
    }

    /**
     * Gets the value of the vorzeitraeume property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vorzeitraeume property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVorzeitraeume().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VorzeitraeumeType }
     * 
     * 
     */
    public List<VorzeitraeumeType> getVorzeitraeume() {
        if (vorzeitraeume == null) {
            vorzeitraeume = new ArrayList<VorzeitraeumeType>();
        }
        return this.vorzeitraeume;
    }

    /**
     * Gets the value of the beitragsDaten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beitragsDaten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeitragsDaten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeitragsDatenType }
     * 
     * 
     */
    public List<BeitragsDatenType> getBeitragsDaten() {
        if (beitragsDaten == null) {
            beitragsDaten = new ArrayList<BeitragsDatenType>();
        }
        return this.beitragsDaten;
    }

    /**
     * Gets the value of the auftragnehmerDaten property.
     * 
     * @return
     *     possible object is
     *     {@link AuftragnehmerDatenType }
     *     
     */
    public AuftragnehmerDatenType getAuftragnehmerDaten() {
        return auftragnehmerDaten;
    }

    /**
     * Sets the value of the auftragnehmerDaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuftragnehmerDatenType }
     *     
     */
    public void setAuftragnehmerDaten(AuftragnehmerDatenType value) {
        this.auftragnehmerDaten = value;
    }

}
