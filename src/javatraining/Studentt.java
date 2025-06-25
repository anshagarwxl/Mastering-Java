//write two classes Student and Professor with following specifications
// 1) Professor should be able to see the marks of Student but should not be able to see address of Student.
// Student should be able to see department of Professor and also
// Student should be able to see educational qualification of Professor but cannot see its salary
// Also write a third class which you can call as ClientDemo
// in which I want you to attempt to access all methods of Student class and Professor class.
// Student will have attribute marks, address.
// Class Professor will have attributes like department, salary,educationalQualification
package javatraining;


public class Studentt{
         private int marks;
         private String address;
         public Studentt(int marks, String address){
             this.marks = marks;
             this.address=address;
}
    public int getMarks(){
             return marks;
    }
    public void viewProffdepartment(Professor dept) {
        System.out.println("Professor's Department is: "+dept.getDepartment());
    }
    public void viewProffeduction(Professor edu) {
        System.out.println("Professor's education qualification are: "+edu.getEducation());
    }
    }

     class Professor{
       private String department;
        private String education;
        private int salary;
        public Professor(String department,String education,int salary){
            this.department = department;
            this.education = education;
            this.salary=salary;
        }
        public String getDepartment(){
            return department;
        }
        public String getEducation(){
            return education;
        }
        public void viewStudentMarks(Studentt mark){
            System.out.println("Student's marks are: "+ mark.getMarks());
        }
    }

class ClientDemo{
    public static void main(String[] args) {
        Studentt std1 = new Studentt(80,"India");
        System.out.println(std1.getMarks());
        //System.out.println(std1.getAdrress());

        Professor prof1 = new Professor("CTECH","MTECH",90000);
        System.out.println(prof1.getDepartment());
        System.out.println(prof1.getEducation());
    }
}