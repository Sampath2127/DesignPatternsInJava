package patterns.observer.service;

import patterns.observer.domain.Employee;
import patterns.observer.observers.IObserver;
import patterns.observer.repository.EmployeeDAO;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {

    private final List<IObserver> observerList = new ArrayList<> ();
    private EmployeeDAO employeeDAO = new EmployeeDAO ();

    public void registerObserver( IObserver observer ) {
        this.observerList.add (observer);
    }

    public void notifyAllDepartments(){
        for(IObserver observer: observerList){
            observer.callMe ();
        }
    }

    public void hireEmployee( Employee employee ){
        employeeDAO.save(employee);
        System.out.println ("Hired employee :"+ employee.getEmployeeName ());
        notifyAllDepartments ();
    }

    public void updateEmployee(Employee employee, String employeeName, long salary){
        List<Employee> employeeList = employeeDAO.getEmployeeList ();
        int empIndex = employeeList.indexOf (employee);
        Employee employeeUpdated = employeeList.get (empIndex);
        if(!employeeName.isEmpty ()){
            employeeUpdated.setEmployeeName (employeeName);
            System.out.println ("Employee Name Modified: "+employeeName);
            notifyAllDepartments ();
        }
        if(salary>0) {
            employeeUpdated.setEmployeeSalary (salary);
            System.out.println ("Employee Salary Updated: "+salary);
            notifyAllDepartments ();
        }
    }


}
