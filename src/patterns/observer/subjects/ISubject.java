package patterns.observer.subjects;

import patterns.observer.observers.IObserver;

public interface ISubject {
    public void registerObserver( IObserver observer );
    public void removeObserver(IObserver observer);
    public void notifyObservers();

}
