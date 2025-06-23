//Two numbers are entered through the keyboard.
// Write a program to find the value of one number raised to the power of another.
// (Do not use Java built-in method)
package forloop;
import java.util.Scanner;
public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number: ");
        int base = sc.nextInt();
        System.out.println("Enter power number: ");
        int power = sc.nextInt();
        int result =1;
        for(int i=1;i<=power;i++)
        {
            result *=base;
        }
        System.out.println("Result: "+ result);
    }
}
