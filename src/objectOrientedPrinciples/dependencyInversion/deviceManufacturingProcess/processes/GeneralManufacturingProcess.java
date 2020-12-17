package objectOrientedPrinciples.dependencyInversion.deviceManufacturingProcess.processes;

public abstract class GeneralManufacturingProcess {

    private String processName;

    public GeneralManufacturingProcess( String name ) {
        this.processName = name;
    }

    public void launchProcess() {
        if ( processName != null && !processName.isEmpty () ) {
            assembleDevice ();
            testDevice ();
            packageDevice ();
            storeDevice ();
        } else {
            System.out.println ("No process name was specified..!");
        }
    }

    protected abstract void assembleDevice();

    protected abstract void testDevice();

    protected abstract void packageDevice();

    protected abstract void storeDevice();
}
