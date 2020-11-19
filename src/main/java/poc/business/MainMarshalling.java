package poc.business;

import de.drv_bund.zfa.rebsy.rentenbezugsmitteilung.MZ01Meldung;
import poc.model.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class MainMarshalling {

    public static void main (String[] args) throws JAXBException, IOException {
        marshal();
        Book unmarshall = unmarshall();
        MZ01Meldung mz01Meldung = unmarshallEzvk();
    }

    public static void marshal() throws JAXBException {
        Book book = new Book();
        book.setId(1L);
        book.setName("Book1");
        book.setAuthor("Author1");
        book.setDate(new Date());

        JAXBContext context = JAXBContext.newInstance(Book.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(book, new File("./src/main/resources/book.xml"));
    }

    public static Book unmarshall() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Book.class);
        return (Book) context.createUnmarshaller()
                .unmarshal(new FileReader("./src/main/resources/book.xml"));
    }


    public static MZ01Meldung unmarshallEzvk() {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(MZ01Meldung.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        MZ01Meldung unmarshal = null;
        try {
            unmarshal = (MZ01Meldung) context.createUnmarshaller()
                    .unmarshal(new FileReader("./src/main/resources/anonymization.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return unmarshal;
    }
}
