package patterns.observer.subjects;

import patterns.observer.domain.Employee;
import patterns.observer.observers.IObserver;
import patterns.observer.repository.EmployeeDAO;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements ISubject {

    private List<IObserver> observerList;
    private EmployeeDAO employeeDAO;
    private Employee employee;
    private String message;

    public EmployeeManagementSystem() {
        observerList = new ArrayList<> ();
        employeeDAO = new EmployeeDAO ();
    }

    @Override
    public void notifyObservers() {
        for ( IObserver observer : observerList ) {
            observer.callMe (employee, message);
        }
    }

    @Override
    public void registerObserver( IObserver observer ) {
        observerList.add (observer);
    }

    @Override
    public void removeObserver( IObserver observer ) {
        observerList.remove (observer);
    }

    public void hireEmployee( Employee employee ) {
        this.employee = employee;
        this.message = "New Hire: ";
        employeeDAO.save (employee);
        notifyObservers ();
    }

    public void updateEmployee( Employee employee, String employeeName, long salary ) {
        List<Employee> employeeList = employeeDAO.getEmployeeList ();
        Employee employeeUpdated = null;
        int empIndex=-1;
        try{
             empIndex = employeeList.indexOf (employee);
             employeeUpdated = employeeList.get (empIndex);
        }catch ( NullPointerException npe ){
            System.out.println ("No Employee found \n Add as a new Hire if new Employee");
            return;
        }
        if ( !employeeName.isEmpty () ) {
            employeeUpdated.setEmployeeName (employeeName);
            this.employee = employeeUpdated;
            message = "Employee Name Modified: ";
            notifyObservers ();
        }
        if ( salary > 0 ) {
            employeeUpdated.setEmployeeSalary (salary);
            this.employee = employeeUpdated;
            message = "Employee Salary Updated: ";
            notifyObservers ();
        }
        employeeList.add (empIndex, employeeUpdated);
    }


}
