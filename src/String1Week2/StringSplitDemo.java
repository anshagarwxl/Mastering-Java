package String1Week2;
import java.util.Scanner;
public class StringSplitDemo {

    // method to calc. length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {

        }
        return count;
    }

    // method to split string into words manually
    public static String[] manualSplit(String str) {
        int length = findLength(str);

        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        //Array to store words
        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                words[wordIndex] = str.substring(start, i);
                wordIndex++;
                start = i + 1;
            }
        }
        // last word
        words[wordIndex] = str.substring(start, length);

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String text = sc.nextLine();

        String[] manualWords = manualSplit(text);

        String[] builtinWords = text.split(" ");

        System.out.println("\nManual split result: ");
        for(String w : manualWords){
            System.out.println(w);
        }
        System.out.println("\nBuilt in split result: ");
        for(String w : builtinWords){
            System.out.println(w);
        }
        boolean isSame = compareArrays(manualWords,builtinWords);
        System.out.println("\nComparison Result: " + (isSame ? "Both methods give same result" : "Results differ"));

        sc.close();
    }
}
