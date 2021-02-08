package by.main.agregation.class15;

import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		Client client1=new Client("Ը���");
		Client client2=new Client("����");
		Client client3=new Client("�����");
		
		ArrayList<TravelVoucher> tours= new ArrayList<>();
		tours.add(new TravelVoucher("Prague", TypeOfTour.EXCURSIONS, Transport.BUS, Food.NOFOOD, client1, 3) );
		tours.add(new TravelVoucher("Warsaw", TypeOfTour.SHOPPINT, Transport.TRAIN, Food.NOFOOD, client2, 1));
		tours.add(new TravelVoucher("Berlin", TypeOfTour.REST, Transport.TRAIN, Food.ONLYBREAKFAST, client3, 4));
		tours.add(new TravelVoucher("Paris", TypeOfTour.REST, Transport.PLANE, Food.ONLYDINNER, client1, 6));
		tours.add(new TravelVoucher("London", TypeOfTour.EXCURSIONS, Transport.PLANE, Food.ONLYBREAKFAST, client2, 7));
		tours.add(new TravelVoucher("Rome", TypeOfTour.REST, Transport.PLANE, Food.ALLINCLUSIVE, client3, 14));
		
		TravelAgency tour =new TravelAgency();
		
		System.out.println();
		System.out.println("����� �� ���� �������:");
		System.out.println("������� ���:");
		for(TravelVoucher x:tour.searchByName(tours)) {
			System.out.println(x);
		
		}
		
		System.out.println();
		System.out.println("���������� �� ���������� ����:");
		for(TravelVoucher x:tour.sortByDays(tours)) {
			System.out.println(x);
			
		}

	}
}
