//Write an DoubleOperation program by taking a, b, and c as input values and print the following double operations
// a + b *c, a * b + c, c + a / b, and a % b + c.
// Please also understand the precedence of the operators.
//        Hint =>
//        Create variables a, b, c of double data type.
//        Take user input for a, b, and c.
//        Compute 3 double operations and assign the result to a variable
//        Finally, print the result and try to understand operator precedence.


package ProgrammingElements2;
import java.util.Scanner;
public class maths2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.println("Enter value for b: ");
        double b = sc.nextDouble();
        System.out.println("Enter value for c: ");
        double c = sc.nextDouble();
        double res1= a+b*c;
        System.out.println("The result of operation1 is: "+ res1);
        double res2= a*b+c;
        System.out.println("The result of operation2 is: "+ res2);
        double res3= c+a/b;
        System.out.println("The result of operation3 is: "+ res3);
        double res4= a%b+c;
        System.out.println("The result of operation4 is "+ res4);
    }
}
