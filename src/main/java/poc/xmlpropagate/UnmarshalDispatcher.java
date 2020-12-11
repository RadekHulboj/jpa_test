package poc.xmlpropagate;

public class UnmarshalDispatcher {
    public static void main (String[] args) {
        String fileName = "./src/main/resources/input/mz02.txt";
        PersistExporter.export(RebsyVersionDetector::detect , fileName);
    }
}
