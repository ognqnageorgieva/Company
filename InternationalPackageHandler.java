public class InternationalPackageHandler extends PackegaHandler {
    @Override
    public void handlePackage(Package pkg) {
        if (pkg instanceof InternationalPackage) {
            System.out.println("Handling international package...");
        } else {
            System.out.println("Invalid package type!");
        }
    }
}
