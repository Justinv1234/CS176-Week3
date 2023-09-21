public class BankAccount {
	private String name;
	private double balance;
	
	public BankAccount() {
		name = "Your Name";
		balance = 0;
	}
	
	public BankAccount(double balance) {
		name = "Your Name";
		balance = this.balance;
	}
	
	public BankAccount(double balance, String name) {
		name = this.name;
		balance = this.balance;
	}
	
	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
}
