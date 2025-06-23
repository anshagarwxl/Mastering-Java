package week1level1ctrlflow;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OrigNumber = input.nextInt();
        int number = OrigNumber;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number=number/10;
            System.out.println("The sum of digits of the number is: " + OrigNumber+ "=" + number);
            input.close();
        }

    }
}
