package interview;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int employeeId;
    private String name;
    private String address;

    Employee(int employeeId, String name, String address) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //comparator methods
    @Override
    public int compareTo(Employee e1) {
        return this.getEmployeeId() - e1.getEmployeeId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }

    @Override
    public boolean equals(Object o) {
        return o.equals(this.employeeId);
    }

}
