package patterns.builder.example.vehicle;


public class Vehicle {

    private String type;
    private String make;
    private String model;
    private long price;
    private int horsePower;
    private String color;
    private int doors;

    private Vehicle( Builder builder){
        this.type = builder.type;
        this.make = builder.make;
        this.model = builder.model;
        this.price = builder.price;
        this.horsePower = builder.horsePower;
        this.color = builder.color;
        this.doors = builder.doors;
    }

    public static class Builder{
        private String type;
        private String make;
        private String model;
        private long price;
        private int horsePower;
        private String color;
        private int doors;

        public Builder(String type, String make, String model, long price){
            this.type = type;
            this.make = make;
            this.model = model;
            this.price = price;
        }

        public Builder horsePower(int horsePower){
            this.horsePower = horsePower;
            return this;
        }

        public Builder color(String color){
            this.color = color;
            return this;
        }

        public Builder doors(int doors){
            this.doors=doors;
            return this;
        }

        public Vehicle build(){
            return new Vehicle (this);
        }

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", horsePower=" + horsePower +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                '}';
    }
}
