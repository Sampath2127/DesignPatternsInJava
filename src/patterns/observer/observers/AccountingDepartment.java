package patterns.observer.observers;

public class AccountingDepartment implements IObserver {

    @Override
    public void callMe() {
        System.out.println ("Accounting Department Notified..!");
    }
}
