package accountvmj.account.core;


public abstract class AccountDecorator extends AccountComponent {
	public AccountComponent record;
	
	public AccountDecorator (AccountComponent record) {
		this.record = record;
	}

	public String getName() {return record.getName();}
	public String getAccountId() {return record.getAccountId();}
	public Double getBalance() {return record.getBalance();}

	public void setName(String name) {record.setName(name);}
	public void setAccountId(String accountId) {record.setAccountId(accountId);}
	public void setBalance(Double balance) {record.setBalance(balance);}

	public void checkBalance() {
		record.checkBalance();
	}

	public void depositBalance(Double incBalance) {
		record.depositBalance(incBalance);
	}

	public void withdrawBalance(Double reqBalance) {
		record.withdrawBalance(reqBalance);
	}
}