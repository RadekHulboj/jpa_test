package poc.kindergarden.opowiesc;

import java.util.Date;

public class Story {

    public static void main (String[] args) {
        new BookStrory((fajnie, zlo) -> {
            Date w_dniu = new Date();
            Krolewna.przyjechala(w_dniu, (pieniadze, przywiozla)-> {
                if(przywiozla) fajnie.accept(pieniadze);
                else {
                    String przestroga  = zlo.get();
                    System.out.println(przestroga);
                }
            });
        });
    }
}
