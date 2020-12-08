package business;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public final class ConverterUtility {
    private ConverterUtility() {}

    public static XMLGregorianCalendar convertToXmlGregCal(Date target) {
        Instant instant =  target.toInstant();
        ZonedDateTime dateTime = instant.atZone(ZoneId.systemDefault());
        GregorianCalendar c = GregorianCalendar.from(dateTime);
        XMLGregorianCalendar leJahr = null;
        try {
            leJahr = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        return leJahr;
    }

    public static Date convertToDate(XMLGregorianCalendar target) {
        if(Objects.isNull(target)) return null;
        return target.toGregorianCalendar().getTime();
    }
}
