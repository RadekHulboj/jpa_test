package solution.rebsytypes;

import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ03Meldung;
import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v03.Daten;
import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;


public class PersistType2018 extends PersistBase implements IPersist {

    static Logger logger = Logger.getLogger(PersistType2018.class);

    @Override
    public void export(EntityManager entityManager, String fileName) {
        m03(entityManager, fileName);
        logger.info("PersistType2018 executed on db");
    }

    private static void m03(EntityManager entityManager, String fileName) {
        MZ03Meldung mz03 = unmarshall03Type(fileName);
        List<Daten> daten = mz03.getDatenOrDatenOrDaten();
        mz03.setDatenOrDatenOrDaten(null);
        entityManager.persist(mz03);
        daten.get(0).setMz03MeldungId(mz03.getId());
        daten.get(1).setMz03MeldungId(mz03.getId());
        entityManager.persist(daten.get(0));
        entityManager.persist(daten.get(1));
        entityManager.persist(daten.get(0).getMeldegrundDaten());
        entityManager.persist(daten.get(1).getMeldegrundDaten());
        mz03.setDatenOrDatenOrDaten(daten);
        entityManager.persist(mz03);
    }


    public static MZ03Meldung unmarshall03Type(String fileName) {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(MZ03Meldung.class);
        } catch (JAXBException e) {
            logger.error(e.toString());
            e.printStackTrace();
        }
        MZ03Meldung unmarshal = null;
        try {
            unmarshal = (MZ03Meldung) context.createUnmarshaller()
                    .unmarshal(new FileReader(fileName));
        } catch (JAXBException | FileNotFoundException e) {
            logger.error(e.toString());
            e.printStackTrace();
        }
        return unmarshal;
    }
}
