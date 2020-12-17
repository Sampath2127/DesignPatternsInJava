package objectOrientedPrinciples.liskovSubstitutionPrinciple;

public abstract class SchoolStaff {


    private void makeAnnouncements(){
        System.out.println ("Made announcements");
    }
    private void takeAttendance(){
        System.out.println ("Took attendance");
    }
    private void collectPaperWork(){
        System.out.println ("Collected paperwork");
    }
    private void conductHallwayDuties(){
        System.out.println ("Conducted hallway duties");
    }

    public void performOtherResponsibilities(){
        makeAnnouncements ();
        takeAttendance ();
        collectPaperWork ();
        conductHallwayDuties ();
    }
}
