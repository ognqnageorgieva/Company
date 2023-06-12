public class PlovdivPackageHandler extends PackegaHandler {
    @Override
    public void handlePackage(Package pkg) {
        if (pkg instanceof LocalPackage) {
            System.out.println("Handling local package in Plovdiv...");
        } else {
            successor.handlePackage(pkg);
        }
    }
}
