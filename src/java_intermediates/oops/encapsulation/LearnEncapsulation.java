package java_intermediates.oops.encapsulation;

public class LearnEncapsulation {

    /*
    Data hiding
        NO ACCESS
        READ-ONLY
        READ/WRITE ACCESS
     */
    //THIS IS ONLY NO ACCESS
    String studentName = "Luc";
    String studentId = "8460IL";
    private String employeeId = "1234567";
    private int salary = 170000;

      // shortcut for setters and getters right click and click on Generate


// Getters

    public String getEmployeeId() {

        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {

        this.employeeId = employeeId;
    }

    //setters
    public int getSalary() {

        return salary;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }
}
