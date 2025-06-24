package ProgrammingElements2;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("What's your name bud?");
        String name = sc.nextLine();
        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println("ohh so you're " + age + "years old.");
        sc.nextLine();
        System.out.println("What do you like to eat on a Sunday morning?");
        String food = sc.nextLine();
        System.out.println("Good to see you " + name);
        System.out.println("I enjoy eating " + food + " a lot.");
    }
}
