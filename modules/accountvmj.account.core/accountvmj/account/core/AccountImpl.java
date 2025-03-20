package accountvmj.account.core;

public class AccountImpl extends AccountComponent {
	public AccountImpl(String name, String accountId, Double balance) {
		super(name, accountId, balance);
	}

	public void checkBalance() {
		System.out.println("Your balance is: " + this.balance);
	}

	public void depositBalance(Double incBalance) {
		this.balance += incBalance;
		System.out.println("Successfully deposited balance: " + incBalance);
	}

	public void withdrawBalance(Double reqBalance) {
		if (this.balance >= reqBalance) {
			this.balance -= reqBalance;
			System.out.println("Successfully withdrawn balance: " + reqBalance);
		}
		else {
			System.out.println("Your balance is not enough to perform this operation");
		}
	}
}