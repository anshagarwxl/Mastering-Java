package javatraining;
public enum Color {
    RED, GREEN, YELLOW;

    Color() {
        System.out.println("ENum constructor called");
    }
}

class Test {
    public static void main(String ...a){
        System.out.println("Hello");
        Color c = Color.RED;
    }
}