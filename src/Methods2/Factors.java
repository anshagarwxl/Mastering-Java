//Create a program to find the factors of a number taken as user input, store the factors in an array,
// and display the factors. Also find the sum, sum of square of factors and product of the factors and display the result.
//Hint =>
//Take the input for a number
//Write a static Method to find the factors of the number and save them in an array and return the array.
//To find factors and save to array will have two loops.
// The first loop to find the count and initialize the array with the count.
// And the second loop save the factors into the array
//Write a method to find the sum of the factors using factors array
//Write a method to find the product of the factors using factors array
//Write a method to find the sum of square of the factors using Math.pow() method
package Methods2;
import java.util.Scanner;
import java.util.Arrays;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        int sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        int sumOfSquares = sumOfSquares(factors);

        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum of Factors: " + sum);
        System.out.println("Product of Factors: " + product);
        System.out.println("Sum of Squares of Factors: " + sumOfSquares);
    }


        // Method to get all factors and return as an array
        public static int[] getFactors(int num){
            int count = 0;
            // First loop: Count how many factors
            for(int i=1;i<=num;i++){
                if (num%i==0)
                    count ++;
            }
            // Create array of correct size
            int[] factors = new int[count];
            int index = 0;
            // Second loop: Store the actual factors
            for(int i=1;i<=num;i++){
                if(num%i==0)
                    factors[index++] = i;
            }
            return factors;
        }

    // Method to find the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

        // Method to find product of factors
        public static long productOfFactors(int[] factors) {
            long product = 1;
            for (int f : factors) //for each loop
                {
                product *= f;
            }
            return product;
        }
        // Method to find sum of squares of factors
        public static int sumOfSquares(int[] factors) {
            int sum = 0;
            for (int f : factors) {
                sum += (int) Math.pow(f, 2); // f squared
            }
            return sum;

    }
}
