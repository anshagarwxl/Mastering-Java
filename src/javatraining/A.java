package javatraining;
interface I {
    public void m1();

    public abstract void m2();

    void m3();
}
interface J {

}
public class A implements I,J {
    public void m1() {
        System.out.println("hello");
    }

    public void m2() {
        System.out.println("m2 method");
    }

    public void m3() {
        System.out.println("m3 method");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.m1();
    }
}

