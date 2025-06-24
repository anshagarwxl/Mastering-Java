package ProgrammingElements1;

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        System.out.print("Enter your height in centimeters: ");
        Scanner sc = new Scanner(System.in);

        double heightCm = sc.nextDouble();
        double CM_PER_INCH = 2.54;
        double INCHES_PER_FOOT = 12;

        double totalInches = heightCm / CM_PER_INCH;
        int feet = (int)(totalInches / INCHES_PER_FOOT);
        double inches = totalInches % INCHES_PER_FOOT;

        System.out.printf("Your week1level1.Height in cm is %.2f while in feet is %d and inches is %.2f%n", heightCm, feet, inches);

        sc.close();
    }
}
