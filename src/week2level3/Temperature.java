package week2level3;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celsius: ");
        double tempC = sc.nextDouble();
        double tempF = (tempC*9/5) + 32;
        System.out.println("The entered temperature in fahrenheit is: " + tempF);
    }
}
