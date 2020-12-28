package patterns.builder.example.vehicle;

public class Main {

    public static void main( String[] args ) {

        Vehicle vehicle = new Vehicle.Builder ("Car", "Mazda", "Miata", 42000l)
                .color ("Blue")
                .doors (2)
                .horsePower (186)
                .build ();

        System.out.println (vehicle);
    }
}
