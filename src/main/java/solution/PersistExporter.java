package solution;

import ch.forumedia.futura.server.bes.zfa.versionierung.konfig.RebsyVersionDefinition;
import solution.rebsytypes.PersistFactory;

import javax.persistence.EntityManager;
import java.util.function.Function;

class PersistExporter {
    private PersistExporter() {}

    static void export(Function<String, RebsyVersionDefinition> rebsyVersionDefinition, String filePath, EntityManager entityManager) {
        PersistFactory.create(rebsyVersionDefinition.apply(filePath)).export(entityManager, filePath);
    }
}
