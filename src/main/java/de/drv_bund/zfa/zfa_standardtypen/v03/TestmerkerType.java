//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.19 at 03:20:07 PM CET 
//


package de.drv_bund.zfa.zfa_standardtypen.v03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestmerkerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TestmerkerType">
 *   &lt;restriction base="{http://www.zfa.drv-bund.de/zfa_standardtypen/v03}String.Latin">
 *     &lt;enumeration value="T"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TestmerkerType")
@XmlEnum
public enum TestmerkerType {

    T;

    public String value() {
        return name();
    }

    public static TestmerkerType fromValue(String v) {
        return valueOf(v);
    }

}
