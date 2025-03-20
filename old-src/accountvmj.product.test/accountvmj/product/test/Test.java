package accountvmj.product.test;

import accountvmj.account.AccountFactory;
import accountvmj.account.core.Account;

public class Test {
	private static Account account;

	public static void main(String[] args) { 
		account = 
		AccountFactory.createAccount("accountvmj.account.checkwithfees.AccountImpl", 
		AccountFactory.createAccount("accountvmj.account.withdrawwithfees.AccountImpl",
		AccountFactory.createAccount("accountvmj.account.depositwithfees.AccountImpl",
		AccountFactory.createAccount("accountvmj.account.core.AccountImpl",
				"Test account", "test id", 11314.0))));
		
		
        account.checkBalance();
        account.withdrawBalance(11200.0);
        account.depositBalance(14000.0);
        account.withdrawBalance(14000.0);
        
    }
}
