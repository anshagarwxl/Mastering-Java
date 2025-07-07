package javatraining;

public class Teacher {
    static String department="CS";
    int empId;
    public static void DepartmentName(){
        System.out.println("Department name method");
        System.out.println(department);
    }

    private static void address(){
        System.out.println("address method");
    }

    public static void main(String[] args) {
        System.out.println("Main method of teacher class");
        System.out.println(department);
        DepartmentName();
    }
}
