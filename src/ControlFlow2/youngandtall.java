//Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony
// based on their ages and the tallest among the friends based on their heights
//Hint =>
//Take user input for the age and height of the 3 friends and store it in a variable
//Find the smallest of the 3 ages to find the youngest friend and display it
//Find the largest of the 3 heights to find the tallest friend and display it
package ControlFlow2;
import java.util.Scanner;
public class youngandtall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height for person1 : ");
        double height = sc.nextDouble();
        System.out.println("Enter age for person1: ");
        int age = sc.nextInt();
        System.out.println("Enter height for person2 : ");
        double height2 = sc.nextDouble();
        System.out.println("Enter age for person2: ");
        int age2 = sc.nextInt();
        System.out.println("Enter height for person3 : ");
        double height3 = sc.nextDouble();
        System.out.println("Enter age for person3: ");
        int age3 = sc.nextInt();

        if(age<age2 && age<age3){
            System.out.println("Person1 is the youngest.");
        }
        else if(age2<age && age2<age3){
            System.out.println("Person 2 is the youngest.");
        }
        else if(age3<age && age<age2){
            System.out.println("Person 3 is the youngest.");
        }
        if(height>height2 && height>height3){
            System.out.println("Person 1 is the tallest.");
        }
        else if(height2>height && height2>height3){
            System.out.println("Person 2 is the tallest.");
        }
        else if(height3>height2 && height3>height){
            System.out.println("Person 3 is the tallest.");
        }

    }
}
