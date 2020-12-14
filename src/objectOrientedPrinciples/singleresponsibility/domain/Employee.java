package objectOrientedPrinciples.singleresponsibility.domain;

public class Employee {

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

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId( long employeeId ) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName( String employeeName ) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment( String department ) {
        this.department = department;
    }

    public boolean isEmployeeWorking() {
        return employeeWorking;
    }

    public void setEmployeeWorking( boolean employeeWorking ) {
        this.employeeWorking = employeeWorking;
    }


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
