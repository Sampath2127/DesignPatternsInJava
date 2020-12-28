package patterns.factory;

public class Car implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println ("Starting Car Engine..!");
    }
}
