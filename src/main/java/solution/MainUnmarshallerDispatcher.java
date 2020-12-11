package solution;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// TODO: RaHu
//  1) args list of files send as param , directory         prior: 2
//  2) set database connection string
//  3) unify of the database model                          prior: 3
//  4) versioning 2016 added (ask Anna about versioning)    prior: 1
//  5) read from table xml files

public class MainUnmarshallerDispatcher {
    public static void main(String[] args) {
        final String customerDB = "CustomerDB";
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(customerDB);
        EntityManager entityManager = factory.createEntityManager();

        beginTransaction(entityManager);
        persistAllXmlFiles(entityManager);
        commitTransaction(factory, entityManager);
    }

    private static void persistAllXmlFiles(EntityManager entityManager) {
        getXmlFileList().ifPresent(strings -> strings.forEach(fileName -> {
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

    private static Optional<List<String>> getXmlFileList() {
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
