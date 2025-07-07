package javatraining;

public class lecture14 {
    int rollno;
    String name;

    public lecture14(int rollNumber, String nm){
        this.rollno=rollNumber;
        this.name=nm;
    }
    int getRollno(){
        return  rollno;
    }
    lecture14(){
        System.out.println("No argument constructor called");
    }

    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        int y=6;
        lecture14 l14 = new lecture14();
        lecture14 lec14 = new lecture14(1,"ria");
        System.out.println(y);
    }
}
