package week1level1ctrlflow;
import java.util.Scanner;
public class naturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(n<=0) {
            System.out.println("The number " + n + " is not a natural number.");
        }
        else {
            int i = 1;
            int sumwhile = 0;
            while (i <= n) {
                sumwhile += i;
                i++;
            }
            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using while loop: " + sumwhile);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumwhile == sumFormula) {
                System.out.println("The result for both are equal");
            } else {
                System.out.println("Both of them have different results.");
            }
        }
    }
}
