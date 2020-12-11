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

    Logger logger = Logger.getLogger(PersistType2018.class);

    @Override
    public void export() {
        mz03Type();
        logger.info("PersistType2018 executed on db");
    }

    private static void mz03Type() {
        beginTransaction(entityManager);
        m03(entityManager);
        commitTransaction(factory, entityManager);
    }

    private static void m03(EntityManager entityManager) {
        MZ03Meldung mz03 = unmarshall03Type();
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
                    .unmarshal(new FileReader("./src/main/resources/input/mz03.txt"));
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return unmarshal;
    }
}
