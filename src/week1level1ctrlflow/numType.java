//Write a program to check whether a number is positive, negative, or zero.
//        Hint =>
//        Get integer input from the user and store it in the number variable.
//        If the number is positive, print positive.
//        If the number is negative, print negative.
//        If the number is zero, print zero.

        package week1level1ctrlflow;
import java.util.Scanner;
public class numType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = sc.nextDouble();
        if (number > 1) {
            System.out.println("The number is a positive number.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is a negative number.");
        }
    }
}
