package poc.kindergarden;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Promise {

    public static void main(String[] args) {
        new Promise((resolve, reject) ->
                Ec2.runInstances("params", (err, data) -> {
                    if (err) {
                        reject.accept(err);
                    } else {
                        resolve.accept(data);
                    }
                })
        );
    }

    Promise(BiConsumer<Consumer<String>, Consumer<Boolean>> biConsumer) {
        biConsumer.accept(
                data -> System.out.println(data),
                err -> System.out.println(err.toString())
        );
    }

}
