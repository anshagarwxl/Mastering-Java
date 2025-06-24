//Write a program to check if the first, second, or third number is the largest of the three.
//        I/P => number1, number2, number3
//        O/P =>
//        Is the first number the largest? ____
//        Is the second number the largest? ___
//        Is the third number the largest? ___

        package ControlFlow1;
import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3: ");
        int num3 = sc.nextInt();

        boolean isLargestNum1 = (num1 > num2 && num1 > num3);
        System.out.println("Is the first number the largest: " +isLargestNum1);
        boolean isLargestNum2 = (num2 > num1 && num2 > num3);
        System.out.println("Is the second number the largest: " +isLargestNum2);
        boolean isLargestNum3 = (num3>num1 && num3>num2);
        System.out.println("Is the third number the largest: " +isLargestNum3);
    }
}
