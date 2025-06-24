package ProgrammingElements1;//Sample Program 1 - Write a program to display Sam with Roll Number 1, Percent Marks 99.99, and the result ‘P’ indicates Pass(‘P’) or Fail (‘F’).

public class DisplayResult {
    String name = "Sam";
    int rollNumber= 1;
    double percentMarks = 99.99;
    char result = 'P';

    public static void main (String[] args) {
        DisplayResult student = new DisplayResult();
        System.out.println("Displaying Result: \n" + student.name + "with Roll number" + student.rollNumber + "has scored" + student.percentMarks + "% Marks and Result is " + student.result);
    }
}
