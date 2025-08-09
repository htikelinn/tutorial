package basicjava;

public class StaticMethodDemo {
    private static String FORMAT = "Hello %s%n";

    public static void show(String message) {
        System.out.format(FORMAT, message);
    }

    public static void show(String[] messages) {
        for (String m : messages) {
            show(m);
        }
    }
}
