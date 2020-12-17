package objectOrientedPrinciples.dependencyInversion.deviceManufacturingProcess.clients;

import objectOrientedPrinciples.dependencyInversion.deviceManufacturingProcess.processes.GeneralManufacturingProcess;
import objectOrientedPrinciples.dependencyInversion.deviceManufacturingProcess.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {

    public static void main( String[] args ) {
        GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess ("IPhone");
        manufacturer.launchProcess ();
    }
}
