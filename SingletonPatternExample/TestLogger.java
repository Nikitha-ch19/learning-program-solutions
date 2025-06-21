public class TestLogger {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.log("First message");
        log2.log("Second message");

        if (log1 == log2) {
            System.out.println("Only one Logger instance is used.");
        } else {
            System.out.println("Different instances created.");
        }
    }
}
