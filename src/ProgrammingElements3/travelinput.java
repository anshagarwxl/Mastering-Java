//Rewrite the Sample Program 2 with user inputs
//        Hint =>
//        Create variables and take user inputs for name, fromCity, viaCity, toCity
//        Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
//        Create Variables and take time taken
//        Finally, print the result and try to understand operator precedence.

        package ProgrammingElements3;
import java.util.Scanner;
public class travelinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter city from where you begin your journey: ");
        String fromCity = sc.nextLine();
        System.out.println("Enter city via you'll be travelling: ");
        String viaCity = sc.nextLine();
        System.out.println("Enter your final destination: ");
        String finalCity = sc.nextLine();
        System.out.println("Enter total travel time: ");
        int totalTime = sc.nextInt();
        System.out.println("Enter distance from initial to midpoint of trip: ");
        int distance1 = sc.nextInt();
        System.out.println("Enter distance from midpoint to final destination of trip: ");
        int distance2 = sc.nextInt();
        int totalDistance = distance1+distance2;
        System.out.println("Total distance travelled by you is: " +totalDistance+ " and time taken for this is approximatrly: " +totalTime);
    }
}
