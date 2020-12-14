package objectOrientedPrinciples.openclosed.example.remoteControl;

public class SoundSystem implements Device {

    @Override
    public void turnON() {
        System.out.println ("Turning on SoundSystem");
        switchToFavoriteList ();
        increaseVolume ();
    }

    @Override
    public void turnOFF() {
        lowerVolume ();
        System.out.println ("Turning OFF SoundSystem");
    }

    private void increaseVolume(){
        System.out.println ("Increasing volume to last set ..!");
    }

    private void switchToFavoriteList(){
        System.out.println ("Switching to your favorite audio list..!");
    }

    private void lowerVolume(){
        System.out.println ("Lowering volume before turning OFF the system..!");
    }


    public String toString(){ return "SoundSystem";}

}
