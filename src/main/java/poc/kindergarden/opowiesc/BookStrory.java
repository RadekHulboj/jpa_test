package poc.kindergarden.opowiesc;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

class BookStrory {
    static void story(BiConsumer<Consumer<Integer>, Supplier<String>> biConsumer) {
        Supplier<String> kara = () -> "malo pieniazkow przywiozla";
        Consumer<Integer> dobro = integer -> { };
        biConsumer.accept(dobro, kara);
    }
}
