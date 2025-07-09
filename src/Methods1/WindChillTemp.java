//Write a program calculate the wind chill temperature given the temperature and wind speed
//Hint =>
//Write a method to calculate the wind chill temperature using the formula
// windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16
//public double calculateWindChill(double temperature, double windSpeed)
package Methods1;
import java.util.Scanner;
public class WindChillTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.println("Enter wind speed: ");
        double windSpeed = sc.nextDouble();
        double result = windChillTemperature(temp,windSpeed);
        System.out.println("The wind chill temperature is: "+result);

    }
    public static double windChillTemperature(double temp, double windSpeed){

        return (35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed, 0.16));
    }
}
