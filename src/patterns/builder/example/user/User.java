package patterns.builder.example.user;

public class User {

    private String userName; // required field
    private String emailAddress; // required field
    private String firstName; // optional field
    private String lastName; // optional field
    private String phoneNumber; // optional field
    private String address; // optional field

    private User( Builder builder ) {
        this.userName = builder.userName;
        this.emailAddress = builder.emailAddress;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    public static class Builder {

        private String userName;
        private String emailAddress;
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String address;


        public Builder( String userName, String emailAddress ) { // mandatory field constructor
            this.userName = userName;
            this.emailAddress = emailAddress;
        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public User build(){
            return new User (this);
        }
    }


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
