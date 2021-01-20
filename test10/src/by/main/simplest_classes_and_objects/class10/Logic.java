package by.main.simplest_classes_and_objects.class10;

import java.util.ArrayList;

public class Logic {

	
	public Logic() {
		
	}
	
	public ArrayList <Airline> sortByDestination( ArrayList <Airline>planeList){
		ArrayList <Airline> suitPlaneList= new ArrayList <Airline>();
		System.out.println("������� ����� ����������");
		String destination=View.readString();
		
		for(int i=0; i<planeList.size();i++) {
			if(destination.compareTo(planeList.get(i).getDestination())==0){
				suitPlaneList.add(planeList.get(i));
			}
		
		}
		
		if(suitPlaneList.size()==0) {
			System.out.println("������ ������ ���������� �� ����������");
		}
		return suitPlaneList;
		
	}
	
	public ArrayList <Airline> sortByDayOfWeek(ArrayList <Airline>planeList){
		ArrayList <Airline> suitPlaneList= new ArrayList <Airline>();
		System.out.println("������� ���� ������");
		String dayOfWeek=View.readString();
		
		for(int i=0; i<planeList.size();i++) {
			if(dayOfWeek.compareTo(planeList.get(i).getDayOfWeek())==0){
				suitPlaneList.add(planeList.get(i));
			}
		
		}
		
		if(suitPlaneList.size()==0) {
			System.out.println("������� ���� ���� ������ ��� ");
		}
		
		return suitPlaneList;
	}
	
	
	public ArrayList <Airline> sortByDayOfWeekAndTime(ArrayList <Airline>planeList){
		ArrayList <Airline> suitPlaneList= new ArrayList <Airline>();
		
		System.out.println("������� ���� ������");
		String dayOfWeek=View.readString();
		
		System.out.println("������� �����");
		int flightTime=View.readInt();
		
		for(int i=0; i<planeList.size();i++) {
			if(dayOfWeek.compareTo(planeList.get(i).getDayOfWeek())==0 && flightTime<planeList.get(i).getDepartureTime()){
				suitPlaneList.add(planeList.get(i));
			}
		
		}
		
		if(suitPlaneList.size()==0) {
			System.out.println("������� ���� ���� ������ ��� ");
		}
		
		return suitPlaneList;
	}
}
