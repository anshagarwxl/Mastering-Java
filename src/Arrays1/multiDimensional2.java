//Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and
// Copy the 2D Array into a single dimension array
//Hint =>
//Take user input for rows and columns, create a 2D array (Matrix), and take the user input
//Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in
// int[] array = new int[rows * columns];
//Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array
// and increment the index
//Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows,
// and the inner for loops to access each element
package Arrays1;
import java.util.Scanner;

public class multiDimensional2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int columns = sc.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Enter valid input, input must be greater than 0");
            return;
        }

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter elements of the matrix: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] oneDArray = new int[rows * columns];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                oneDArray[index++] = matrix[i][j];
            }
        }

        System.out.println("\n1D Array Elements:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.println("Element at index " + i + ": " + oneDArray[i]);
        }

        sc.close();
    }
}
