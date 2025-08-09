package oop.abstractc;
import oop.basicoop.override;

abstract class Abstract {
    abstract void turnON();

    abstract void turnOFF();

}

class Tvremote extends Abstract {
    @override
    void turnON() {
        System.out.println("Turn On");
    }

    @override
    void turnOFF() {
        System.out.println("Turn off");
    }
}

public class Geeks {
    public static void main(String[] args) {
        Abstract remote = new Tvremote();
        remote.turnON();
        remote.turnOFF();

    }
}
