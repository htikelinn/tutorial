package basicjava;

public class InstanceMethodDemo {

    private String format = "Hello %s%n";

    public void showMessage(String name) {
        System.out.format(format, name);
    }

    public void showMessage(String[] names) {
        for (String name : names) {
            showMessage(name);
        }
    }

    public static void main(String[] args) {
        InstanceMethodDemo demo = new InstanceMethodDemo();
        demo.showMessage("java");

        String[] array = { "Java", "Programming" };
        demo.showMessage(array);
    }
}