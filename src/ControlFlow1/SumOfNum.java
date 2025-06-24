//Write a program to find the sum of numbers until the user enters 0
//        Hint =>
//        Create a variable total of type double initialize to 0.0. Also, create a variable to store,
//        the double value the user enters
//        Use the while loop to check if the user entered is 0
//        If the user entered value is not 0 then inside the while block add user entered value to the total,
//        and ask the user to input again
//        The loop will continue till the user enters zero and outside the loop display the total value

        package ControlFlow1;
import java.util.Scanner;
public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In case to stop the addition program enter 0.");
        double total =0.0;
        double number;
        System.out.println("Enter numbers to add: ");
        number = sc.nextDouble();

        while (number !=0) {
            total+=number; // total = total + number
            System.out.println("The total now is: " +total);
            System.out.println("Enter number to add: ");
            number = sc.nextDouble();
        }
    }
}


