package poc.oracle.sandboxBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class HibernateOneToManyAnnotationBiMain {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CustomerDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Cart cart = new Cart();
        Items item1 = new Items(cart);
        Items item2 = new Items(cart);
        Set<Items> itemsSet = new HashSet<>();
        item1.setDetail("Ham");
        item2.setDetail("Chin");
        itemsSet.add(item1);
        itemsSet.add(item2);
        cart.setItems(itemsSet);


        entityManager.persist(item1);
        entityManager.persist(item2);
        entityManager.persist(cart);

        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();
    }
}
