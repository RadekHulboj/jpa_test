package solution.rebsytypes;

import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ01Meldung;
import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ02Meldung;
import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

// TODO: RaHu this use case was never tested, there is no xml files of that type, I know that they are in the db.
public class PersistType2016 extends PersistBase implements IPersist {

    static Logger logger = Logger.getLogger(PersistType2016.class);

    @Override
    public void export(EntityManager entityManager, String fileName) {
        m01(entityManager, fileName);
        logger.info("PersistType2016 executed on db");
    }

    private static void m01(EntityManager entityManager, String fileName) {
        MZ01Meldung mz01Meldung = unmarshallEzvk(fileName);
        List<de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v01.Daten> datenOrDatenOrDaten = mz01Meldung.getDatenOrDatenOrDaten();
        mz01Meldung.setDatenOrDatenOrDaten(null);
        entityManager.persist(mz01Meldung);

        datenOrDatenOrDaten.get(0).setMz01MeldungId(mz01Meldung.getId());
        datenOrDatenOrDaten.get(1).setMz01MeldungId(mz01Meldung.getId());
        entityManager.persist(datenOrDatenOrDaten.get(0));
        entityManager.persist(datenOrDatenOrDaten.get(1));

        entityManager.persist(datenOrDatenOrDaten.get(0).getMeldegrundDaten());
        entityManager.persist(datenOrDatenOrDaten.get(1).getMeldegrundDaten());

        mz01Meldung.setDatenOrDatenOrDaten(datenOrDatenOrDaten);

        entityManager.persist(mz01Meldung);

    }

    public static MZ01Meldung unmarshallEzvk(String fileName) {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(MZ01Meldung.class);
        } catch (JAXBException e) {
            logger.error(e.toString());
            e.printStackTrace();
        }
        MZ01Meldung unmarshal = null;
        try {
            unmarshal = (MZ01Meldung) context.createUnmarshaller()
                    .unmarshal(new FileReader(fileName));
        } catch (JAXBException | FileNotFoundException e) {
            logger.error(e.toString());
            e.printStackTrace();
        }
        return unmarshal;
    }
}
