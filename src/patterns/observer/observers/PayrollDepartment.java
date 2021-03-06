package patterns.observer.observers;

import patterns.observer.domain.Employee;

public class PayrollDepartment implements IObserver {

    @Override
    public void callMe( Employee employee, String message ) {
        System.out.println ("Payroll Department Notified..!");
        System.out.println (message+" "+employee.getEmployeeName ());
    }
}
