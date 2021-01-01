package poc.oracle.sandbox;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Embeddable
@Access(AccessType.FIELD)
@MappedSuperclass
public abstract class BaseEntityTest {

    @Id
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementor", strategy = "increment")
    protected Long id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
