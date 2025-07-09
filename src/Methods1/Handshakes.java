//Create a program to find the maximum number of handshakes among N number of students.
//Hint =>
//Get integer input for number of students
//Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
//Write a method to use the combination formulae to calculate the number of handshakes
package Methods1;
import java.util.Scanner;
public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students: ");
        int n = sc.nextInt();
        int maximumNumberOfHandshakes=calculateMaxNumberOfHandshakes(n);
        System.out.println("The maximum number of handshakes possible is: "+maximumNumberOfHandshakes);
    }
    public static int calculateMaxNumberOfHandshakes (int n){
        return (n * (n - 1)) / 2;
    }

}
