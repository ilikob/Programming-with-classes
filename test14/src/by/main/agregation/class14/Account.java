package by.main.agregation.class14;

public class Account {
	private int accountNumber;
	private int accountBalance;
	private Client clientName;
	private boolean isBloked;
	

	
	public Account(int accountNumber, int accountBalance, Client clientName, boolean isBloked) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.clientName = clientName;
		this.isBloked = isBloked;
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public int getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}


	public Client getClientName() {
		return clientName;
	}


	public void setClientName(Client clientName) {
		this.clientName = clientName;
	}


	public boolean isBloked() {
		return isBloked;
	}


	public void setBloked(boolean isBloked) {
		this.isBloked = isBloked;
	}


	@Override
	public String toString() {
		return "accountNumber= " + accountNumber + ", accountBalance=" + accountBalance + ", clientName= " + clientName;
	}
	

	
	
	
}
