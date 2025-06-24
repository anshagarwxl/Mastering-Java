//Write a program to count down the number from the user input value to 1 using a for loop for a rocket launch
//        Hint =>
//        Create a variable counter to take user inputted value for the countdown.
//        Use the for loop to check if the counter is 1
//        Inside a for loop, print the value of the counter and decrement the counter.

package ControlFlow1;
import java.util.Scanner;
public class forCountDown {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.println("Enter count down number: ");
        int number = sc.nextInt();
        for( int i = number; i>=1 ; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");
    }
}
