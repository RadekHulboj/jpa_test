package solution;

import ch.forumedia.futura.server.bes.zfa.versionierung.konfig.RebsyVersionDefinition;
import solution.rebsytypes.PersistFactory;

import java.util.function.Function;

class PersistExporter {

    static void export(Function<String, RebsyVersionDefinition> rebsyVersionDefinition, String filePath) {
        PersistFactory.create(rebsyVersionDefinition.apply(filePath)).execute();
    }
}
