package poc.xmlpropagate;

import ch.forumedia.futura.server.bes.zfa.leser.MZ01VersionException;
import ch.forumedia.futura.server.bes.zfa.versionierung.konfig.RebsyVersionDefinition;
import ch.forumedia.futura.server.bes.zfa.versionierung.konfig.RebsyVersionDefinitionErmittler;
import ch.forumedia.futura.server.plf.pro.exception.MandantParameterException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UnmarshalDispatcher {
    public static void main (String[] args) throws MandantParameterException, MZ01VersionException, IOException {
        String fileName = "./src/main/resources/mz04.txt";
        RebsyVersionDefinition rebsyVersionFuerXmlVersion = RebsyVersionDefinitionErmittler.getRebsyVersionFuerXmlVersion(
                new String(Files.readAllBytes(Paths.get(fileName)))
        );
        if(RebsyVersionDefinition.VERSION_01_01_2019 == rebsyVersionFuerXmlVersion) {
            int a = 1;
        }
    }
}
