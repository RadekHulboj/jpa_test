package poc.oracle.sandbox;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {
    private Integer id;
    private String name;


//    @Id
//    @Column(name = "CUSTOMER_ID")
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Id
    @Column(name = "CUSTOMER_ID")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementor", strategy = "increment")
    public Integer getId() {
        return id;
    }

    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public  Customer(String name) {
        this.name = name;
    }

}