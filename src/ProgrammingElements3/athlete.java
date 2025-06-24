//An athlete runs in a triangular park with sides provided as input by the user in meters.
//        If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
//        Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
//        I/P => side1, side2, side3
//        O/P => The total number of rounds the athlete will run is ___ to complete 5 km

        package ProgrammingElements3;
import java.util.Scanner;

public class athlete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1 of the park: ");
        int side1 = sc.nextInt();
        System.out.println("Enter side 2 of the park: ");
        int side2 = sc.nextInt();
        System.out.println("Enter side 3 of the park: ");
        int side3 = sc.nextInt();
        int totalPerimeter = side1+side2+side3;
        System.out.println("The athlete wants to run a total of 5km");
        System.out.println("The total Perimeter of the park is: " +totalPerimeter);
        double totalDistance = 5000;
        double rounds = totalDistance/totalPerimeter;
        System.out.println("The total number of rounds athlete will have to run around the park is: " + rounds+ " to complete his goal of running 5km");


    }
}
