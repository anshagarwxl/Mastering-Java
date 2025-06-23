//Create a program to find the multiplication table of a number entered by the user from 6 to 9.
//Hint =>
//Take integer input and store it in the variable number
//Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___
package ctrlflowlevel2;
import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 6 to 9: ");
        int num = sc.nextInt();
        if (num >= 6 && num <= 9) {
            System.out.println("Let's proceed.");
            for (int i = 1; i <= 10; i++) {
                int table = i * num;
                System.out.println(num+"*"+i+"="+table);
            }
        } else {
            System.out.println("Enter a number between 6 and 9.");
        }
    }
}
