package accountvmj.account.core;

public abstract class AccountComponent implements Account {
	public String name;
	public String accountId;
	public Double balance;

	protected AccountComponent() {}
	
	protected AccountComponent(String name, String accountId, Double balance) {
		this.name = name;
		this.accountId = accountId;
		this.balance = balance;
	}

	public String getName() {return this.name;}
	public String getAccountId() {return this.accountId;}
	public Double getBalance() {return this.balance;}

	public void setName(String name) {this.name = name;}
	public void setAccountId(String accountId) {this.accountId = accountId;}
	public void setBalance(Double balance) {this.balance = balance;}

	public abstract void checkBalance() ;
	public abstract void depositBalance(Double incBalance);
	public abstract void withdrawBalance(Double reqBalance);
}