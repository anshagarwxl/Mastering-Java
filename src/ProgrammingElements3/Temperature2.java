package ProgrammingElements3;
import java.util.Scanner;
public class Temperature2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double temp1 = sc.nextDouble();
        double temp2 = (temp1-32)*5/9;
        System.out.println("The temperature in celsius is: " + temp2);
    }
}
