package poc.oracle.sandboxBi;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CART")
public class Cart {

    @Id
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementorCart", strategy = "increment")
    @Column(name = "cart_id")
    private long id;


    @OneToMany(mappedBy = "cart")
    private Set<Items> items;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Set<Items> getItems() {
        return items;
    }

    public void setItems(Set<Items> items) {
        this.items = items;
    }

}

