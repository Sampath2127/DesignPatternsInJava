package objectOrientedPrinciples.singleresponsibility;

import objectOrientedPrinciples.singleresponsibility.clients.ClientModule;
import objectOrientedPrinciples.singleresponsibility.domain.Employee;
import objectOrientedPrinciples.singleresponsibility.reporting.FormatType;

public class Main {

    public static void main( String[] args ) {
        ClientModule clientModule = new ClientModule ();
        Employee employee1 = new Employee (123, "Sam", "Technical", true);
        Employee employee2 = new Employee (456, "Pam", "Accounting", true );
        Employee employee3 = new Employee (789, "Chuck", "Business", true);
        clientModule.hireEmployee (employee1);
        clientModule.hireEmployee (employee2);
        clientModule.hireEmployee (employee3);

        clientModule.printEmployeeReport (employee1, FormatType.XML);

        clientModule.terminateEmployee (employee2);

        clientModule.printEmployeeReport (employee2, FormatType.CSV);

    }
}
