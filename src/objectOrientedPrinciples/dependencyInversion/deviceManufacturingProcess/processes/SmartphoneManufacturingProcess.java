package objectOrientedPrinciples.dependencyInversion.deviceManufacturingProcess.processes;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {

    public SmartphoneManufacturingProcess( String name ) {
        super (name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println ("Assembled Smartphone");
    }

    @Override
    protected void testDevice() {
        System.out.println ("Tested Smartphone");
    }

    @Override
    protected void packageDevice() {
        System.out.println ("Packaged Smartphone");
    }

    @Override
    protected void storeDevice() {
        System.out.println ("Stored Smartphone");
    }
}
