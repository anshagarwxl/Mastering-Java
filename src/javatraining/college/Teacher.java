package javatraining.college;

import java.sql.SQLOutput;
public class Teacher {
    void m1(){
        System.out.println("m1");
    }
    static void m2(){
        System.out.println("m2");
    }

    public static void main(String[] args) {
        System.out.println("Main method called");
        Teacher teach = new Teacher();
        teach.m1();
    }
}
