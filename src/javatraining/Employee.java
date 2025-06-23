class Employee {
    int empId;
    String name;
    int salary;
    static String companyName;

    public Employee(int id, String name, int salary) {
        this.empId = id;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String arg[]) {
        int temp = 5;
        Employee emp1 = new Employee(1, "Sam", 5000);
        System.out.println(emp1.name);

        Employee emp2 = new Employee(2, "Kavita", 4000);
        System.out.println(emp2.salary);

        Employee.companyName = "Microsoft";
        System.out.println(Employee.companyName);
    }
}
