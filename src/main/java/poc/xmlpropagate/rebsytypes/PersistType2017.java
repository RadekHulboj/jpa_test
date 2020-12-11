package poc.xmlpropagate.rebsytypes;

import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ02Meldung;
import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ03Meldung;
import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v03.Daten;
import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import java.util.List;

import static poc.business.MainMarshalling.unmarshall03Type;
import static poc.business.MainMarshalling.unmarshallEzvk;

public class PersistType2017 extends PersistBase implements IPersist {

    Logger logger = Logger.getLogger(PersistType2017.class);

    @Override
    public void execute() {
        mz02Type();
        logger.info("PersistType2017 executed on db");
    }

    private static void mz02Type() {
        beginTransaction(entityManager);
        m02(entityManager);
        commitTransaction(factory, entityManager);
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
}
