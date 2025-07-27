//Write a program to take user input for the age of all 10 students in a class and
// check whether the student can vote depending on his/her age is greater or equal to 18.
//Hint =>
//Create a class public class StudentVoteChecker and
// define a method public boolean canStudentVote(int age) which takes in age as a parameter and returns true or false
//Inside the method firstly validate the age for a negative number, if a negative return is false cannot vote.
// For valid age check for age is 18 or above return true; else return false;
//In the main function define an array of 10 integer elements,
// loop through the array by take user input for the student's age, call canStudentVote() and display the result
//Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based
package Methods2;
import java.util.Scanner;
public class StudentVotingEligible{

    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        } else if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            boolean eligible = canStudentVote(ages[i]);
            if (eligible) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is NOT eligible to vote.");
            }
        }
        System.out.print("Enter age of Amar: ");
        int amar = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int akbar = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int anthony = sc.nextInt();

        if (amar <= akbar && amar <= anthony) {
            System.out.println("Amar is the youngest.");
        } else if (akbar <= amar && akbar <= anthony) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        sc.close();
    }
    }

