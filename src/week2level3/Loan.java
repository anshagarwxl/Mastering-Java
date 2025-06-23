package week2level3;
import java.util.Scanner;
public class Loan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        int amount = sc.nextInt();
        System.out.println("Enter time: ");
        int time = sc.nextInt();
        System.out.println("Enter rate: ");
        int rate = sc.nextInt();
        double simpleInterest = (amount*rate*time)/100;
        System.out.println("The Simple interest after calculations is: "+ simpleInterest);

    }
}
