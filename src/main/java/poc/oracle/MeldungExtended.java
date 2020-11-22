package poc.oracle;

import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ01Meldung;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Deprecated
@Entity
@Table(name = "MELDUNGEN")
public class MeldungExtended  extends MZ01Meldung {
    private Long id;

    @Id
    @Column(name = "MELDUNG_ID")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementor", strategy = "increment")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
