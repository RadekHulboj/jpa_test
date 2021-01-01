package poc.oracle.sandbox;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Embeddable
public class ContactPerson /*extends BaseEntityTest //this is also error but fortunately not our case */{

    private Integer id;

    @Id
    @Column(name = "CONTACTPERSON_ID")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementor", strategy = "increment")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String firstName;
    private String lastName;
    private String phone;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
