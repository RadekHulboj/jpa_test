package solution;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// TODO: RaHu
//  1) args list of files send as param , directory         prior: 2 (done)
//  2) set database connection string
//  3) unify of the database model                          prior: 3
//  4) versioning 2016 added (ask Anna about versioning)    prior: 1 ()
//  5) read from table xml files

public class MainUnmarshallerDispatcher {
    public static void main(String[] args) {
        final String customerDB = "CustomerDB";
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(customerDB);
        EntityManager entityManager = factory.createEntityManager();
        String input = parseProgramArguments(args);
        beginTransaction(entityManager);
        persistAllXmlFiles(entityManager, input);
        commitTransaction(factory, entityManager);
    }

    private static void persistAllXmlFiles(EntityManager entityManager, String input) {
        getXmlFileList(input).ifPresent(strings -> strings.forEach(fileName -> {
            PersistExporter.export(RebsyVersionDetector::detect, fileName, entityManager);
        }));
    }

    private static void commitTransaction(EntityManagerFactory factory, EntityManager entityManager) {
        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
    }

    private static void beginTransaction(EntityManager entityManager) {
        entityManager.getTransaction().begin();
    }

    private static Optional<List<String>> getXmlFileList(String input) {
        Optional<List<String>> result = Optional.empty();
        try (Stream<Path> walk = Files.walk(Paths.get(input))) {
            result = Optional.of(walk.filter(Files::isRegularFile)
                    .map(Path::toString).collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static String parseProgramArguments(String[] args) {
        Objects.nonNull(args);
        String retVal = null;
        if (args[0].equals("-input")) retVal = args[1];
        return retVal;
    }
}
