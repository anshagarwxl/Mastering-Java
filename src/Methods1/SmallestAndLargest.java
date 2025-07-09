//Write a program to find the smallest and the largest of the 3 numbers.
//Hint =>
//Take user input for 3 numbers
//Write a method to find the smallest and largest of the three numbers
//public static int[] findSmallestAndLargest(int number1, int number2, int number3)
package Methods1;
import java.util.Scanner;
public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1-> ");
        int number1 = sc.nextInt();
        System.out.println("Enter number2 -> ");
        int number2 = sc.nextInt();
        System.out.println("Enter number3 -> ");
        int number3 = sc.nextInt();
        if (number1 == number2 && number2 == number3) {
            System.out.println("All three numbers are equal: " + number1);
        }
        else{
        int smallest = SmallestNumber(number1, number2, number3);
        int largest = LargestNumber(number1, number2, number3);
        System.out.println("From the 3 entered numbers (" + number1 + ", " + number2 + ", " + number3 + "):");
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }
        }

    public static int LargestNumber(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            return number2;
        } else{
            return number3;
        }

    }

    public static int SmallestNumber(int number1, int number2, int number3) {
        if (number1 < number2 && number1 < number3) {
            return number1;
        } else if (number2 < number1 && number2 < number3) {
            return number2;
        } else{
            return number3;
        }
    }
}
