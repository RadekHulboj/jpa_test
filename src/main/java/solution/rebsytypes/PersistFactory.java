package solution.rebsytypes;

import ch.forumedia.futura.server.bes.zfa.versionierung.konfig.RebsyVersionDefinition;
import org.apache.log4j.Logger;

public class PersistFactory {

    static Logger logger = Logger.getLogger(PersistFactory.class);

    private PersistFactory() {
    }
    public static IPersist create(RebsyVersionDefinition rebsyVersionDefinition) {
        IPersist retVal = null;
        String xmlVersionString = rebsyVersionDefinition.getXmlVersion().getXmlVersionString();
        switch(xmlVersionString) {
            case "V01": {
                retVal = new PersistType2016();
                break ;
            }
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
            default:{
                logger.error("Not supported Rebsy definition, Implement new IPersist for "  + xmlVersionString);
            }
        }
        return retVal;
    }
}
