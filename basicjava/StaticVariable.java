class StaticVariable {
    static int count; // declare static variable
    String name; // declare instance variable

    // show method for showing data
    void show() {
        System.out.println("Count :" + count);
        System.out.println("Name: " + name);
    }

    // count method for count student
    void countUp() {
        count++;
    }

    // main method for starting run

    public static void main(String[] args) {
        StaticVariable staticVariable1 = new StaticVariable();
        staticVariable1.countUp(); // count = 1
        staticVariable1.name = "Aung Aung"; // name = Aung Aung
        staticVariable1.show(); // call show method

        StaticVariable staticVariable2 = new StaticVariable();
        staticVariable2.countUp(); // count = 2
        staticVariable2.name = "Ko KO"; // name = Ko Ko
        staticVariable2.show(); // call show method
    }
}
