package solution.rebsytypes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class PersistBase {

    protected static final String customerDB = "CustomerDB";
    protected static EntityManagerFactory factory;
    protected static EntityManager entityManager;


    protected static void beginTransaction() {
        factory = Persistence.createEntityManagerFactory(customerDB);
        entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
    }

    protected static void commitTransaction(EntityManagerFactory factory, EntityManager entityManager) {
        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
    }
}
