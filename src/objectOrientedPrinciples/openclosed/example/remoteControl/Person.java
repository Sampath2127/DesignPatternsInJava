package objectOrientedPrinciples.openclosed.example.remoteControl;

public class Person {

    public static void main( String[] args ) {

        Projector projector = new Projector ();
        Television television = new Television ();
        RemoteControl remoteControl = RemoteControl.getInstance();

        remoteControl.connectToDevice (projector);
        remoteControl.turnON ();

        remoteControl.connectToDevice (television);
        remoteControl.turnON ();
    }
}
