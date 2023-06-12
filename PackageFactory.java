public class PackageFactory {
    public static Package createPackage(String type) {
        if (type.equalsIgnoreCase("local")) {
            return new LocalPackage();
        } else if (type.equalsIgnoreCase("national")) {
            return new NationalPackage();
        } else if (type.equalsIgnoreCase("international")) {
            return new InternationalPackage();
        } else {
            return null;
        }
    }
}
