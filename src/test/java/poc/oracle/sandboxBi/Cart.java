package poc.oracle.sandboxBi;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;
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


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FK_OWNER_ID")
    Owner owner;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }


    @Transient
    XMLGregorianCalendar vorBeginn;

    public XMLGregorianCalendar getVorBeginn() {
        return vorBeginn;
    }

    public void setVorBeginn(XMLGregorianCalendar vorBeginn) {
        this.vorBeginn = vorBeginn;
    }

    @Basic
    @Access(AccessType.PROPERTY)
    @Column(name = "VORBEGINN")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDateTimeItem() {
        return vorBeginn.toGregorianCalendar().getTime();
    }

    public void setDateTimeItem(Date target) {
        Instant instant =  target.toInstant();
        ZonedDateTime dateTime = instant.atZone(ZoneId.systemDefault());
        GregorianCalendar c = GregorianCalendar.from(dateTime);
        XMLGregorianCalendar date2 = null;
        try {
            date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        setVorBeginn(date2);
    }

}

