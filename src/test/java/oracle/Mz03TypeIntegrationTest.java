package oracle;

import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ03Meldung;
import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v03.Daten;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static solution.rebsytypes.PersistType2018.unmarshall03Type;


public class Mz03TypeIntegrationTest {
    @Test
    public void testIfMZ03TypeIsStillWorking() {
        //when
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CustomerDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        MZ03Meldung mz03 = unmarshall03Type(".\\src\\main\\resources\\input\\mz03.txt");
        List<Daten> datenOrDatenOrDaten = mz03.getDatenOrDatenOrDaten();
        mz03.setDatenOrDatenOrDaten(null);
        entityManager.persist(mz03);

        datenOrDatenOrDaten.get(0).setMz03MeldungId(mz03.getId());
        datenOrDatenOrDaten.get(1).setMz03MeldungId(mz03.getId());
        entityManager.persist(datenOrDatenOrDaten.get(0));
        entityManager.persist(datenOrDatenOrDaten.get(1));

        entityManager.persist(datenOrDatenOrDaten.get(0).getMeldegrundDaten());
        entityManager.persist(datenOrDatenOrDaten.get(1).getMeldegrundDaten());

        mz03.setDatenOrDatenOrDaten(datenOrDatenOrDaten);

        entityManager.persist(mz03);

        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();
        //then
        Assert.assertNotNull(entityManager);
    }
}
