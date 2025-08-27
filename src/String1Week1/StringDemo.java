package String1Week1;
import java.util.Scanner;
public class StringDemo {

    //Demonstrating Creation
    public static void demonstrateCreation(){
        String literal = "Hello";
        String object = new String("World");
        char[] chars = {'J', 'a', 'v', 'a'};
        String fromArray = new String(chars);

        System.out.println("String Literal: " + literal);
        System.out.println("String Object: " + object);
        System.out.println("From Char Array: " + fromArray);
    }
    public static void demonstrateManipulation(String input) {
        System.out.println("\nOriginal String: " + input);
        System.out.println("Length: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Substring (0,3): " + input.substring(0, 3));
        System.out.println("Character at index 2: " + input.charAt(2));
        System.out.println("Trimmed: " + input.trim());
        System.out.println("Replaced (a→@): " + input.replace('a', '@'));
    }

    public static void main(String[] args) {
        demonstrateCreation();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a string for manipulation: ");
        String userInput = sc.nextLine();

        demonstrateManipulation(userInput);
    }
}
