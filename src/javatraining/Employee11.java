package javatraining;


class Employee11 {
    public int salary = 5000;
    public String address = "London";

    public int getSalary() {

        return salary;
    }

    public static void main(String[] args) {
        Employee11 obj = new Employee11();
        System.out.println(obj.salary);
        System.out.println(obj.getSalary());
    }
}
