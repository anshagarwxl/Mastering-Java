package javatraining;

public class RaceCar {
    void goFast(){
        System.out.println("goFast called.");
    }
    void doStuff(){
        System.out.println("doStuff called.");
        goFast();
    }

    public static void main(String[] args) {
        RaceCar rc = new RaceCar();
        rc.doStuff();
    }
}

class Convertible extends RaceCar{
    void doThings(){
        System.out.println("doThings called.");
    }

    public static void main(String[] args) {
    Convertible c = new Convertible();
    RaceCar rc = new RaceCar();
    rc.doStuff();
    rc.goFast();
    c.doThings();
    c.doStuff();
    c.goFast();
    }
}