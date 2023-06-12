public class Office {
    private static Office instance = null;

    private Office() {
        // constructor
    }

    public static Office getInstance() {
        if (instance == null) {
            instance = new Office();
        }
        return instance;
    }
}
