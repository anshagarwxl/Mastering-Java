//Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
//Hint =>
//Take integer input and store it in the variable number
// as well as define an integer array to store the multiplication result in the variable multiplicationResult
//Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
//Finally, display the result from the array in the format number * i = ___
package Arrays1;
import java.util.Scanner;
public class multiplication2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 6 and 9: ");
        int number = sc.nextInt();
        if (number >= 6 && number <= 9) {
            int[] multi = new int[10];

            for (int i = 0; i < multi.length; i++) {
                multi[i] = number * (i + 1);
            }
            for (int i = 0; i < multi.length; i++) {
                System.out.println(number + " * " + (i + 1) + " = " + multi[i]);
            }

        } else {
            System.out.println("Please enter a number between 6 and 9.");
        }

    }
}


    //if (number >= 6 && number <= 9) {
//    // Define array
//    int[] multi = new int[10];
//
//    // Store multiplication results
//    for (int i = 0; i < multi.length; i++) {
//        multi[i] = number * (i + 1);
//    }
//
//    // Print the table
//    for (int i = 0; i < multi.length; i++) {
//        System.out.println(number + " * " + (i + 1) + " = " + multi[i]);
//    }
//
//} else {
//    System.out.println("Please enter a number between 6 and 9.");
//}
