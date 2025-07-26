package javatraining;
class Rocket {
    private void blastOff() {
        System.out.print("bang ");
    }
}

public class Shuttle extends Rocket {
    public static void main(String[] args) {
        new Shuttle().go(); // Step 1: Create a Shuttle object and call go()
    }

    void go() {
        blastOff(); // Step 2: Call blastOff() defined in Shuttle
    }

    private void blastOff() {
        System.out.print("sh-bang ");
    }
}
