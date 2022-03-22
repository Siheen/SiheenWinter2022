package java_intermediates.oops.encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {

        LearnEncapsulation obj= new LearnEncapsulation();

        String empId= obj.getEmployeeId();
        System.out.println(empId);

        int salary= obj.getSalary();
        System.out.println(salary);


        obj.setSalary(1000000);
        System.out.println(obj.getSalary());

        String studentName= obj.studentName;
        System.out.println(studentName);

        String studentId= obj.studentId;
        System.out.println(studentId);

    }
}
