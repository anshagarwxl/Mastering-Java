//Create a program to check if a number taken from the user is a Harshad Number.
//Hint =>
//A Harshad number is an integer which is divisible by the sum of its digits.
//For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
//Get an integer input for the number variable.
//Create an integer variable sum with initial value 0.
//Create a while loop to access each digit of the number.
//Inside the loop, add each digit of the number to sum.
//Check if the number is perfectly divisible by the sum.
//If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.
package ControlFlow3;
import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        int count;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        if (original % sum == 0) {
            System.out.println("It is a harshad number");
        } else {
            System.out.println("It is not a harshad number.");
        }
    }
}
