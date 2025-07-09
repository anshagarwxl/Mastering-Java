//Write a program to check whether a number is positive, negative, or zero.
//Hint => Get integer input from the user. Write a Method to return -1 for negative number,
// 1 for positive number
// and 0 if number is zero
package Methods1;
import java.util.Scanner;
public class natureOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int nature = natureOfnumber(n);
        System.out.println("Nature of the number " +n+ " is " + nature);
    }
    public static int natureOfnumber(int n){
        if(n<0){
            return -1;
        }
        else if (n==0) {
            return 0;
        }
        else {return 1;}
    }
}
