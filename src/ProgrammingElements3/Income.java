package ProgrammingElements3;
import java.util.Scanner;
public class Income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your salary: ");
        int sal = sc.nextInt();
        System.out.println("enter bonus given: ");
        int bonus = sc.nextInt();
        int totalSal = bonus+sal;
        System.out.println("Your total salary with bonus is: " + totalSal);
    }
}
