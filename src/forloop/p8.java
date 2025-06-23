package forloop;
import java.util.Scanner;
//Write a program that prompts the user to input a positive integer.
// It should then print the multiplication table of that number.
//public class p8 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        System.out.println("Multiplication table of: "+n);
//        for(int i=1 ; i<=10; i++)
//        {
//            System.out.println(n +" x " + i + " = " + (n*i));
//        }
//    }
//}

public class p8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Multiplication table of: "+n);
        int i =1;
        while(i<=10) {
            System.out.println(n +" x " + i + " = " + (n*i));
            i++;
        }
    }
}