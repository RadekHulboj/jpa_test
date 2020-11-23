package poc.oracle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainHibernateOraclePOC {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CustomerDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Customer customer1 = new Customer("Nam Ha Minh");
        entityManager.persist(customer1);
        Customer customer2 = new Customer("Nam Ha Minh");
        entityManager.persist(customer2);

        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();
    }
}
