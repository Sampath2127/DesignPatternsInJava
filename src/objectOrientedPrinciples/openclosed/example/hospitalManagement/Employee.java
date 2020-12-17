package objectOrientedPrinciples.openclosed.example.hospitalManagement;

abstract public class Employee {

    private long employeeId;
    private String employeeName;

    private String department;

    private boolean employeeWorking;

    public Employee( long employeeId, String employeeName, String department, boolean employeeWorking ) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.employeeWorking = employeeWorking;
    }

    public abstract void performDuties();

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                ", employeeWorking=" + employeeWorking +
                '}';
    }

}
