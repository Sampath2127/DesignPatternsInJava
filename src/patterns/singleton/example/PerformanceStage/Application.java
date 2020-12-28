package patterns.singleton.example.PerformanceStage;

public class Application {

    public static void main( String[] args ) {
        PerformanceStage stage = PerformanceStage.getInstance ();

        stage.turnOnLights ();
        System.out.println (stage.getCounter ());

        PerformanceStage stage1 = PerformanceStage.getInstance ();
        System.out.println (stage1.getCounter ()); // doesn't increment as the instance will be created exactly once.
    }
}
