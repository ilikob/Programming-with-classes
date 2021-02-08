package by.main.agregation.class14;

import java.util.ArrayList;

public class BankOperations {
	
	public BankOperations() {
		
	}
	
	public void blockAccount(Account account) {
		account.setBloked(false);
	}
	
	public void unblockAccount(Account account) {
		account.setBloked(true);
	}
	
	public int totalBalance(ArrayList<Account> accounts) {
		int totalBalance=0;
		for(int i=0;i<accounts.size();i++) {
			if(accounts.get(i).isBloked()) {
				totalBalance+=accounts.get(i).getAccountBalance();
			}
		}
		
		return totalBalance;
	}
	
	public int   positiveBalance(ArrayList<Account> accounts) {
		int positiveBalance=0;
		for(int i=0;i<accounts.size();i++) {
			if(accounts.get(i).getAccountBalance()>0 && accounts.get(i).isBloked()) {
				positiveBalance+=accounts.get(i).getAccountBalance();
			}
		}
		
		return positiveBalance;
	}
	
	public int negativeBalance(ArrayList<Account> accounts) {
		int negativeBalance=0;
		for(int i=0;i<accounts.size();i++) {
			if(accounts.get(i).getAccountBalance()<0 && accounts.get(i).isBloked()) {
				negativeBalance+=accounts.get(i).getAccountBalance();
			}
		}
		
		return negativeBalance;
	}
	
	public ArrayList<Account> searchByName(ArrayList<Account> accounts){
		ArrayList<Account> sortAccounts =new ArrayList<>();
		String name =View.readString();
		
		for(int i=0;i<accounts.size();i++) {
			if(accounts.get(i).isBloked() && accounts.get(i).getClientName().getName().compareTo(name)==0) {
				sortAccounts.add(accounts.get(i));
			}
		}
		
		return sortAccounts;
	}
	
	public ArrayList<Account> searchByAccountNumber(ArrayList<Account> accounts){
		ArrayList<Account> sortAccounts =new ArrayList<>();
		int number=View.readInt();
		
		for(int i=0;i<accounts.size();i++) {
			if(accounts.get(i).isBloked() && accounts.get(i).getAccountNumber()==number) {
				sortAccounts.add(accounts.get(i));
			}
		}
		
		return sortAccounts;
	}
	
	public ArrayList<Account> sortByBalance(ArrayList<Account> accounts){
		ArrayList<Account> sortAccounts =new ArrayList<>(accounts);
		boolean check=false;
		int min=0;
		while(!check) {
			check=true;
			for(int i=0;i<sortAccounts.size()-1;i++) {
				if(sortAccounts.get(i).getAccountBalance()<sortAccounts.get(i+1).getAccountBalance()) {
					check=false;
					min=sortAccounts.get(i).getAccountBalance();
					sortAccounts.get(i).setAccountBalance(sortAccounts.get(i+1).getAccountBalance());
					sortAccounts.get(i+1).setAccountBalance(min);
					
				}
			}
		}
		return sortAccounts;
	}
	

	
	
}
