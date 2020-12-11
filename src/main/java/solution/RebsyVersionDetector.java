package solution;

import ch.forumedia.futura.server.bes.zfa.leser.MZ01VersionException;
import ch.forumedia.futura.server.bes.zfa.versionierung.konfig.RebsyVersionDefinition;
import ch.forumedia.futura.server.bes.zfa.versionierung.konfig.RebsyVersionDefinitionErmittler;
import ch.forumedia.futura.server.plf.pro.exception.MandantParameterException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

final class RebsyVersionDetector {
    private RebsyVersionDetector() {
    }

    static RebsyVersionDefinition detect(final String fileName) {
        RebsyVersionDefinition rebsyVersionFuerXmlVersion = null;
        try {
            rebsyVersionFuerXmlVersion = RebsyVersionDefinitionErmittler.getRebsyVersionFuerXmlVersion(
                    new String(Files.readAllBytes(Paths.get(fileName)))
            );
            return rebsyVersionFuerXmlVersion;
        } catch (MZ01VersionException | MandantParameterException | IOException e ) {
            e.printStackTrace();
        }
        return rebsyVersionFuerXmlVersion;
    }
}
