//Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.
// Please define static methods for all the UnitConvertor class methods. E.g.
//public static double convertKmToMiles(double km) =>
//Method To convert kilometers to miles and return the value. Use the following code double km2miles = 0.621371;
//Method to convert miles to kilometers and return the value. Use the following code double miles2km = 1.60934;
//Method to convert meters to feet and return the value. Use the following code to convert double meters2feet = 3.28084;
//Method to convert feet to meters and return the value. Use the following code to convert double feet2meters = 0.3048;
package Methods2;
import java.util.Scanner;
public class UnitConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Convert Kilometers to Miles");
        System.out.println("2. Convert Miles to Kilometers");
        System.out.println("3. Convert Meters to Feet");
        System.out.println("4. Convert Feet to Meters");
        int choice = sc.nextInt();

        System.out.print("Enter the distance: ");
        double input = sc.nextDouble();
        double result = 0;
        if (choice == 1) {
            result = KmToMiles(input);
            System.out.println(input + " km = " + result + " miles");
        } else if (choice == 2) {
            result = milesToKm(input);
            System.out.println(input + " miles = " + result + " km");
        } else if (choice == 3) {
            result = metersTofeet(input);
            System.out.println(input + " meters = " + result + " feet");
        } else if (choice == 4) {
            result = feetTometers(input);
            System.out.println(input + " feet = " + result + " meters");
        } else {
            System.out.println("Invalid choice.");
        }
    }


    public static double KmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double milesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double metersTofeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double feetTometers(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
}