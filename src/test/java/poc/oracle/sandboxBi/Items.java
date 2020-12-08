package poc.oracle.sandboxBi;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "ITEMS")
public class Items {

    @Id
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementorItems", strategy = "increment")
    @Column(name = "items_id")
    private long id;


    @ManyToOne
    @JoinColumn(name = "fk_cart_id", nullable = true)
    private Cart cart;

    @Column(name = "itemDetail")
    private String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    // Hibernate requires no-args constructor
    public Items() {
    }

    public Items(Cart c) {
        this.cart = c;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
