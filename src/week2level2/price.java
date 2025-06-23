//Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
//Hint => NA
//I/P => unitPrice, quantity
//O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___

package week2level2;
import java.util.Scanner;
public class price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter unit price of item bought: ");
        int unit = sc.nextInt();
        System.out.println("enter quantity of items bought: ");
        int quant = sc.nextInt();
        int totalPrice = unit*quant;
        System.out.println("The total purchase is of INR: " + totalPrice);
    }
}
