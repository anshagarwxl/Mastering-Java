package javatraining.mypkg;

public class MyClass {
    public void m1(){
        System.out.println("I am method m1.");
    }

}
class yourClass{
    void m1(){
        System.out.println("I am method m1");
        m2();
    }
    void m2(){
        System.out.println("I am method m2.");
    }

    public static void main(String[] args) {
        yourClass yobj = new yourClass();
        yobj.m1();
    }
}