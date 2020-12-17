package objectOrientedPrinciples.interfaceSegregation.customerTransactions;

import java.util.Date;

public class CustomerTransaction implements Accounting, Reporting {
    @Override
    public String getName() {
        return "name";
    }

    @Override
    public Date getDate() {
        return new Date ();
    }

    @Override
    public String getProductBreakdown() {
        return "List of products for reporting..!";
    }

    @Override
    public void prepareInvoice(){
        System.out.println ("Preparing Invoice");
    }

    @Override
    public void chargeCustomer(){
        System.out.println ("Customer charged");
    }


}
