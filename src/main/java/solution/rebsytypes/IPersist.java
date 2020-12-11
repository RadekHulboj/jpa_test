package solution.rebsytypes;

import javax.persistence.EntityManager;

@FunctionalInterface
public interface IPersist {
    void export(EntityManager entityManager);
}
