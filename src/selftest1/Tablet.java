package selftest1;
interface Gadget {
    void doStuff();
}

abstract class Electronic1 {
    void getPower() {
        System.out.print("plug in ");
    }
}

public class Tablet extends Electronic1 implements Gadget {
    public void doStuff() {
        System.out.print("show book ");
    }

    public static void main(String[] args) {
        new Tablet().getPower();
        new Tablet().doStuff();
    }
}
