package javatraining;

public class Employee1 {
    private int empId;
    private String name;
    boolean isContractor;

    public int getEmpId(){
        return empId;
    }
    public String getName(){
        return name;
    }
    public Employee1(){

    }
    public static String getDepartment(){
        return "IT";
    }
    public Employee1(int empId,String name,boolean type){
        this.empId=empId;
        this.name=name;
        this.isContractor=type;
    }

    public static void main(String[] args) {
        Employee1 obj1 = new Employee1(001,"ansh",false);
        Employee1 obj2 = new Employee1(002,"vansh",true);
        System.out.println(obj2.empId);
        System.out.println(obj1.getName());

    }
}



