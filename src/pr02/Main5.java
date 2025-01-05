package pr02;

class BankAccount {
	private String owner;
	private double balance;
	
	public BankAccount(String owner, double initialBalance) {
		this.owner = owner;
		this.balance = initialBalance;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println(amount + "deposited. New blacne" + balance);
		} else {
			System.out.println("Invalid deposit amount");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println(amount + "Withdrawn. New Balance" + balance);
		} else {
			System.out.println("Invalid withdraw amount or insufficient funds.");
		}
	}
}


public class Main5 {
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount("John", 1000.0);
		System.out.println("Account Owner : " + account.getOwner());
		account.deposit(500);
		account.withdraw(300);
		account.withdraw(2000);

	}
}