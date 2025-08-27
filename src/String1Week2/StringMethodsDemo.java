package String1Week2;
import java.util.Scanner;

public class StringMethodsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = sc.nextLine();

        System.out.println("\n=========String Methods==========");
        //Basic Properties:
        System.out.println("Original: " + text);
        System.out.println("Length" + text.length());
        System.out.println("UpperCase: " + text.toUpperCase());
        System.out.println("LowerCase: "+ text.toLowerCase());
        System.out.println("Trimmed: " + text.trim()+ " ");

        //Characters and Substring
        if(text.length() > 0) {
            System.out.println("First Char: " + text.charAt(0));
            System.out.println("Last Char: " + text.charAt(text.length() - 1));
        }
        if(text.length()>=5){
            System.out.println("Substring (0-5): "+ text.substring(0,5));
        }
        //Searching
        System.out.println("Contains Java? " + text.contains("Java"));
        System.out.println("Index of 'a': "+ text.indexOf('a'));
        //Replace and Split
        System.out.println("Replace 'a' with '-': " + text.replace("a","@"));
        String[] words = text.split(" ");
        System.out.println("Words Count: " + words.length);
        //Equality
        System.out.println("Equals 'hello'?" + text.equals("hello"));
        System.out.println("EqualsIgnoreCase 'hello'? " + text.equalsIgnoreCase("hello"));
        //Vowels,Consonants,Digits

        int vowels = 0, consonants = 0, digits = 0;
        String lower = text.toLowerCase();
        for(int i = 0; i<lower.length();i++) {
            char ch = lower.charAt(i);
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
                else if (Character.isDigit(ch)) {
                    digits++;
                }
            }
            System.out.println("Vowel Count: " + vowels);
            System.out.println("Consonant Count: " + consonants);
            System.out.println("Digit Count : " + digits);
        }


        }



