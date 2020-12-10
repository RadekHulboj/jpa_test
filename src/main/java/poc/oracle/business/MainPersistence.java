package poc.oracle.business;

import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ01Meldung;
import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ02Meldung;
import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ03Meldung;
import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ04Meldung;
import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v02.Daten;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static poc.business.MainMarshalling.*;

public class MainPersistence {
    public static void main(String[] args) {
        mz04Type();
        //mz03Type();
        //mz02Type();
    }

    private static void mz04Type() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CustomerDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        MZ04Meldung mz04 = unmarshall04Type();
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
    }

    private static void mz03Type() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CustomerDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        MZ03Meldung mz03 = unmarshall03Type();
        List<de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v03.Daten> datenOrDatenOrDaten = mz03.getDatenOrDatenOrDaten();
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
    }

    private static void mz02Type() {
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
    }
}
