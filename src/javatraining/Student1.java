package javatraining;

public class Student1 {
    private int rollNumber;
    private int marks;
    private String name;
    private static String subject="JAVA";
    public int getRollNumber() {
        return rollNumber;
    }
    public int getMarks(){
        return marks;
    }

    public static String getSubject(){
        return subject;
    }
    public String getName(){
        return name;
    }
    public Student1(int rollNumber, int marks, String name){
        this.rollNumber=rollNumber;
        this.marks=marks;
        this.name=name;
    }

    public static void main(String[] args) {
        Student1.getSubject();
        Student1 st1 = new Student1(123,100,"Ansh");
        st1.getMarks();
        System.out.println(st1.marks);
        System.out.println(st1.getName());
    }
}
