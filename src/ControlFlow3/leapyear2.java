//Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
//Hint =>
//The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar.
// So ensure to check for the same.
//Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400.
// E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
//Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators.

package ControlFlow3;
import java.util.Scanner;
public class leapyear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        if (year >= 1582) {
            System.out.println("Checking if the entered year is a leap year or not...");
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("It is a leap year.");
            }
            else{
                System.out.println("It is not a leap year.");
            }


        }
        else {
            System.out.println("Invalid Input: Please enter a year greater than 1582.");
        }
    }
}
