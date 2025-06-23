//Write a program that takes the base and height to find area of a triangle in square inches and square centimeters
//Hint => Area of a Triangle is ½ * base * height
//I/P => base, height
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

package week2level2;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
        System.out.println("Enter height of the triangle: ");
        float height = sc.nextFloat();
        System.out.println("Enter base of the triangle: ");
        float base = sc.nextFloat();
        double areaInfeet = 0.5*height*base;
        System.out.println("The area of the triangle is " + areaInfeet+ " feet");
        double areaInInches = areaInfeet*12;
        System.out.println("The area of the triangle is " + areaInInches+ " inches");
    }
}
