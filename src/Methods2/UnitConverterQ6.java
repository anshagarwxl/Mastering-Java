package Methods2;
import java.util.Scanner;

public class UnitConverterQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press Key:");
        System.out.println("Press key 1 to convert from Fahrenheit to Celsius");
        System.out.println("Press key 2 to convert from Celsius to Fahrenheit");
        System.out.println("Press key 3 to convert from Pounds to Kilograms");
        System.out.println("Press key 4 to convert from Kilograms to Pounds");
        System.out.println("Press key 5 to convert from Gallons to Liters");
        System.out.println("Press key 6 to convert from Liters to Gallons");

        int choice = sc.nextInt();

        if (choice < 1 || choice > 6) {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        System.out.println("Enter value:");
        double input = sc.nextDouble();
        double result = 0;

        if (choice == 1) {
            result = convertFahrenheitToCelsius(input);
            System.out.println(input + " Fahrenheit = " + result + " Celsius");
        } else if (choice == 2) {
            result = convertCelsiusToFahrenheit(input);
            System.out.println(input + " Celsius = " + result + " Fahrenheit");
        } else if (choice == 3) {
            result = convertPoundsToKilograms(input);
            System.out.println(input + " Pounds = " + result + " Kilograms");
        } else if (choice == 4) {
            result = convertKilogramsToPounds(input);
            System.out.println(input + " Kilograms = " + result + " Pounds");
        } else if (choice == 5) {
            result = convertGallonsToLiters(input);
            System.out.println(input + " Gallons = " + result + " Liters");
        } else if (choice == 6) {
            result = convertLitersToGallons(input);
            System.out.println(input + " Liters = " + result + " Gallons");
        }

        sc.close();
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
}
