package poc.oracle.sandbox;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Access(AccessType.FIELD)
@Table(name = "CUSTOMERS")
public class Customer {
    private String name;

    @Id
    @Column(name = "CUSTOMER_ID")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementor", strategy = "increment")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Embedded
    ContactPerson contactPerson;

    public ContactPerson getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  Customer(String name) {
        this.name = name;
    }


}