package interview;

import java.util.*;

public class EmployeeCompare {
    public static void main(String [] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Suchi", "123 denmark"));
        employeeList.add(new Employee(2, "Larry", "45 walnut"));

        //sort employees by employee id
        Collections.sort(employeeList);

        //ToDo: print sorted employee list

        //sort employees by employee name (it implements Comparator class)
        Collections.sort(employeeList, new EmployeeNameComparator());

        Employee e1 = new Employee(8, "nani", "87 hyd");
        Employee e2 = new Employee(9, "yani", "87 hyd");

        //printing hash code values of two employees
        System.out.println("Employee e1 hash value is: " + e1.hashCode());
        System.out.println("Employee e2 hash value is: " + e2.hashCode());

        //compare two employee if they are equal
        System.out.println("Is e1  equals to e2? : " + e1.equals(e2));

    }

}

//class to compare employee by name
class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
