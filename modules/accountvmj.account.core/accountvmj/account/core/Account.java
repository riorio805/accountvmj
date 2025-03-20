package accountvmj.account.core;

public interface Account {
	String getName();
	void setName(String name);

	String getAccountId();
	void setAccountId(String accountId);

	Double getBalance();
	void setBalance(Double balance);

	void checkBalance();
	void depositBalance(Double incBalance);
	void withdrawBalance(Double reqBalance);
}
