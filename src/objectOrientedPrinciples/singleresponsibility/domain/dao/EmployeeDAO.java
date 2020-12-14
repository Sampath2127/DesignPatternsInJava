package objectOrientedPrinciples.singleresponsibility.domain.dao;

import objectOrientedPrinciples.singleresponsibility.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    private List<Employee> employees = new ArrayList<> ();

    public void saveEmployeeToDatabase( Employee employee ) {
        if ( !employees.contains (employee) ){
            employees.add (employee);
        }
        else System.out.println ("Employee Already Exists..!");
    }

    public void removeEmployee( Employee employee ) {
        if ( employees.size () > 0 && employee.isEmployeeWorking () ){
            employee.setEmployeeWorking (false);
            employees.remove (employees.indexOf (employee));
        }else{
            System.out.println ("Employee Doesn't Exists..!");
        }
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }
}
