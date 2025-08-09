package Lambda.LambdaWithParameter;

interface StringFunction {
    String run(String str);

}

public class Main {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("This is Exclaimation Mark", exclaim);
        printFormatted("This is Question Mark", ask);

    }

    public static void printFormatted(String str, StringFunction strfun) {
        String result = strfun.run(str);
        System.out.println(result);
    }
}
