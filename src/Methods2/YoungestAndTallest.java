////Create a program to find the youngest friends among 3 Amar, Akbar and Anthony
//// based on their ages and tallest among the friends based on their heights and display it
////Hint =>
////Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and
//// height of the 3 friends
////Write a Method to find the youngest of the 3 friends
////Write a Method to find the tallest of the 3 friends
package Methods2;
import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Step 1: Take input for ages
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
        }

        // Step 2: Find youngest index
        int youngestIndex = 0; // assume first friend is youngest
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i; // update if we find someone younger
            }
        }

        // Step 3: Take input for heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        // Step 4: Find tallest index
        int tallestIndex = 0; // assume first friend is tallest
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i; // update if we find someone taller
            }
        }

        // Step 5: Print results
        System.out.println("The youngest friend is: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("The tallest friend is: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + ")");

        sc.close();
    }
}
