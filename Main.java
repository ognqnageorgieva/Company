public class Main {
    public static void main(String[] args) {
        Office office = Office.getInstance();
        Package pkg1 = PackageFactory.createPackage("local");
        Package pkg2 = PackageFactory.createPackage("national");
        Package pkg3 = PackageFactory.createPackage("international");
        PackageProcessor processor = new PackageProcessor();
        processor.processPackage(pkg1);
        processor.processPackage(pkg2);
        processor.processPackage(pkg3);
    }
}
