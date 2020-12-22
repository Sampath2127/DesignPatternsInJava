package patterns.observer.repository;

import patterns.observer.domain.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDAO {

    private final List<Employee> employeeList;

    public EmployeeDAO() {
        employeeList = new ArrayList<> ();
       employeeList.add (new Employee ("Ram", new Date (), 300000, true));
        employeeList.add( new Employee ("Arjun", new Date (), 500000, true));
        employeeList.add (new Employee ("Sam", new Date (), 100000, true));
        employeeList.add ( new Employee ("Bhar", new Date (), 100000, true));

    }

    public void save( Employee employee ) {
        employeeList.add (employee);
    }

    public void updateEmployee( Employee employee ) {
        int employeeIndex = employeeList.indexOf (employee);
        employeeList.add (employeeIndex, employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
