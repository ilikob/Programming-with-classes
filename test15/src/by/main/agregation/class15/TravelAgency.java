package by.main.agregation.class15;

import java.util.ArrayList;
import java.util.Scanner;




public class TravelAgency {
	public TravelAgency() {
		
	}
	public ArrayList<TravelVoucher> searchByName(ArrayList<TravelVoucher> tours){
		ArrayList<TravelVoucher> sortTours =new ArrayList<>();

		String name=View.readString();
		
		for(int i=0;i<tours.size();i++) {
			if(tours.get(i).getClient().getName().compareTo(name)==0) {
				sortTours .add(tours.get(i));
			}
		}
		
		return sortTours;
	}
	
	
	public ArrayList<TravelVoucher> sortByDays(ArrayList<TravelVoucher> tours){
		ArrayList<TravelVoucher> sortTours =new ArrayList<>(tours);
		boolean check=false;
		int min=0;
		while(!check) {
			check=true;
			for(int i=0;i<sortTours.size()-1;i++) {
				if(sortTours.get(i).getNumberOfDays()<sortTours.get(i+1).getNumberOfDays()) {
					check=false;
					min=sortTours.get(i).getNumberOfDays();
					sortTours.get(i).setNumberOfDays(sortTours.get(i+1).getNumberOfDays());
					sortTours.get(i+1).setNumberOfDays(min);
					
				}
			}
		}
		return sortTours;
	}
	
}
