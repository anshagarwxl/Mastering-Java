package week1level1;

public class Avgpercentmark {
    public static void main(String[] args){
        String name = "Sam";
        String subject1 ="Maths";
        String subject2 ="Physics";
        String subject3 ="Chemistry";
        int mathMarks = 94;
        int phyMarks = 95;
        int chemMarks = 96;
        int noOfSubjects = 3;
        int scoredPcmMarks = mathMarks + phyMarks + chemMarks;
        int avgMarks = scoredPcmMarks / noOfSubjects;
        System.out.println(name + "'s average marks in PCM is " + avgMarks);
    }
}
