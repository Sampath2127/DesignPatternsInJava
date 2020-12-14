package objectOrientedPrinciples.openclosed;

public class EmergencyRoomProcess {

    public static void main( String[] args ) {
        HospitalManagement ERDirector = new HospitalManagement ();
        Employee pam = new Nurse (1l, "Pam", "emergency", true);
        Employee sam = new Doctor (2l, "Sam", "emergency", true);
        ERDirector.callUpon (pam);
        ERDirector.callUpon (sam);
    }
}
