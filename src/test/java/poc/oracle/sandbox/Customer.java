package poc.oracle.sandbox;

import javax.persistence.*;

@Entity
@Access(AccessType.FIELD)
@Table(name = "CUSTOMERS")
public class Customer extends BaseEntityTest {
    private String name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "id", column = @Column(name = "contact_id"))
    })
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

    public Customer(String name) {
        this.name = name;
    }


}