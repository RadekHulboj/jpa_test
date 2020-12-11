package solution.rebsytypes;

import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ04Meldung;
import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v04.Daten;
import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;


public class PersistType2019 extends PersistBase implements IPersist {

    Logger logger = Logger.getLogger(PersistType2019.class);

    @Override
    public void export(EntityManager entityManager, String fileName) {
        m04(entityManager, fileName);
        logger.info("PersistType2019 executed on db");
    }

    private static void m04(EntityManager entityManager, String fileName) {
        MZ04Meldung mz04 = unmarshall04Type(fileName);
        List<Daten> datenOrDatenOrDaten = mz04.getDatenOrDatenOrDaten();
        mz04.setDatenOrDatenOrDaten(null);
        entityManager.persist(mz04);
        datenOrDatenOrDaten.get(0).setMz04MeldungId(mz04.getId());
        datenOrDatenOrDaten.get(1).setMz04MeldungId(mz04.getId());
        entityManager.persist(datenOrDatenOrDaten.get(0));
        entityManager.persist(datenOrDatenOrDaten.get(1));
        entityManager.persist(datenOrDatenOrDaten.get(0).getMeldegrundDaten());
        entityManager.persist(datenOrDatenOrDaten.get(1).getMeldegrundDaten());
        mz04.setDatenOrDatenOrDaten(datenOrDatenOrDaten);
        entityManager.persist(mz04);
    }

    public static MZ04Meldung unmarshall04Type(String fileName) {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(MZ04Meldung.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        MZ04Meldung unmarshal = null;
        try {
            unmarshal = (MZ04Meldung) context.createUnmarshaller()
                    .unmarshal(new FileReader(fileName));
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return unmarshal;
    }
}
