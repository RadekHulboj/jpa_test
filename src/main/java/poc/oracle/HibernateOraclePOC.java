package poc.oracle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateOraclePOC {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CustomerDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Customer customer = new Customer("Nam Ha Minh");
        entityManager.persist(customer);

        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();
    }
}
