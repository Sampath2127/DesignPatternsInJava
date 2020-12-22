package patterns.observer.observers;

import patterns.observer.domain.Employee;

public interface IObserver {

    public void callMe( Employee employee, String message );
}
