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
// Program Name: MatrixTo1DArray
// Purpose: Take input for a 2D array and copy it to a 1D array
import java.util.Scanner;

public class multiDimensional {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input for number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        // Input validation
        if (rows <= 0 || columns <= 0) {
            System.err.println("Invalid input. Rows and columns must be positive integers.");
            scanner.close();
            return;
        }

        // Step 2: Declare 2D array (matrix)
        int[][] matrix = new int[rows][columns];

        // Step 3: Take input for 2D array elements
        System.out.println("Enter elements for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Step 4: Declare 1D array of size rows * columns
        int[] oneDArray = new int[rows * columns];
        int index = 0;

        // Step 5: Copy matrix elements to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                oneDArray[index++] = matrix[i][j];
            }
        }

        // Step 6: Display the 1D array
        System.out.println("\n1D Array Elements:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.println("Element at index " + i + ": " + oneDArray[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
