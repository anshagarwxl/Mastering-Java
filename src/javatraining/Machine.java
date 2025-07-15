package javatraining;

interface Machine {
    void start();
    void stop();
}
class WashingMachine implements Machine{

    public void start(){
        System.out.println("Washing machine has started.");
    }
    public void stop(){
        System.out.println("Washing machine has stopped.");
    }

    public void dry(){
        System.out.println("Drying clothes");
    }
}

class Grinder implements Machine{
    public void start(){
        System.out.println("Grinder starts!");
    }
    public void stop(){
        System.out.println("Grinder stopped.");
    }
}

class TestInterface {
    public static void main(String[] args) {
        TestInterface t = new TestInterface();
        t.getMachine();
    }

    private Machine getMachine(){
        return new WashingMachine();
    }
    public void demo(Machine m) {
        m.start();
        m.stop();
    }
}
