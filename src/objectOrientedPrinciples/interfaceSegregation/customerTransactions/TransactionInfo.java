package objectOrientedPrinciples.interfaceSegregation.customerTransactions;

public class TransactionInfo {

    public static void main( String[] args ) {
        ReportGenerator transactionReports = new ReportGenerator (new CustomerTransaction ());
        transactionReports.generateReport ();
    }
}
