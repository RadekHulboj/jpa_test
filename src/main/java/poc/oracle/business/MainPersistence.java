package poc.oracle.business;

import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ01Meldung;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static poc.business.MainMarshalling.unmarshallEzvk;

public class MainPersistence {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CustomerDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        MZ01Meldung mz01Meldung = unmarshallEzvk();
        entityManager.persist(mz01Meldung);

        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();
    }
}
