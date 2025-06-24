package ProgrammingElements3;
import java.util.Scanner;
public class Weightconversion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = sc.nextFloat();
        double weightInKilograms = weight/2.2;
        System.out.println("The weight in kilograms is : " +weightInKilograms);

    }
}
