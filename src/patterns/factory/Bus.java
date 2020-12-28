package patterns.factory;

public class Bus implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println ("Starting Bus Engine..!");
    }
}
