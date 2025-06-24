package ControlFlow3;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        double weight = sc.nextDouble();
        System.out.println("Enter your height in metres: ");
        double height = sc.nextDouble();
        double BMI = weight/(height*height);
        double BmiInMeter = BMI;
        if(BmiInMeter<=18.4){
            System.out.println("Underweight");
        }
        else if(BmiInMeter>=18.5 && BmiInMeter<=24.9){
            System.out.println("Normal");
        }
        else if(BmiInMeter>=25.0 && BmiInMeter<=39.9){
            System.out.println("Overweight");
        }
        else if(BmiInMeter>=40){
            System.out.println("Obese");
        }
    }
}
