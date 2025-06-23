package javatraining;

public class Student {
    int rollNumber;
    String name;
    boolean isHostelResident;
    static String schoolName = "St. Peter";

    public Student(int roll, String name, boolean isHostelResident) {
        this.rollNumber = roll;
        this.name = name;
        this.isHostelResident = isHostelResident;
    }


    public static void main(String args[]) {
        Student st1 = new Student(101, "Anushka", true);
        Student st2 = new Student(101, "Kiran", false);
        Student st3 = new Student(101, "Mohan", true);

        System.out.println(st1.name);
        System.out.println(st2.name);
        System.out.println(st3.name);
        st1.name = "Ashok";

        System.out.println(st1.schoolName);
        System.out.println(st2.schoolName);
        System.out.println(st3.schoolName);

    }
}
