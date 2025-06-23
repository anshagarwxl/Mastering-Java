//Write a Program to check if the given number is a prime number or not
//Hint =>
//A number that can be divided exactly only by itself and 1 are Prime Numbers,
//Prime Numbers checks are done for number greater than 1
//Loop through all the numbers from 2 to the user input number and check if the reminder is zero.
// If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number.
//Use isPrime boolean variable to store the result

package ctrlflowlevel3;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number greater than 1: ");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println("Number must be greater than 1.");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

// for (int i = 2; i <= number / 2; i++) -> here number/2 is very important. as every number divides itself —
// and you'll incorrectly think it's not a prime.
//If a number is divisible by anything greater than half of itself (other than itself),
// it would have already been divisible by something smaller.