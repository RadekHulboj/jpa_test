package poc.oracle.sandboxUni;

import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class HibernateOneToManyAnnotationUniMainIntegrationTest {
@Test
    public void uniDirectionOrm() {
    //when
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("CustomerDBTest");
    EntityManager entityManager = factory.createEntityManager();

    entityManager.getTransaction().begin();

    //
    CartUni cart = new CartUni();
    entityManager.persist(cart);
    //
    ItemUni item1 = new ItemUni();
    ItemUni item2 = new ItemUni();
    Set<ItemUni> itemsSet = new HashSet<>();
    item1.setDetail("Ham");
    item1.setOwnerId(cart.getId());
    item2.setDetail("Chin");
    item2.setOwnerId(cart.getId());
    itemsSet.add(item1);
    itemsSet.add(item2);
    cart.setItems(itemsSet);


    //
    entityManager.persist(item1);
    entityManager.persist(item2);
    //

    entityManager.getTransaction().commit();
    entityManager.close();
    factory.close();
    //then
    Assert.assertNotNull(entityManager);
}
}