package objectOrientedPrinciples.openclosed.example.remoteControl;

public class Projector implements Device {

    @Override
    public void turnON() {
        System.out.println ("Turning on Projector");
        pullDownProjectorScreen ();
    }

    @Override
    public void turnOFF() {
        System.out.println ("Turning OFF Projector");
        pullUpProjectorScreen ();
    }

    private void pullDownProjectorScreen(){
        System.out.println ("Screen has been lowered for viewing..!");
    }

    private void pullUpProjectorScreen(){
        System.out.println ("Screen has been pulled up..!");
    }

    @Override
    public String toString() {
        return "Projector";
    }
}
