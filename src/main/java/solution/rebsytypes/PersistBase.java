package solution.rebsytypes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class PersistBase {

    protected static final String customerDB = "CustomerDB";
    protected static EntityManagerFactory factory = Persistence.createEntityManagerFactory(customerDB);
    protected static EntityManager entityManager = factory.createEntityManager();


    protected static void beginTransaction(EntityManager entityManager) {
        entityManager.getTransaction().begin();
    }

    protected static void commitTransaction(EntityManagerFactory factory, EntityManager entityManager) {
        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
    }
}
