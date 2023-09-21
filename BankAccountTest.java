public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bank1 = new BankAccount();
		BankAccount bank2 = new BankAccount(1000);
		BankAccount bank3 = new BankAccount(2500, "Justin Veltri");
		
		System.out.println(bank1.getBalance());
		bank1.deposit(250);
		System.out.println(bank1.getBalance());
		bank1.withdraw(100);
		System.out.println(bank1.getBalance());
	}

}
