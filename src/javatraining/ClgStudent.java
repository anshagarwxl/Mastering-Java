package javatraining;

public class ClgStudent {
    int rollNumber;
    String name;
    void read(){
        System.out.println(this);
        this.play();
        play();
        System.out.println("Student reads");
    }
    void play(){
        System.out.println("Student plays");
    }

    public static void main(String[] args) {
        //System.out.println(this);
        ClgStudent s = new ClgStudent();
        System.out.println(s.name);
        //s.read();
        //s.play();
    }
}
