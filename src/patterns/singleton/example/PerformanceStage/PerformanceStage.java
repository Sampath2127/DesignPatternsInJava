package patterns.singleton.example.PerformanceStage;

import sun.misc.Perf;

public class PerformanceStage {

    private static PerformanceStage INSTANCE = null;
    private static int counter;

    //private constructor is required for singleton pattern
    private PerformanceStage() {
        counter++;
    }

    //Synchronized to prevent threads create different instances per request/thread.
    public synchronized static PerformanceStage getInstance() {
        if ( INSTANCE == null ) {
            INSTANCE = new PerformanceStage ();
        }
        return INSTANCE;
    }

    public void turnOnLights() {
        System.out.println ("Turned On Lights..!");
    }

    public int getCounter() {
        return counter;
    }
}
