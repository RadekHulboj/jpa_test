package solution;

public class MainUnmarshalDispatcher {
    public static void main (String[] args) {
        String fileName = "./src/main/resources/input/mz03.txt";
        PersistExporter.export(RebsyVersionDetector::detect , fileName);
    }
}
