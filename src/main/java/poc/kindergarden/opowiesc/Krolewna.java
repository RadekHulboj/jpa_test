package poc.kindergarden.opowiesc;

import java.util.Date;
import java.util.function.BiConsumer;

class Krolewna {
    static void przyjechala(Date date, BiConsumer<Integer, Boolean> biConsumer) {
        biConsumer.accept(1, false);
    }
}
