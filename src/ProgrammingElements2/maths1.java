//Write an IntOperation program by taking a, b, and c as input values and print the following integer operations
// a + b *c, a * b + c, c + a / b, and a % b + c.
// Please also understand the precedence of the operators.
//        Hint =>
//        Create variables a, b, c of int data type.
//        Take user input for a, b, and c.
//        Compute 3 integer operations and assign the result to a variable
//        Finally, print the result and try to understand operator precedence.


        package ProgrammingElements2;
import java.util.Scanner;
public class maths1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a: ");
        int a = sc.nextInt();
        System.out.println("Enter value for b: ");
        int b = sc.nextInt();
        System.out.println("Enter value for c: ");
        int c = sc.nextInt();
        int res1= a+b*c;
        System.out.println("The result of operation1 is: "+ res1);
        int res2= a*b+c;
        System.out.println("The result of operation2 is: "+ res2);
        int res3= c+a/b;
        System.out.println("The result of operation3 is: "+ res3);
        int res4= a%b+c;
        System.out.println("The result of operation4 is "+ res4);
    }
}
