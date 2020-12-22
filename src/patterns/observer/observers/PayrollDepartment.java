package patterns.observer.observers;

public class PayrollDepartment implements IObserver {

    @Override
    public void callMe() {
        System.out.println ("Payroll Department Notified..!");
    }
}
