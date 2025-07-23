package javatraining;
interface Gadget{
void doStuff();
}
abstract class Electronics {
    void getPower() {
        System.out.print("plug in");
    }

    public static class Tablet extends Electronics implements Gadget {
       public void doStuff() {
            System.out.println("show book");
        }

        public static void main(String[] args) {
            new Tablet().getPower();
            new Tablet().doStuff();

        }
    }
}
