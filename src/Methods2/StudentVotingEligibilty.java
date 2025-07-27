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
public class StudentVotingEligibilty {

    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        } else if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
    }

}
