package accountvmj.account.accountfees;

import accountvmj.account.core.AccountComponent;
import accountvmj.account.core.AccountDecorator;

public abstract class DAccountFees extends AccountDecorator {
    // delta adds attribute
    public Double fees = 100.0;

    protected DAccountFees(AccountComponent record) {super(record);}
}
