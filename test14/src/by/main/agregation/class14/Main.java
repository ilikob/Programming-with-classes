package by.main.agregation.class14;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Client cherkesov =new Client("��������");
		Client moroz =new Client("�����");
		Client kasper =new Client("������");
		
		
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
		
		System.out.println("����� ������(��� ��������������� ������)= "+bank.totalBalance(accounts));
		System.out.println("������ ������ � ������������� ���������(��� ��������������� ������)= "+bank.positiveBalance(accounts));
		System.out.println("������ ������ � ������������� ���������(��� ��������������� ������)= "+bank.negativeBalance(accounts));
		
		System.out.println();
		System.out.println("����� �� �����:");
		System.out.println("������� ���:");
		for(Account x:bank.searchByName(accounts)) {
				System.out.println(x);
		
		}
		
		System.out.println();
		System.out.println("����� �� ������ �����:");
		System.out.println("������� �����:");
		for(Account x:bank.searchByAccountNumber(accounts)) {
				System.out.println(x);
		
		}
		
		System.out.println();
		System.out.println("���������� �� �������:");
		for(Account x:bank.sortByBalance(accounts)) {
			if(x.isBloked()) {
				System.out.println(x);
			}
		}
		
		
		System.out.println();
		System.out.println("������������� � ���������� ������");
		bank.unblockAccount(accounts.get(3));
		bank.blockAccount(accounts.get(4));
		
		for(Account x:accounts) {
			if(x.isBloked()) {
				System.out.println(x);
			}
		}
		
	}

}
