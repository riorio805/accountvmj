package accountvmj.account.withdrawwithfees;

import accountvmj.account.accountfees.DAccountFees;
import accountvmj.account.core.AccountComponent;

public class AccountImpl extends DAccountFees {
	public AccountImpl(AccountComponent record) {
		super(record);
	}

	@Override
	public void withdrawBalance(Double reqBalance) {
		if (record.getBalance() <= (reqBalance + fees)) {
			System.out.println("Your account does not have enough balance");
		} else {
			record.withdrawBalance(reqBalance);
			record.setBalance(record.getBalance() - fees);
		}
	}
}