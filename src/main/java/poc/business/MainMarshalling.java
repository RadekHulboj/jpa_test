package poc.business;

//import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ01Meldung;

import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ02Meldung;
import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ03Meldung;
import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ04Meldung;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainMarshalling {

    public static void main (String[] args) throws JAXBException, IOException {
        MZ02Meldung mz01Meldung = unmarshallEzvk();
    }

    public static MZ02Meldung unmarshallEzvk() {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(MZ02Meldung.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        MZ02Meldung unmarshal = null;
        try {
            unmarshal = (MZ02Meldung) context.createUnmarshaller()
                    .unmarshal(new FileReader("./src/main/resources/mz02.txt"));
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return unmarshal;
    }

    public static MZ03Meldung unmarshall03Type() {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(MZ03Meldung.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        MZ03Meldung unmarshal = null;
        try {
            unmarshal = (MZ03Meldung) context.createUnmarshaller()
                    .unmarshal(new FileReader("./src/main/resources/mz03.txt"));
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return unmarshal;
    }

    public static MZ04Meldung unmarshall04Type() {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(MZ04Meldung.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        MZ04Meldung unmarshal = null;
        try {
            unmarshal = (MZ04Meldung) context.createUnmarshaller()
                    .unmarshal(new FileReader("./src/main/resources/mz04.txt"));
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return unmarshal;
    }
}
