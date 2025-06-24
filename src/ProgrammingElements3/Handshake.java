package ProgrammingElements3;
import java.util.Scanner;

public class Handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int baalak = sc.nextInt();
        System.out.println("Each student has 2 hands.");
        int noOfHandshakes = (baalak*(baalak-1))/2;
        System.out.println("Therefore the number of possible handshakes are: "+noOfHandshakes);
    }
}
