package String1Week1;
import java.util.Scanner;

public class StringProcessor {
    // Method to process input string with various string methods
    public static void processInput(String input) {
        try {
            System.out.println("\nOriginal String: " + input);
            System.out.println("Length: " + input.length());
            System.out.println("Uppercase: " + input.toUpperCase());
            System.out.println("Lowercase: " + input.toLowerCase());
            System.out.println("Trimmed: " + input.trim());
            System.out.println("First 3 characters: " + input.substring(0, 3));
            System.out.println("Last character: " + input.charAt(input.length() - 1));
            System.out.println("Replace spaces with '-': " + input.replace(" ", "-"));
            System.out.println("Does it contain 'Java'? " + input.contains("Java"));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Input string is too short for substring/charAt operations.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        processInput(userInput);
    }
}
