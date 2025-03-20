package accountvmj.account.checkwithfees;

import accountvmj.account.accountfees.DAccountFees;
import accountvmj.account.core.AccountComponent;

public class AccountImpl extends DAccountFees {
	public AccountImpl(AccountComponent record) {
		super(record);
	}

	// delta modify method
	@Override
	public void checkBalance() {
		if (record.getBalance() <= fees) {
			System.out.println("Your account does not have enough balance");
		} else {
			record.checkBalance();
			record.setBalance(record.getBalance() - fees);
		}
	}
}