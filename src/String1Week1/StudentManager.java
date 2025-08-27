package String1Week1;
import java.util.Scanner;

public class StudentManager {
    private static String[] students = new String[10]; // fixed size for demo
    private static int count = 0;

    // Method to add student
    public static void addStudent(String name) {
        if (count < students.length) {
            students[count] = name;
            count++;
            System.out.println(name + " added successfully.");
        } else {
            System.out.println("Error: Student list is full.");
        }
    }

    // Method to display students
    public static void displayStudents() {
        if (count == 0) {
            System.out.println("No students in the list.");
            return;
        }
        System.out.println("\nList of Students:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }

    // Method to search for a student
    public static void searchStudent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                System.out.println(name + " found at position " + (i + 1));
                return;
            }
        }
        System.out.println(name + " not found in the list.");
    }

    // Method to remove a student
    public static void removeStudent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                // Shift elements left
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                System.out.println(name + " removed successfully.");
                return;
            }
        }
        System.out.println(name + " not found in the list.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Student Manager =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    addStudent(name);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = sc.nextLine();
                    searchStudent(searchName);
                    break;
                case 4:
                    System.out.print("Enter student name to remove: ");
                    String removeName = sc.nextLine();
                    removeStudent(removeName);
                    break;
                case 5:
                    System.out.println("Exiting Student Manager...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}