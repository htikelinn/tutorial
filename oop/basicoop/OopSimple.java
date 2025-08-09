package oop.basicoop;
class OopSimple {

    // Declare Variabel
    private int a;
    private int b;

    // Setter
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    // Method

    public void sum() {
        System.out.println(a + b);
    }

    public void substract() {
        System.out.println(b - a);
    }

    // main Method

    public static void main(String[] args) {
        OopSimple obj = new OopSimple();

        obj.setA(30);
        obj.setB(50);

        obj.sum();
        obj.substract();
    }

}