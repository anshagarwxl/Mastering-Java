package ControlFlow1;
import java.util.Scanner;
public class SumOfNumUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In case, to stop the program enter 0.");
        double total = 0.0;
        double number;

            for (;;) {
                System.out.println("Enter number to add: ");
                number = sc.nextDouble();

                if (number == 0) {
                    break;
                }
                total += number;
                System.out.println("The total so far is: " + total);
            }

            System.out.println("Final total: " + total);
        }
    }

