package objectOrientedPrinciples.openclosed.example.remoteControl;

public class Television implements Device{

    @Override
    public void turnON() {
        System.out.println ("Turning on TV");
    }

    @Override
    public void turnOFF() {
        System.out.println ("Turning OFF TV");
    }

    public String toString(){ return "Television";}

}
