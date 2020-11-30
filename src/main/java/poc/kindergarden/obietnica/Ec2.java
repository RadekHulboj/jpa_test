package poc.kindergarden.obietnica;

import java.util.function.BiConsumer;

public interface Ec2 {
    static void runInstances(String param, BiConsumer<Boolean, String> biConsumer) {
        biConsumer.accept(false, "moja data");
    }
}
