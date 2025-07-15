package javatraining;

public class Sttudentt {
    private int rollNumber;
    private int marks;
    private String name;
    private static String subject = "JAVA";

    public int getRollNumber() {
        return rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public static String getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }

    public Sttudentt(int rollNumber, int marks, String name) {
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println(Sttudentt.getSubject());
        Sttudentt st1 = new Sttudentt(123, 100, "Ansh");
        System.out.println(st1.getMarks());
        System.out.println(st1.getName());
    }
}
