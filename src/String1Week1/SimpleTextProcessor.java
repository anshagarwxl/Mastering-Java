package String1Week1;
import java.util.Scanner;

public class SimpleTextProcessor {
    private static String[] history = new String[10]; // store last 10 processed strings
    private static int count = 0;

    // Method to process a string
    public static void process(String input) {
        try {
            System.out.println("\n--- Processing String ---");
            System.out.println("Original: " + input);
            System.out.println("Length: " + input.length());
            System.out.println("Uppercase: " + input.toUpperCase());
            System.out.println("Lowercase: " + input.toLowerCase());
            System.out.println("Trimmed: " + input.trim());
            System.out.println("First 3 chars: " + input.substring(0, 3));
            System.out.println("Last char: " + input.charAt(input.length() - 1));
            System.out.println("Replaced spaces with '-': " + input.replace(" ", "-"));
            System.out.println("Contains 'Java'? " + input.contains("Java"));

            // save in history
            if (count < history.length) {
                history[count++] = input;
            } else {
                System.out.println("⚠ History is full, cannot save more.");
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("❌ Error: String too short for substring/charAt operations.");
        }
    }

    // Method to display history of processed strings
    public static void showHistory() {
        System.out.println("\n--- Processed Strings History ---");
        if (count == 0) {
            System.out.println("No strings processed yet.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + history[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========= TEXT PROCESSOR =========");
            System.out.println("1. Enter new string");
            System.out.println("2. Show history");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String input = sc.nextLine();
                    process(input);
                    break;

                case 2:
                    showHistory();
                    break;

                case 3:
                    System.out.println("Exiting... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}