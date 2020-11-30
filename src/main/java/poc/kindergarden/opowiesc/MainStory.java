package poc.kindergarden.opowiesc;

import java.util.Date;
import java.util.logging.Logger;

import static poc.kindergarden.opowiesc.BookStrory.story;

public class MainStory {

    static Logger logger = Logger.getLogger(MainStory.class.getName());

    public static void main (String[] args) {
        story((fajnie, kara) -> {
            Date wDniu = new Date();
            Krolewna.przyjechala(wDniu, (pieniadze, przywiozla)-> {
                if(Boolean.TRUE.equals(przywiozla)) fajnie.accept(pieniadze);
                else {
                    String ostrzezenie  = kara.get();
                    logger.info(ostrzezenie);
                }
            });
        });
    }
}
