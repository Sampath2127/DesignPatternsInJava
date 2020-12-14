package objectOrientedPrinciples.openclosed;

public class Doctor extends Employee {

    public Doctor( long employeeId, String employeeName, String department, boolean employeeWorking ) {
        super (employeeId, employeeName, department, employeeWorking);
    }

    @Override
    public void performDuties() {
        prescribeMedicine ();
        diagnosePatient ();
    }


    private void prescribeMedicine() {
        System.out.println ("Prescribing Medicine..!");
    }

    private void diagnosePatient() {
        System.out.println ("Diagnosing Patient..!");
    }
}
