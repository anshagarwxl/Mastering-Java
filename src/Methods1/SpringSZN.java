//Write a program SpringSeason that takes two int values month
// and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
//Hint => Spring Season is from March 20 to June 20.
// Write a Method to check for Spring season and return a boolean true or false
package Methods1;
import java.util.Scanner;
public class SpringSZN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date: ");
        int date = sc.nextInt();
        if (date < 1 || date > 31) {
            System.out.println("❌ Invalid date. Please enter a value between 1 and 31.");
            return;
        }
        System.out.println("Enter month: ");
        int month = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("❌ Invalid month. Please enter a value between 1 and 12.");
            return;
        }
        boolean isSpringSZN = isSpring(date,month);
        if (isSpringSZN) {
            System.out.println("It's a Spring Season!");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
    static boolean isSpring(int date, int month){
        if ((month == 3 && date >= 20 && date <= 31) ||
                (month == 4 && date >= 1 && date <= 30) ||
                (month == 5 && date >= 1 && date <= 31) ||
                (month == 6 && date >= 1 && date <= 20)) {
            return true;
        }
        else{
            return false;
        }
    }
}
