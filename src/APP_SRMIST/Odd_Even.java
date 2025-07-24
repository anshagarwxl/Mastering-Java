//A mathematics teacher wants to help students understand odd and even numbers using a
//simple computer program.
//• The student will enter any integer number.
//• The program will check if the number is divisible by 2 using the modulus operator %.
//• If the remainder is 0, the number is Even.
//• If the remainder is not 0, the number is Odd.
package APP_SRMIST;
import java.util.Scanner;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int age = sc.nextInt();
        if(age%2==0){
            System.out.println(age + " -> Even");
        }
        else if(age%2!=0){
            System.out.println(age + " -> Odd");
        }
        else{
            System.out.println("Enter valid age");
        }
    }
}
