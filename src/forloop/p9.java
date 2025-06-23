package forloop;
import java.util.Scanner;
//Write a program to find the factorial value of any number entered through the keyboard.
//public class p9 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        int fact =1;
//        for(int i=n; i>=1; i--) {
//            fact *=i; //fact = fact*i
//        }
//            System.out.println("Factorial of " + n + " is: " + fact);
//    }
//}

public class p9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i = n;
        int fact = 1;
        while(i>=1) {
            fact*=i;
            i--;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}