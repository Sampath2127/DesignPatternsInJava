package patterns.observer.observers;

import patterns.observer.domain.Employee;

public class AccountingDepartment implements IObserver {


    @Override
    public void callMe( Employee employee, String message ) {
        System.out.println ("Accounting Department Notified..!");
        System.out.println (message+" "+employee.getEmployeeName ());
    }
}
