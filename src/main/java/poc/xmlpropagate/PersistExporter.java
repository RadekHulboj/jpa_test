package poc.xmlpropagate;

import ch.forumedia.futura.server.bes.zfa.versionierung.konfig.RebsyVersionDefinition;

import java.util.function.Function;

public class PersistExporter {
    public static void export(Function<String, RebsyVersionDefinition> rebsyVersionDefinition, String filePath) {
        RebsyVersionDefinition apply = rebsyVersionDefinition.apply(filePath);
        // TODO: rahu visitator recognise differ types ( types from RebsyVersionDefinition)
    }
}
