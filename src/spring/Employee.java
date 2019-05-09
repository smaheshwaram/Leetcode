package spring;

import java.util.Iterator;
import java.util.List;

public class Employee {
    private int id;
    private String empName;
    private Student student;
    private List<String> empDetails;
    private Address address;

    public Employee() {}

    public Employee(int id, String empName) {
        this.id = id;
        this.empName = empName;
    }

    public Employee(int id, String empName, Address address) {
        this.id = id;
        this.empName = empName;
        this.address = address;
    }

    public Employee(int id, String empName, Student student, List<String> empDetails) {
        this.id = id;
        this.empName = empName;
        this.student = student;
        this.empDetails = empDetails;
    }

    public void show() {
        System.out.println("Employee name: " + empName + " & Id is: " + id);
        System.out.println("Employee student name: " + student.getName());
        Iterator<String> it = empDetails.iterator();
        System.out.println("Employee details are: " );
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }

    public void getEmpNameID() {
        System.out.println("Employee name: " + empName + " & Id is: " + id);
    }

    public void getEmpAddress() {
        System.out.println(address.getAddress());
    }

}
