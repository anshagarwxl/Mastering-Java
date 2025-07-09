//An athlete runs in a triangular park with sides provided as input by the user in meters.
// If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
//Hint =>
//Take user input for 3 sides of a triangle
//The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
//Write a Method to compute the number of rounds user needs to do to complete 5km run
package Methods1;
import java.util.Scanner;
public class Athlete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of side1 of triangular park(in meters): ");
        int side1 = sc.nextInt();
        System.out.println("Enter length of side2 of triangular park(in meters): ");
        int side2 = sc.nextInt();
        System.out.println("Enter length of side3 of triangular park(in meters): ");
        int side3 = sc.nextInt();
        int perimeter=side1+side2+side3;
        double noOfRoundsFor5km = noOfRounds(side1,side2,side3);
        System.out.println("The athlete will run "+noOfRoundsFor5km+" to complete his 5km run.");
    }
    public static double noOfRounds(int side1,int side2, int side3){
        int perimeter=side1+side2+side3;
        return 5000.0/perimeter;
    }
}
