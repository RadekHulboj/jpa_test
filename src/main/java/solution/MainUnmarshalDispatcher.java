package solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainUnmarshalDispatcher {
    public static void main(String[] args) {
        //String fileName = "./src/main/resources/input/mz03.txt";
        getXmlList().ifPresent(strings -> strings.forEach(fileName -> {
            PersistExporter.export(RebsyVersionDetector::detect, fileName);
        }));
    }

    private static Optional<List<String>> getXmlList() {
        Optional<List<String>> result = Optional.empty();
        try (Stream<Path> walk = Files.walk(Paths.get("./src/main/resources/input/"))) {

            result = Optional.of(walk.filter(Files::isRegularFile)
                    .map(Path::toString).collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
