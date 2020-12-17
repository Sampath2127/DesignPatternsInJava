package objectOrientedPrinciples.liskovSubstitutionPrinciple;

public class ScienceTeacher extends SchoolStaff implements CourseInstructor {
    @Override
    public void teach() {
        System.out.println ("Teaching Science");
    }
}
