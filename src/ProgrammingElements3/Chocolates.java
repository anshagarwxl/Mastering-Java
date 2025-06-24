package ProgrammingElements3;
import java.util.Scanner;
public class Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of chocolates: ");
        int choco = sc.nextInt();
        System.out.println("Enter number of children available: ");
        int bacche = sc.nextInt();
        int chocoWithEachBaccha = choco/bacche;
        int chocoRemaining = choco%bacche;
        System.out.println("The number of chocolate/chocolates with each child is/are: " + chocoWithEachBaccha+ " while the number of chocolate/chocolates left undistributed is/are: "+ chocoRemaining);

    }
}
