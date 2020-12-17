package objectOrientedPrinciples.interfaceSegregation.customerTransactions;

public class ReportGenerator {

    private Reporting transactionObject;

    public ReportGenerator( Reporting transactionObject ) {
        this.transactionObject = transactionObject;
    }

    public void generateReport(){
        System.out.println (transactionObject.getDate ()+" "
        +transactionObject.getDate ()+" "+transactionObject.getProductBreakdown ());
    }
}
