//Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
//        Hint =>
//        Create a variable counter to take user inputted value for the countdown.
//        Use the while loop to check if the counter is 1
//        Inside a while loop, print the value of the counter and decrement the counter.

package week1level1ctrlflow;
import java.util.Scanner;
public class WhileCountDown {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter enter countdown number: ");
        int number = sc.nextInt();
        while (number>=1) {
            System.out.println(number);
            number--;
        }
        System.out.println("Liftoff");

    }
}
