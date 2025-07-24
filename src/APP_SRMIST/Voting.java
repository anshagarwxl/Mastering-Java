//1)A government wants to allow only people aged 18 and above to vote in elections. We
//need a Java program where:
//• A user enters their age.
//• The program checks if the age is 18 or more.
//• If yes, it prints "Eligible to vote".
//• If no, it prints "Not eligible to vote".
package APP_SRMIST;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Eligible to vote.");
        }
        else {
            System.out.println("Not eligible to vote.");
        }
    }
}
