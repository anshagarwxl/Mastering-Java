package Methods2;
import java.util.Scanner;

public class UnitConverterQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a choice:");
        System.out.println("1. Convert Yards to Feet");
        System.out.println("2. Convert Feet to Yards");
        System.out.println("3. Convert Meters to Inches");
        System.out.println("4. Convert Inches to Meters");
        System.out.println("5. Convert Inches to Centimeters");

        int choice = sc.nextInt();

        // Check for valid choice first
        if (choice < 1 || choice > 5) {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        System.out.println("Enter distance:");
        double input = sc.nextDouble();
        double result = 0;

        if (choice == 1) {
            result = convertYardsToFeet(input);
            System.out.println(input + " Yards = " + result + " Feet");
        } else if (choice == 2) {
            result = convertFeetToYards(input);
            System.out.println(input + " Feet = " + result + " Yards");
        } else if (choice == 3) {
            result = convertMetersToInches(input);
            System.out.println(input + " Meters = " + result + " Inches");
        } else if (choice == 4) {
            result = convertInchesToMeters(input);
            System.out.println(input + " Inches = " + result + " Meters");
        } else if (choice == 5) {
            result = convertInchesToCentimeters(input);
            System.out.println(input + " Inches = " + result + " Centimeters");
        }

        sc.close();
    }

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
}
