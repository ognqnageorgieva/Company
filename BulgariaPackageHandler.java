public class BulgariaPackageHandler extends PackegaHandler {
    @Override
    public void handlePackage(Package pkg) {
        if (pkg instanceof NationalPackage) {
            System.out.println("Handling national package in Bulgaria...");
        } else {
            successor.handlePackage(pkg);
        }
    }
}
