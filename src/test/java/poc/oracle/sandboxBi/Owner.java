package poc.oracle.sandboxBi;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "OWNER")
public class Owner {

    @Id
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementorOwner", strategy = "increment")
    @Column(name = "owner_id")
    private long id;

    @Column(name = "name")
    String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
