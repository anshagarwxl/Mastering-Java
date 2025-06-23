package ctrlflowlevel3;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double first = sc.nextDouble();
        System.out.println("Enter second number: ");
        double second = sc.nextDouble();
        System.out.println("Enter an operator (+,-,*,/): ");
        String op = sc.next();
        double result;
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":

                if (second == 0) {
                    System.out.println("Division by 0 is not allowed.");
                    break;
                } else {
                    result = first / second;
                    System.out.println("Result: " + result);
                    break;
                }
            default:
                System.out.println("Invalid Operator");

        }
    }
}
