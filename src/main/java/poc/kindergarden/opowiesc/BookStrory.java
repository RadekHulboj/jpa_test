package poc.kindergarden.opowiesc;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

class BookStrory {
    BookStrory(BiConsumer<Consumer<Integer>, Supplier<String>> biConsumer) {
        Supplier<String> zlo = () -> "malo pieniazkow przywiozla";
        Consumer<Integer> dobro = integer -> { };
        biConsumer.accept(dobro, zlo);
    }
}
