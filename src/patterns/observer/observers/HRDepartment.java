package patterns.observer.observers;

public class HRDepartment implements IObserver {

    @Override
    public void callMe() {
        System.out.println ("HR Department Notified..!");
    }
}
