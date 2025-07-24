//3)A mathematics teacher is preparing a digital learning module to help students understand
//the concept of divisibility.
//As part of the module, the teacher wants a simple Java program that will allow students to:
//1. Enter any integer.
//2. The program should check whether the number is divisible by 3.
//3. This is done using the modulus operator (%) in Java.
//4. If the remainder is 0, the number is divisible by 3.
//5. If not, it is not divisible by 3.
//6. The program will display the result to the student.
package APP_SRMIST;
import java.util.Scanner;
public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num%3==0){
            System.out.println("The number is divisible by 3. ");
        }
        else if(num%3!=0){
            System.out.println("The number is not divisible by 3.");
        }
    }
}
