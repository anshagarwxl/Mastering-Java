//Write a program to check if a number is divisible by 5
//I/P => number
//O/P => Is the number ___ divisible

package ControlFlow1;
import java.util.Scanner;
public class divisible{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check divisibility by 5: ");
        int number = sc.nextInt();
        if (number%5 ==0) {
            System.out.println("The number is divisible by 5");
        }
        else {
            System.out.println("The number is not divisible by 5");
        }
        }

    }



