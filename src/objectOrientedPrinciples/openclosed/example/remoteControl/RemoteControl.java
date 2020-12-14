package objectOrientedPrinciples.openclosed.example.remoteControl;

public class RemoteControl {

    private static final RemoteControl remoteControl = new RemoteControl ();

    private Device device = null;

    public static RemoteControl getInstance() {
        return remoteControl;
    }

    public void connectToDevice( Device device ) {
        this.device = device;
        System.out.println ("Connected to device : " + device + "..!");
    }

    public void turnON() {
        device.turnON ();
    }

    public void turnOFF() {
        device.turnOFF ();
    }

}
