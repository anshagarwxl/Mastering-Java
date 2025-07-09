//Write a program to take 2 numbers and print their quotient and reminder
//Hint =>
//Take user input as integer
//Use division operator (/) for quotient and moduli operator (%) for reminder
//Write Method to find the reminder and the quotient of a number
//public static int[] findRemainderAndQuotient(int number, int divisor)
package Methods1;
import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1: ");
        int n = sc.nextInt();
        System.out.println("Enter number2: ");
        int num = sc.nextInt();
        int[] result = operate(n,num);
         int quotient = result[0];
         int remainder = result[1];
        System.out.println("The quotient is: "  +quotient );
        System.out.println("The remainder is: " +remainder);
    }
    public static int[] operate(int n, int num){
        int quotient = n/num;
        int remainder = n%num;

        return new int[]{quotient,remainder};
    }


}
