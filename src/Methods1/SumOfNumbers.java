//Write a program to find the sum of n natural numbers using loop
//Hint => Get integer input from the user.
// Write a Method to find the sum of n natural numbers using loop
package Methods1;
import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = sumOfNnaturalNumbers(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }

    public static int sumOfNnaturalNumbers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum +=i;
        }
        return sum;
    }
}

