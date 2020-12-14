package objectOrientedPrinciples.singleresponsibility.clients;

import objectOrientedPrinciples.singleresponsibility.reporting.EmployeeReportFormatter;
import objectOrientedPrinciples.singleresponsibility.reporting.FormatType;
import objectOrientedPrinciples.singleresponsibility.domain.Employee;
import objectOrientedPrinciples.singleresponsibility.domain.dao.EmployeeDAO;

public class ClientModule {

    private EmployeeDAO employeeDAO = new EmployeeDAO ();

    public void hireEmployee( Employee employee ) {
        employeeDAO.saveEmployeeToDatabase (employee);
    }

    public void terminateEmployee( Employee employee ) {
        employeeDAO.removeEmployee (employee);
    }

    public void printEmployeeReport(Employee employee, FormatType formatType){
        EmployeeReportFormatter empFormatter= new EmployeeReportFormatter (employee, formatType);
        System.out.println (empFormatter.getFormattedEmployee ());
    }
}
