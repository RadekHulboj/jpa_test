package poc.xmlpropagate;

import ch.forumedia.futura.server.bes.zfa.versionierung.konfig.RebsyVersionDefinition;
import poc.xmlpropagate.rebsytypes.PersistFactory;

import java.util.function.Function;

class PersistExporter {

    static void export(Function<String, RebsyVersionDefinition> rebsyVersionDefinition, String filePath) {
        PersistFactory.create(rebsyVersionDefinition.apply(filePath)).execute();
    }
}
