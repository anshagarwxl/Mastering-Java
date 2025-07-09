//Create a program to divide N number of chocolates among M children.
// Print the number of chocolates each child will get and also the remaining chocolates
//Hint =>
//Get an integer value from user for the numberOfChocolates and numberOfChildren.
//Write the method to find the number of chocolates each child gets and number of remaining chocolates
//public static int[] findRemainderAndQuotient(int number, int divisor)
package Methods1;
import java.util.Scanner;
public class Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Choco-> ");
        int choco = sc.nextInt();
        System.out.println("Enter number of Children: ");
        int child = sc.nextInt();
        int[] ChocoForEachChild = operateChocolates(choco,child);
        int noOfChocoWithEachChild = ChocoForEachChild[0];
        int remainingChoco = ChocoForEachChild[1];
        System.out.println("The number of Chocolates with each Child is: "+noOfChocoWithEachChild+ " remaining choco are: "+remainingChoco);
    }
    public static int[] operateChocolates(int choco,int child){
        int noOfChocoWithEachChild = choco/child;
        int remainingChoco = choco%child;
        return new int[] {noOfChocoWithEachChild, remainingChoco};
    }
}
