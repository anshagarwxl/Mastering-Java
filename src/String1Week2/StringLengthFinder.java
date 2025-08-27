package String1Week2;
import java.util.Scanner;
public class StringLengthFinder {

    //method to calculate string length without using builtin length() method:
    public static int findLength(String str){
        int count = 0;
        try {
            while(true){
                str.charAt(count);
                count++;
            }
        }
        catch (StringIndexOutOfBoundsException e){

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        int customLength = findLength(input);

        int builtinLength = input.length();

        System.out.println("Calculated length without using built-in length() method: " + customLength);
        System.out.println("Built-in length method() result : "+ builtinLength);

    }
}
