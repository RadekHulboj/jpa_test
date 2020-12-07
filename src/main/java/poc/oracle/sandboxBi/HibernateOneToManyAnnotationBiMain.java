package poc.oracle.sandboxBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class HibernateOneToManyAnnotationBiMain {
    public static void main(String[] args) throws DatatypeConfigurationException {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CustomerDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Cart cart = new Cart();
        Owner owner = new Owner();

        setVorBeginn(cart);

        owner.setName("Radzio");
        cart.setOwner(owner);
        Items item1 = new Items(cart);
        Items item2 = new Items(cart);
        Set<Items> itemsSet = new HashSet<>();
        item1.setDetail("Ham");
        item2.setDetail("Chin");
        itemsSet.add(item1);
        itemsSet.add(item2);
        cart.setItems(itemsSet);

        entityManager.persist(owner);
        entityManager.persist(item1);
        entityManager.persist(item2);
        entityManager.persist(cart);

        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();
    }

    private static void setVorBeginn(Cart cart) throws DatatypeConfigurationException {
        LocalDate localDate = LocalDate.of(2019, 4, 25);

        XMLGregorianCalendar xmlGregorianCalendar =
                DatatypeFactory.newInstance().newXMLGregorianCalendar(localDate.toString());
        cart.setVorBeginn(xmlGregorianCalendar);
    }
}
