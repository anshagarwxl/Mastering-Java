package ProgrammingElements1;//Create a program to calculate the profit and loss in number and percentage based on the cost price of
//INR 129 and the selling price of INR 191.
//Hint =>
//Use a single print statement to display multiline text and variables.
//        Profit = selling price - cost price
//Profit Percentage = profit / cost price * 100
//I/P => NONE
//O/P =>
//The Cost Price is INR ___ and Selling Price is INR ___
//The Profit is INR ___ and the Profit Percentage is ___

public class profitloss {
    public static void main(String[] args){
        double costPrice = 129;
        double sellingPrice = 191;
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        System.out.println("The Cost price is INR " + costPrice+ "and Selling Price is INR "+ sellingPrice+ " \nThe profit is INR " + profit + " and the Profit Percentage is "+ profitPercentage);
    }
}
