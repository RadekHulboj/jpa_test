package poc.oracle.sandboxUni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class HibernateOneToManyAnnotationUniMain {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CustomerDB");
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
    }
}
