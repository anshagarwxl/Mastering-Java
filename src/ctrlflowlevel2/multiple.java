//Create a program to find all the multiple of a number taken as user input below 100.
//Hint =>
//Get input value for a variable named number.
//Run a for loop backwards: from i = 100 to i = 1.
//Inside the loop, check if i perfectly divides number.
//If true, print the number and continue the loop.
package ctrlflowlevel2;
import java.util.Scanner;
public class multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num <= 100) {
            for (int i = 1; i * num < 100; i++) {
                int multiple = num * i;
                System.out.println(num + "*" + i + "=" + multiple);
            }
        } else {
            System.out.println("Enter a number less than 100.");
        }
    }
}
