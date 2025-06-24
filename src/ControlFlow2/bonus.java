//Create a program to find the bonus of employees based on their years of service.
//Hint =>
//Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
//Take salary and year of service in the year as input.
//Print the bonus amount.
package ControlFlow2;
import java.util.Scanner;
public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int sal = sc.nextInt();
        System.out.println("Enter years of service for the company: ");
        int service = sc.nextInt();

        if(service>5) {
            System.out.println("You are eligible for bonus. ");
            double bonus = sal + (sal*0.05);
            System.out.println("Your salary after bonus is: " + bonus);
        }
        else {
            System.out.println("You are not eligible for bonus, try again after 5 years.");
        }
    }
}
