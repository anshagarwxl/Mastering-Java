//Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
//Hint =>
//Create a variable number1 and number 2 and take user inputs.
//Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
//I/P => number1, number2
//O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___
package ProgrammingElements2;
import java.util.Scanner;
public class SimpleCalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 for mathematical operation: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter number 2 for mathematical operation: ");
        float num2 = sc.nextFloat();
        float addition = num1+num2;
        System.out.println("result for addition is: " + addition);
        float subtraction = num2 - num1;
        System.out.println("result for subtraction is " + subtraction);
        float division = num2/num1;
        System.out.println("result for division is " + division);
        float multiplication= num1*num2;
        System.out.println("result for multipilication is " + multiplication);

    }
}
