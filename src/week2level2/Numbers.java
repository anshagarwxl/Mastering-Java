//Write a program to take 2 numbers and print their quotient and reminder
//        Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
//        I/P => number1, number2
//        O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___

        package week2level2;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        double remainder = num1%num2;
        System.out.println("The remainder of the entered numbers is: " + remainder);
        double quotient = num1/num2;
        System.out.println("The quotient of the entered numbers is: " + quotient);

    }
}
