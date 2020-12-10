package poc.xmlpropagate;

public class UnmarshalDispatcher {
    public static void main (String[] args) {
        String fileName = "./src/main/resources/mz03.txt";
        // TODO: rahu list from all fileName from directory - in functional way foreach supplier or something like that
        PersistExporter.export(RebsyVersionDetector::detect , fileName);
    }
}
