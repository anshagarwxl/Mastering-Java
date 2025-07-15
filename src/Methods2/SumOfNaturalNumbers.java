//Write a program to find the sum of n natural numbers using recursive method
// and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct.
//Hint =>
//Take the user input number and check whether it's a Natural number, if not exit
//Write a Method to find the sum of n natural numbers using recursion
//Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2
//Compare the two results and print the result
package Methods2;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid input. Please enter natural numbers only.");
            return;
        }
        int sumRecursive = recursiveSum(n);

        int sumFormula = formulaSum(n);
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula (n*(n+1)/2): " + sumFormula);

        if(sumFormula==sumRecursive){
            System.out.println("both results are equal, thus recursion worked correctly.");
        }
        else{
            System.out.println("results are unequal, thus recursion didn't work as expected.");
        }
    }

    public static int recursiveSum(int n){
        if(n==1){
            return 1;
        }
        return n +recursiveSum(n-1);
    }

    public static int formulaSum(int n){
       return  n*(n+1)/2;
    }
}
