package javatraining;

class Employee5 {

    private int salary = 5000;

    public String address = "London";

    public int getSalary() {
        System.out.println(this);
        return salary;
    }

    public static void getDepartment2() {
        System.out.println("I could not start chapter 2 because students did not study chapter1");
    }

    public String getAddress() {
        getDepartment2();
        return address;
    }

    public static void getDepartment() {
        System.out.println("IT department");
        new Employee5().getAddress();
    }

    public static void main(String ...x) {
        getDepartment();
    }
}
