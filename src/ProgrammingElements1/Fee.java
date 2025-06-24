package ProgrammingElements1;//Write a new program similar to the program # 6 but take user input for Student week1level1.Fee and University week1level1.Discount
//Hint =>
//Create a variable named fee and take user input for fee.
//Create another variable discountPercent and take user input.
//Compute the discount and assign it to the discount variable.
//Compute and print the fee you have to pay by subtracting the discount from the fee.
//I/P => fee, discountPrecent
//O/P => The discount amount is INR ___ and final discounted fee is INR ___

import java.util.Scanner;
public class Fee {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the FEE: ");
        int Fee =input.nextInt();
        System.out.println("Enter discount percentage: ");
        double discountPercent = input.nextDouble();
        double discount = Fee * (discountPercent/100.0);
        double finalFee = Fee - discount;
        System.out.println("The discount amount is "+ (int)discount + " and final Discounted week1level1.Fee is "+ (int)finalFee);
        input.close();
    }
}
