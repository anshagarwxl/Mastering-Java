//Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero.
// Further for positive numbers check if the number is even or odd.
// Finally compare the first and last elements of the array and display if they equal, greater or less
//Hint =>
//Define an integer array of 5 elements and get user input to store in the array.
//Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
//If the number is negative, print negative. Else if the number is zero, print zero.
//Finally compare the first and last element of the array and display if they equal, greater or less
package Arrays1;

import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Number " + (i + 1));
            num[i] = sc.nextInt();
        }
        System.out.println("\nChecking each number:");
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                System.out.println(num[i] + " is a positive number.");
             if (num[i] % 2 == 0) {
                    System.out.println("It is an even number.");
                } else if (num[i] % 2 != 0) {
                 System.out.println("It is an odd number.");
             }
                } else if (num[i] < 0) {
                    System.out.println(num[i] + " is a negative number.");
                } else {
                    System.out.println(num[i]);
                }
            }
        System.out.println("Comparison of first and last numbers:");
        if(num[0]==num[4]){
            System.out.println("First and Last element is equal.");
        } else if(num[0]>num[4]){
            System.out.println("First number is greater than the last number");
        } else {
            System.out.println("Last number is greater than the first number");
        }
        }

    }
