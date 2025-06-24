//Write a program the find the distance in yards and miles for the distance provided by user in feets
//Hint => 1 mile = 1760 yards and 1 yard is 3 feet
//I/P => distanceInFeet
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

package ProgrammingElements2;
import java.util.Scanner;
public class height {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter distance in feet: ");
        double feet = sc.nextDouble();
        double inches = feet * 12;
        System.out.println("Distance in feet converted into inches is: " + inches);
        double miles = feet *0.0001;
        System.out.println("Distance in feet converted into miles is: " + miles);
    }
}
