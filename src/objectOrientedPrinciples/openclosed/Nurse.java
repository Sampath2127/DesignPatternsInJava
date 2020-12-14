package objectOrientedPrinciples.openclosed;

public class Nurse extends Employee {

    public Nurse( long employeeId, String employeeName, String department, boolean employeeWorking ) {
        super (employeeId, employeeName, department, employeeWorking);
    }

    @Override
    public void performDuties() {
        checkVitalSigns ();
        drawBlood ();
        cleanPatientArea ();
    }

    private void checkVitalSigns() {
        System.out.println ("checking Vitals of Patient..!");
    }

    private void drawBlood() {
        System.out.println ("Drawing blood..!");
    }

    private void cleanPatientArea() {
        System.out.println ("Cleaning Patient Area..! ");
    }
}
