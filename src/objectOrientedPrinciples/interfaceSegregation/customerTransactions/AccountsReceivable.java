package objectOrientedPrinciples.interfaceSegregation.customerTransactions;

public class AccountsReceivable {

    private Accounting transactionObject;

    public AccountsReceivable( Accounting aTransaction ) {
        this.transactionObject = aTransaction;
    }

    public void postPayments() {
        transactionObject.chargeCustomer ();
    }

    public void sendInvoice() {
        transactionObject.prepareInvoice ();
    }
}
