//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.19 at 03:20:07 PM CET 
//


package de.drv_bund.zfa.rebsy.rentenbezugsmitteilung;

import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v04.Daten;
import model.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="100">
 *         &lt;choice>
 *           &lt;element ref="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v01}Daten"/>
 *           &lt;element ref="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v02}Daten"/>
 *           &lt;element ref="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v03}Daten"/>
 *           &lt;element ref="{http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v04}Daten"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Entity
@Table(name = "MELDUNGEN04")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "datenOrDatenOrDaten"
})
@XmlRootElement(name = "MZ01Meldung")
public class MZ04Meldung extends BaseEntity {

    @XmlElements({
        @XmlElement(name = "Daten", namespace = "http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v01", type = Daten.class),
        @XmlElement(name = "Daten", namespace = "http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v02", type = Daten.class),
        @XmlElement(name = "Daten", namespace = "http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v03", type = Daten.class),
        @XmlElement(name = "Daten", namespace = "http://www.zfa.drv-bund.de/rebsy/rentenbezugsmitteilung/mz01v04", type = de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v04.Daten.class)
    })
    @OneToMany
    @JoinColumn(name="MZ04MELDUNG_ID", referencedColumnName="ID")
    protected List<Daten> datenOrDatenOrDaten;

    /**
     * Gets the value of the datenOrDatenOrDaten property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datenOrDatenOrDaten property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatenOrDatenOrDaten().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Daten }
     * {@link Daten }
     * {@link Daten }
     * {@link de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v04.Daten }
     * 
     * 
     */
    public List<Daten> getDatenOrDatenOrDaten() {
        if (datenOrDatenOrDaten == null) {
            datenOrDatenOrDaten = new ArrayList<Daten>();
        }
        return this.datenOrDatenOrDaten;
    }

    public void setDatenOrDatenOrDaten(List<Daten> datenOrDatenOrDaten) {
        this.datenOrDatenOrDaten = datenOrDatenOrDaten;
    }
}
