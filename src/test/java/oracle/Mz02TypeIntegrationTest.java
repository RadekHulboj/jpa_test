package oracle;

import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ02Meldung;
import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v02.Daten;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static solution.rebsytypes.PersistType2017.unmarshallEzvk;


public class Mz02TypeIntegrationTest {
    @Test
    public void testIfMZ02TypeIsStillWorking() {
        // when
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CustomerDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        MZ02Meldung mz02Meldung = unmarshallEzvk();
        List<Daten> datenOrDatenOrDaten = mz02Meldung.getDatenOrDatenOrDaten();
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

        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();
        // then
        Assert.assertNotNull(entityManager);
    }
}
