package by.main.agregation.class14;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Client cherkesov =new Client("Черкесов");
		Client moroz =new Client("Мороз");
		Client kasper =new Client("Каспер");
		
		
		ArrayList<Account> accounts =new ArrayList<>();
		accounts.add(new Account(101, 100, cherkesov,true));
		accounts.add(new Account(102, -50, cherkesov, true));
		accounts.add(new Account(203, 0, moroz,false));
		accounts.add(new Account(3004, 150, moroz,true));
		accounts.add(new Account(345, -300, moroz,true));
		accounts.add(new Account(306, 1000, kasper,true));

		
		for(Account x:accounts) {
			if(x.isBloked()) {
				System.out.println(x);
			}
		}
		BankOperations bank =new BankOperations();
		
		System.out.println("Общий баланс(без заблокированных счетов)= "+bank.totalBalance(accounts));
		System.out.println("Баланс счетов с положительным значением(без заблокированных счетов)= "+bank.positiveBalance(accounts));
		System.out.println("Баланс счетов с отрицательным значением(без заблокированных счетов)= "+bank.negativeBalance(accounts));
		
		System.out.println();
		System.out.println("Поиск по имени:");
		System.out.println("Введите имя:");
		for(Account x:bank.searchByName(accounts)) {
				System.out.println(x);
		
		}
		
		System.out.println();
		System.out.println("Поиск по номеру счета:");
		System.out.println("Введите номер:");
		for(Account x:bank.searchByAccountNumber(accounts)) {
				System.out.println(x);
		
		}
		
		System.out.println();
		System.out.println("Сортировка по балансу:");
		for(Account x:bank.sortByBalance(accounts)) {
			if(x.isBloked()) {
				System.out.println(x);
			}
		}
		
		
		System.out.println();
		System.out.println("Разблокировка и блокировка счетов");
		bank.unblockAccount(accounts.get(3));
		bank.blockAccount(accounts.get(4));
		
		for(Account x:accounts) {
			if(x.isBloked()) {
				System.out.println(x);
			}
		}
		
	}

}
