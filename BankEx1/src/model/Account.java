package model;

public class Account {
	private int number;
	private String holder;
	private double balance;

	public Account(int number, String holder, double balance) throws Exception {
		this.number = number;
		this.holder = holder;
		deposit(balance);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public void deposit(double value) throws Exception {
		if (value < 0) {
			throw new Exception("It is not possible to deposit negative values");
		}
		this.balance += value;
	}

	public void withdraw(double value) throws Exception {
		if (balance - value < 0) {
			throw new Exception("Balance not enough");
		}
		this.balance -= value + 5;

	}

	@Override
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", balance: $" + String.format("%.2f", balance);
	}
}
