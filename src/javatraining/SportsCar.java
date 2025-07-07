package javatraining;

public class SportsCar {
    private void goFast() {
        System.out.println("Go Fast");
    }

    private void doStuff() {
        goFast();
    }
}

class Converrtible extends SportsCar {

    private void goFast() {
        System.out.println("Go Fast - Converrtible");
    }

    private void doThings() {
        SportsCar sc = new SportsCar();
        Converrtible con = new Converrtible();
        con.goFast();
    }

    public static void main(String[] args) {
        Converrtible c = new Converrtible();
        c.doThings();
    }
}
