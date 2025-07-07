package javatraining.college;
import java.sql.SQLOutput;
public class Teacher2 {
    void m1(){
        this.m2();
        m2();
        Teacher2.m2();
        System.out.println("m1");
    }

    static void m2(){
        System.out.println("m2 called");
    }

    public static void main(String[] args) {
        Teacher2 t = null;
       // t.m1();
        t.m2();
    }
}
