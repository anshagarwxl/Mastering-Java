//Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
//Hint =>
//Simple Interest = Principal * Rate * Time / 100
//Take user input for principal, rate, time
//Write a method to calculate the simple interest given principle, rate and time as parameters
//Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
package Methods1;
import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter Principal amount: ");
        int principal = sc.nextInt();
        System.out.println("Enter Rate of Interest: ");
        float roi = sc.nextFloat();
        System.out.println("Enter Time Duration: ");
        int time = sc.nextInt();
        double simpleInterest = calculateSimpleInterest(principal,roi,time);
        System.out.println("The simple interest is "+simpleInterest +" for Principal "+principal+" , Rate of Interest is "+ roi+" and Time is "+time);
    }
    public static double calculateSimpleInterest(int principal, float rate, int time){
        return (principal*rate*time)/100;
    }
}
