public class PackageProcessor {
    private PackegaHandler chain;

    public PackageProcessor() {
        chain = new PlovdivPackageHandler();
        PackegaHandler bgHandler = new BulgariaPackageHandler();
        PackegaHandler intlHandler = new InternationalPackageHandler();
        chain.setSuccessor(bgHandler);
        bgHandler.setSuccessor(intlHandler);
    }

    public void processPackage(Package pkg) {
        chain.handlePackage(pkg);
    }
}
