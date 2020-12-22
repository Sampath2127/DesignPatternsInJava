package patterns.observer;

import patterns.observer.domain.Employee;
import patterns.observer.observers.HRDepartment;
import patterns.observer.observers.IObserver;
import patterns.observer.observers.PayrollDepartment;
import patterns.observer.subjects.EmployeeManagementSystem;

import java.util.Date;

public class Main {

    public static void main( String[] args ) {

        IObserver payroll = new PayrollDepartment ();
        IObserver hrSystem = new HRDepartment ();

        Employee sachin = new Employee ("Sachin",new Date (), 700000, true);
        Employee sid = new Employee ("Siddhartha",new Date (), 700000, true);

        EmployeeManagementSystem ems = new EmployeeManagementSystem ();

        ems.registerObserver (payroll);
        ems.registerObserver (hrSystem);

        ems.hireEmployee (sachin);
        ems.hireEmployee (sid);

        ems.updateEmployee (sachin, "Sachin Tendulkar", 0);





    }
}
