package patterns.observer.observers;

import patterns.observer.domain.Employee;

public class HRDepartment implements IObserver {


    @Override
    public void callMe( Employee employee, String message ) {
        System.out.println ("HR Department Notified..!");
        System.out.println (message+" "+employee.getEmployeeName ());

    }
}
