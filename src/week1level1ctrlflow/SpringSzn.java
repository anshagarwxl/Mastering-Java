//Write a program SpringSeason that takes two int values month and day from the command line and prints
// “Its a Spring Season” otherwise prints “Not a Spring Season”.
//        Hint =>
//        Spring Season is from March 20 to June 20

        package week1level1ctrlflow;
import java.util.Scanner;
public class SpringSzn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month : ");
        int month = sc.nextInt();
        System.out.println("Enter a date: ");
        int date = sc.nextInt();
        boolean isSpring =
                (month == 3 && date >= 20 && date <= 31) ||
                        (month == 4 && date >= 1 && date <= 30) ||
                        (month == 5 && date >= 1 && date <= 31) ||
                        (month == 6 && date >= 1 && date <= 20);
        if (isSpring) {
            System.out.println("It's a spring season.");
        }
        else {
            System.out.println("Not a spring season.");
        }

    }
}
