package poc.oracle.sandbox;


import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainHibernateOraclePOCIntegrationTest {
    @Test
    public void simple_test_check_if_rows_are_created_in_oracle_db_for_customer_entity() {
        //when
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CustomerDBTest");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Customer customer1 = new Customer("Nam Ha Minh");
        entityManager.persist(customer1);
        Customer customer2 = new Customer("Nam Ha Minh");

        ContactPerson contactPerson = new ContactPerson();
        contactPerson.setFirstName("Ra");
        contactPerson.setLastName("Hu");
        contactPerson.setPhone("666");
        customer2.setContactPerson(contactPerson);
        entityManager.persist(customer2);



        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();
        //then
        Assert.assertNotNull(entityManager);
    }
}