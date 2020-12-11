package solution.rebsytypes;

import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ02Meldung;
import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;


public class PersistType2017 extends PersistBase implements IPersist {

    Logger logger = Logger.getLogger(PersistType2017.class);

    @Override
    public void export(EntityManager entityManager) {
        m02(entityManager);
        logger.info("PersistType2017 executed on db");
    }

    private static void m02(EntityManager entityManager) {
        MZ02Meldung mz02Meldung = unmarshallEzvk();
        List<de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v02.Daten> datenOrDatenOrDaten = mz02Meldung.getDatenOrDatenOrDaten();
        mz02Meldung.setDatenOrDatenOrDaten(null);
        entityManager.persist(mz02Meldung);

        datenOrDatenOrDaten.get(0).setMz02MeldungId(mz02Meldung.getId());
        datenOrDatenOrDaten.get(1).setMz02MeldungId(mz02Meldung.getId());
        entityManager.persist(datenOrDatenOrDaten.get(0));
        entityManager.persist(datenOrDatenOrDaten.get(1));

        entityManager.persist(datenOrDatenOrDaten.get(0).getMeldegrundDaten());
        entityManager.persist(datenOrDatenOrDaten.get(1).getMeldegrundDaten());

        mz02Meldung.setDatenOrDatenOrDaten(datenOrDatenOrDaten);

        entityManager.persist(mz02Meldung);
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
                    .unmarshal(new FileReader("./src/main/resources/input/mz02.txt"));
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return unmarshal;
    }
}
