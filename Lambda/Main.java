package Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<String>(); // ArrayList number

        numbers.add("Hello");
        numbers.add("Java");
        numbers.add("Program");
        numbers.add("Good");
        // numbers.forEach((n) -> { // using simple lambda
        // System.out.println(n);
        // });

        Consumer<String> method = (n) -> { // Using Comsumer Style
            System.out.println(n);
        };
        numbers.forEach(method);
    }
}
