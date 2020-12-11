package oracle;

import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ04Meldung;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static solution.rebsytypes.PersistType2019.unmarshall04Type;

public class Mz04TypeIntegrationTest {
    @Test
    public void testIfMZ04TypeIsStillWorking() {
        //when
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CustomerDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        MZ04Meldung mz04 = unmarshall04Type(".\\src\\main\\resources\\input\\mz04.txt");
        List<de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v04.Daten> datenOrDatenOrDaten = mz04.getDatenOrDatenOrDaten();
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

        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();
        //then
        Assert.assertNotNull(entityManager);
    }
}
