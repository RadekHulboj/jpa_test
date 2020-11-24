package poc.oracle.sandboxUni;

import org.hibernate.annotations.GenericGenerator;
import poc.oracle.sandbox.Cart;

import javax.persistence.*;

@Entity
@Table(name = "ITEMUNIS")
public class ItemUni {

    @Id
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementorItems", strategy = "increment")
    @Column(name = "id")
    private long id;


    @Column(name="OWNER_ID")
    private long ownerId;

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    @Column(name = "itemDetail")
    private String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    // Hibernate requires no-args constructor
    public ItemUni() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
