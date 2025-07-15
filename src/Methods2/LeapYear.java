//Write a program that takes a year as input and outputs the Year is a Leap Year or not
//        Hint =>
//        The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar.
//        Also, Leap year is divisible by 4 and not divisible by 100 or divisible by 400
//        Write a method to check for Leap Year using the conditions a and b

package Methods2;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year: ");
        int year = sc.nextInt();
        if (year <= 1582) {
            System.out.println("Enter a year after 1582.");
            return;
        }
        boolean isleapYear = checkLeapYear(year);

        if (isleapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }


    }
        public static boolean checkLeapYear(int year){
            return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
}
