package poc.oracle.sandboxUni;

import org.hibernate.annotations.GenericGenerator;
import poc.oracle.sandbox.Items;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CARTUNIS")
public class CartUni {

    @Id
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementorCart", strategy = "increment")
    @Column(name = "cart_id")
    private long id;


    @OneToMany
    @JoinColumn(name="OWNER_ID", referencedColumnName="cart_id")
    private Set<ItemUni> items;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Set<ItemUni> getItems() {
        return items;
    }

    public void setItems(Set<ItemUni> items) {
        this.items = items;
    }

}

