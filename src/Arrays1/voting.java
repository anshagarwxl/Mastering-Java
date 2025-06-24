//Write a program to take user input for the age of all 10 students in a class and
// check whether the student can vote depending on his/her age is greater or equal to 18.
//Hint =>
//Define an array of 10 integer elements and take user input for the student's age.
//Loop through the array using the length property and for the element of the array check
// If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote.
// Otherwise, print The student with the age ___ cannot vote.
package Arrays1;
import java.util.Scanner;
public class voting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter age of 10 students: ");
        for(int i=0;i<ages.length;i++){
            System.out.println("Student "+(i+1)+" age");
            ages[i] = sc.nextInt();
        }
        System.out.println("Voting eligibility results: ");
        for(int i=0;i< ages.length;i++){
            int age = ages[i];
            if(age<0){
                System.out.println("Invalid age for student"+(i+1));
            }
            else if(age>18){
                System.out.println("The student with age "+age+" can vote.");
            }
            else{
                System.out.println("The student with age: "+age+" cannot vote.");
            }
        }
    }
}