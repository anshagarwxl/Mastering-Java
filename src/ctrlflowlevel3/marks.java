//Write a program to input marks and 3 subjects physics, chemistry and maths.
// Compute the percentage and then calculate the grade as per the following guidelines
//Hint =>
//Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks
package ctrlflowlevel3;
import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter chemistry marks: ");
        int chem = sc.nextInt();
        System.out.println("Enter physics marks: ");
        int phy = sc.nextInt();
        System.out.println("Enter maths marks: ");
        int math = sc.nextInt();
        double avg = (phy+chem+math)/3.0;
        System.out.println("Your average of the three subjects is: "+avg);
        double percentage = ((phy+chem+math)*100)/300;
        System.out.println("Your percentage is: "+percentage);
        if(percentage>=80){
            System.out.println("Level 4, above agency-normalized standards");
        }
        else if(percentage>=70 && percentage<=79){
            System.out.println("Level 3, at agency-normalized standards");
        } else if (percentage>=60 && percentage<=69){
            System.out.println("Level 2,below, but approaching agency-normalized standards");
        } else if(percentage>=50 && percentage<=59){
            System.out.println("Level 1, well-below agency-normalized standards");
        } else if(percentage>=40 && percentage<=49){
            System.out.println("Level 1, too below agency-normalized standards");
        } else if(percentage<=39){
            System.out.println("Remedial standards");
        }
    }
}
