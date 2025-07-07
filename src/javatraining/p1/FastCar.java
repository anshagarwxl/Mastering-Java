package javatraining.p1;

public class FastCar {
    void goFast(){
        System.out.println("Go fast is default method.");
    }
}
class Convertible extends FastCar {
    //goFast is accessible here, by virtue of inheritance.

    public static void main(String[] args) {
        Convertible con = new Convertible();
        con.goFast();
        FastCar fc = new FastCar();
        fc.goFast();
    }
}
class Driver{
    public static void main(String[] args) {
        Driver d = new Driver();
        //d.goFast(); -> since Driver has no relationship with FastCar, thus he's unable to access method goFast,
        // using both inheritance and reference variable.
    }
}