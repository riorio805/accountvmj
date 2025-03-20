package accountvmj.account.depositwithfees;

import accountvmj.account.accountfees.DAccountFees;
import accountvmj.account.core.AccountComponent;

public class AccountImpl extends DAccountFees {
	public AccountImpl(AccountComponent record) {
		super(record);
	}

	@Override
	public void depositBalance(Double incBalance) {
		if (incBalance < fees) {
			System.out.println("You need to deposit more than the fees.");
		} else {
			record.depositBalance(incBalance);
			record.setBalance(record.getBalance() - fees);
		}
	}
}