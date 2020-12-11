package solution.rebsytypes;

import ch.forumedia.futura.server.bes.zfa.versionierung.konfig.RebsyVersionDefinition;

public class PersistFactory {
    public static IPersist create(RebsyVersionDefinition rebsyVersionDefinition) {
        IPersist retVal = null;
        String xmlVersionString = rebsyVersionDefinition.getXmlVersion().getXmlVersionString();
        switch(xmlVersionString) {
            case "V02": {
                retVal = new PersistType2017();
                break ;
            }
            case "V03": {
                retVal = new PersistType2018();
                break ;
            }
            case "V04": {
                retVal = new PersistType2019();
                break ;
            }
        }
        return retVal;
    }
}
