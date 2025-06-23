//Create a program to check if a number is armstrong or not. Use the hints to show the steps clearly in the code
//Hint =>
//Armstrong Number is a number whose Sum of cubes of each digit results in the original number as in
// for e.g. 153 = 1^3 + 5^3 + 3^3
//Get an integer input and store it in the number variable and define sum variable,
// initialize it to zero and originalNumber variable and assign it to input number variable
//Use the while loop till the originalNumber is not equal to zero
//In the while loop find the reminder number by using the modulus operator as in  number % 10.
// Find the cube of the number and add it to the sum variable
//Again in while loop find the quotient of the number and assign it to the original number using number / 10 expression.
// This removes the last digit of the original number.
//Finally check if the number and the sum are the same, if same its an Armstrong number else not.
// So display accordingly
package ctrlflowlevel3;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        int OriginalNumber = number;
        while(OriginalNumber!=0) {
            int digit = OriginalNumber % 10;
            sum = sum + (digit * digit * digit);
            OriginalNumber = OriginalNumber / 10;
        }
            if(sum==number){
                System.out.println("It is an armstrong number");
            }
            else{
                System.out.println("It is not an armstrong number");
            }
        }
    }

