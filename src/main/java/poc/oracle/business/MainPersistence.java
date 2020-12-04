package poc.oracle.business;

import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ01Meldung;
import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ02Meldung;
import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.mz01v02.Daten;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;

import static poc.business.MainMarshalling.unmarshallEzvk;

public class MainPersistence {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CustomerDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        MZ02Meldung mz02Meldung = unmarshallEzvk();
        List<Daten> datenOrDatenOrDaten = mz02Meldung.getDatenOrDatenOrDaten();
        mz02Meldung.setDatenOrDatenOrDaten(null);
        entityManager.persist(mz02Meldung);


        Long id = mz02Meldung.getId();

        datenOrDatenOrDaten.get(0).setMz01MeldungId(mz02Meldung.getId());
        datenOrDatenOrDaten.get(1).setMz01MeldungId(mz02Meldung.getId());
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
