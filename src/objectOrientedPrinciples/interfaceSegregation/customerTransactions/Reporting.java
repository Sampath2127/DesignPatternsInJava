package objectOrientedPrinciples.interfaceSegregation.customerTransactions;

import java.util.Date;

public interface Reporting {
    String getName();

    Date getDate();

    String getProductBreakdown();
}
