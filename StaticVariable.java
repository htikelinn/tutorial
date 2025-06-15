class StaticVariable {
    static int count;
    String name;

    void show() {
        System.out.println("Count :" + count);
        System.out.println("Name: " + name);
    }

    void countUp() {
        count++;
    }

    public static void main(String[] args) {
        StaticVariable staticVariable1 = new StaticVariable();
        staticVariable1.countUp();
        staticVariable1.name = "Aung Aung";
        staticVariable1.show();

        StaticVariable staticVariable2 = new StaticVariable();
        staticVariable2.countUp();
        staticVariable2.name = "Ko KO";
        staticVariable2.show();
    }
}
