package poc.kindergarden.obietnica;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

@FunctionalInterface
public interface Promise {

    void execute();

    static Promise of(BiConsumer<Consumer<String>, Consumer<Boolean>> biConsumer) {
        return () -> biConsumer.accept(
                data -> System.out.println(data),
                err -> System.out.println(err.toString())
        );
    }

    static void main(String[] args) {
        Promise.of((resolve, reject) ->
                Ec2.runInstances("params", (err, data) -> {
                    if (err) {
                        reject.accept(err);
                    } else {
                        resolve.accept(data);
                    }
                })
        ).execute();
    }
}
