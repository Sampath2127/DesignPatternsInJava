package patterns.observer.domain;

import java.util.Date;

public class Employee {

    private String employeeName;
    private Date joinDate;
    private long employeeSalary;
    private boolean isEmployeeWorking;

    public void setEmployeeSalary( long employeeSalary ) {
        this.employeeSalary = employeeSalary;
    }

    public void setEmployeeName( String employeeName ) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public long getEmployeeSalary() {
        return employeeSalary;
    }

    public boolean isEmployeeWorking() {
        return isEmployeeWorking;
    }

    public Employee( String employeeName, Date joinDate, long employeeSalary, boolean isEmployeeWorking ) {
        this.employeeName = employeeName;
        this.joinDate = joinDate;
        this.employeeSalary = employeeSalary;
        this.isEmployeeWorking = isEmployeeWorking;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", joinDate=" + joinDate +
                ", employeeSalary=" + employeeSalary +
                ", isEmployeeWorking=" + isEmployeeWorking +
                '}';
    }
}
