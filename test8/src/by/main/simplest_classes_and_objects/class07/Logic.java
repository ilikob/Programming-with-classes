package by.main.simplest_classes_and_objects.class07;

import java.util.ArrayList;

public class Logic {

	
	public Logic() {
		
	}
	public ArrayList<Customer> sortByAlphabet(ArrayList<Customer> customer){
		boolean check=false;
		
	
		while(!check) {
			check=true;
			Customer change;
			
			for(int i=0; i<customer.size()-1;i++) {
				if(customer.get(i).getName().compareTo(customer.get(i+1).getName())>0){
					check=false;
					change=customer.get(i);
					customer.set(i, customer.get(i+1));
					customer.set(i+1, change);
					
				}
			}
		}
		return customer;
	}
	
	
	public ArrayList<Customer> sortByNumberCreditCard(ArrayList<Customer> customer){
		 ArrayList<Customer> suitableCustomer=new ArrayList<Customer> ();
		SetInterwalCreditCard creditCard =new SetInterwalCreditCard();
		System.out.println("Введите первое значение диапозона:");
		int creditCard1=creditCard.read();
		System.out.println("Введите второе значение диапозона:");
		int creditCard2=creditCard.read();
		for(int i=0; i<customer.size();i++) {
			if(customer.get(i).getNumberCreditCard()>creditCard1 &&customer.get(i).getNumberCreditCard()<creditCard2 ) {
				suitableCustomer.add(customer.get(i));
			}
		}
		
		return suitableCustomer;
	}
}
