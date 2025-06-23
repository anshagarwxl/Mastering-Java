
//Write a program to find the side of the square whose parameter you read from user
//Hint => Perimeter of Square is 4 times side
//I/P => perimeter
//O/P => The length of the side is ___ whose perimeter is ____
package week2level2;
import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the perimeter of the square: ");
        int peri = sc.nextInt();
        int side = peri / 4;
        System.out.println("Side of the square is " + side);
    }
}
