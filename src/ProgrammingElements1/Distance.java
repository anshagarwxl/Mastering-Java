package ProgrammingElements1;//Create a program to convert distance in kilometers to miles.
//Hint =>
//Create a variable km and assign type as double as in double km;
//Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
//Use Scanner Object to take user input for km as in km = input.nextInt();
//Use 1 mile = 1.6 km formulae to calculate miles and show the output
//I/P => km
//O/P => The total miles is ___ mile for the given ___ km
import java.util.Scanner;
public class Distance {
    public static void main(String[] args){
        double km;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter distance in kms: ");
        km = input.nextDouble();
        double mile= km/1.6;
        System.out.println(mile);
    }
}
