package patterns.builder.example.user;

public class Main {

    public static void main( String[] args ) {
        //    User user = new User (); // User class constructor is made private to use inner Builder class.
        // Setters and getters can be used instead of multiple constructors but the state of object is changed for every set and get invocations and is not thread safe.
        User webUser = new User.Builder ("Sam123", "123456")
                .firstName ("Sam")
                .lastName ("Kom")
                .build ();
        //Using builder patter we are simplifying the construction of an object to have standard methods rather creating multiple constructors.
        // User object is an immutable object as there is no way to set or modify state of User once object is created its in immutable state.

        System.out.println (webUser);
    }
}
