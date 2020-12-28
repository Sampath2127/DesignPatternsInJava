package patterns.factory;

public class VehicleFactory {

    public Vehicle getVehicle( VehicleType vehicleType ) {

        if ( vehicleType.equals (VehicleType.CAR) ) {
            return new Car ();
        } else if ( vehicleType.equals(VehicleType.BUS) ) {
            return new Bus ();
        } else if ( vehicleType.equals (VehicleType.ELECTRIC_CAR) ) {
            return new ElectricCar ();
        } else {
            return null;
        }
    }
}
