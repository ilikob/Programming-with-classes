package by.main.simplest_classes_and_objects.class10;


/*Airline: ����� ����������, ����� �����, ��� ��������, ����� ������, ��� ������.
����� � �������:
a) ������ ������ ��� ��������� ������ ����������;
b) ������ ������ ��� ��������� ��� ������;
c) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.
*/



import java.util.ArrayList;


public class Main {
	public static void main(String args[]) {
		ArrayList<Airline> planeList = new ArrayList<Airline>();
		
		planeList.add(new Airline( "������", 1111, "typePlane1", 1400, "�����������"));
		planeList.add(new Airline( "�����", 5155, "typePlane2", 2000, "�������"));
		planeList.add(new Airline( "������", 7566, "typePlane1", 1100, "�����������"));
		planeList.add(new Airline( "������", 4564, "typePlane3", 1600, "�������"));
		planeList.add(new Airline( "�����", 1411, "typePlane8", 1800, "�������"));
	
	
		Logic destination =new Logic();
		for(Airline x:destination.sortByDestination(planeList)) {
			System.out.println(x);
		}
	
		System.out.println();
		
		Logic dayOfWeek =new Logic();
		for(Airline x:dayOfWeek.sortByDayOfWeek(planeList)) {
			System.out.println(x);
		}
		
		
		System.out.println();
		
		Logic dayOfWeekAndTime =new Logic();
		for(Airline x: dayOfWeekAndTime.sortByDayOfWeekAndTime(planeList)){
			System.out.println(x);
		}
	}
	
	
}
