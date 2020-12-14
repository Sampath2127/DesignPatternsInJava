package objectOrientedPrinciples.singleresponsibility.reporting;

import objectOrientedPrinciples.singleresponsibility.domain.Employee;

public abstract class ReportFormatter {

    private String formattedOutput;

    public ReportFormatter( Object object, FormatType formatType ) {
        switch ( formatType ) {
            case CSV:
                formattedOutput = convertObjectToCSV (object);
                break;
            case XML:
                formattedOutput = convertObjectToXML (object);
                break;
        }
    }


    private String convertObjectToXML( Object object ) {
        Employee employee = ( Employee ) object;
        StringBuilder xmlFormat = new StringBuilder ();
        xmlFormat.append ("<employeeId>").append (employee.getEmployeeId ()).append ("</employeeId>")
                .append ("\n")
                .append ("<employeeName>").append (employee.getEmployeeName ()).append ("</employeeName>")
                .append ("\n")
                .append ("<employeeDepartment>").append (employee.getDepartment ()).append ("</employeeDepartment>")
                .append ("\n")
                .append ("<employeeWorking>").append (employee.isEmployeeWorking ()).append ("</employeeWorking>");

        return xmlFormat.toString ();
    }


    private String convertObjectToCSV( Object object ) {
        return "CSV Format: ,,," + object.toString () + ",,,";
    }

    protected String getFormattedValue() {
        return formattedOutput;
    }


}
