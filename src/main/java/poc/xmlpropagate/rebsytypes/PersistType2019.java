package poc.xmlpropagate.rebsytypes;

import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ03Meldung;
import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ04Meldung;
import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v04.Daten;
import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import java.util.List;

import static poc.business.MainMarshalling.unmarshall03Type;
import static poc.business.MainMarshalling.unmarshall04Type;

public class PersistType2019 extends PersistBase implements IPersist {

    Logger logger = Logger.getLogger(PersistType2019.class);

    @Override
    public void execute() {
        mz04Type();
        logger.info("PersistType2019 executed on db");
    }

    private static void mz04Type() {
        beginTransaction(entityManager);
        m04(entityManager);
        commitTransaction(factory, entityManager);
    }

    private static void m04(EntityManager entityManager) {
        MZ04Meldung mz04 = unmarshall04Type();
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
}
