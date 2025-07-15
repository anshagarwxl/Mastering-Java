package javatraining;

public class B1 {
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.m1();
    }
    void m1(){
        System.out.println(this.hashCode());
        System.out.println("m1");
        m3();
    }

    void m3(){
        System.out.println(this.hashCode());
        System.out.println("m3");
    }
}
