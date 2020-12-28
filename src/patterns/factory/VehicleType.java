package patterns.factory;

public enum VehicleType {

    CAR{
        public Vehicle getVehicle() {
           return new Car ();
        }
    } ,
    BUS{
        public Vehicle getVehicle() {
            return new Bus ();
        }
    }
    ,ELECTRIC_CAR {
        public Vehicle getVehicle() {
            return new ElectricCar ();
        }
    };


    abstract Vehicle getVehicle();
}
