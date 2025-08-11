//Write a program to take user input for 5 numbers and check whether a number is positive or negative.
// Further for positive numbers check if the number is even or odd.
// Finally compare the first and last elements of the array and display if they are equal, greater, or less
//Hint =>
//Write a Method to Check whether the number is positive or negative
//Write a Method to check whether the number is even or odd
//Write a Method to compare two numbers
// and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2
//In the main program, Loop through the array using the length call the method isPositive() and
// if positive call method isEven() and print accordingly
//If the number is negative, print negative.
//Finally compare the first and last element of the array by calling the method compare() and
// display if they are equal, greater, or less
package Methods2;
import java.util.Scanner;
public class NumberNature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            number[i] = sc.nextInt();
            if (isPositive(number[i])) {
                System.out.println("Positive number");
                if (isEven(number[i])) {
                    System.out.println("Even number");
                } else {
                    System.out.println("Odd number");
                }
            } else if (number[i] < 0) {
                System.out.println("Negative number");
            } else {
                System.out.println("Zero");
            }
        }
        int result = compare(number[0], number[4]);
        if (result == 1) {
            System.out.println("1");
        } else if (result == -1) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
    }
    public static boolean isPositive(int num) {
        return num > 0;
    }
// Method to check if number is even
public static boolean isEven(int num) {
    return num % 2 == 0;
}

public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    }
}

