//Write a program to find the sum of n natural numbers using while loop compare the result with the formulae
// n*(n+1)/2 and show the result from both computations was correct.
//        Hint =>
//        Take the user input number and check whether it's a Natural number
//        If it's a natural number Compute using formulae as well as compute using while loop
//        Compare the two results and print the result

        package ControlFlow1;
import java.util.Scanner;
public class naturalnumberforloop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int sumFor =0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("The value using the for loop is: " + sumFor);
            System.out.println("The value using the calculation formula is: " + sumFormula);

            if (sumFor == sumFormula) {
                System.out.println("The result for both are equal");
            } else {
                System.out.println("Both of them have different results.");
            }
        }
    }
}
