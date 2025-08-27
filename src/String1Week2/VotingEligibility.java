package String1Week2;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10]; // array to store 10 ages

        // Input ages
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter your age " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Process voting eligibility
        String[][] votingResult = checkVoting(ages);

        // Display results
        displayResultForVoting(votingResult);

        sc.close();
    }

    // Method to check voting eligibility
    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); // store age as string

            if (ages[i] < 0) {
                result[i][1] = "false"; // negative age
            } else if (ages[i] >= 18) {
                result[i][1] = "true"; // can vote
            } else {
                result[i][1] = "false"; // underage
            }
        }

        return result;
    }

    // Method to display the 2D array in table format
    public static void displayResultForVoting(String[][] result) {
        System.out.println("\nAGE\tCAN Vote?");
        System.out.println("-----------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }
}