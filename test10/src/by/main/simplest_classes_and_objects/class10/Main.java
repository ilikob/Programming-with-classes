package by.main.simplest_classes_and_objects.class10;


/*Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*/



import java.util.ArrayList;


public class Main {
	public static void main(String args[]) {
		ArrayList<Airline> planeList = new ArrayList<Airline>();
		
		planeList.add(new Airline( "Москва", 1111, "typePlane1", 1400, "Понедельник"));
		planeList.add(new Airline( "Минск", 5155, "typePlane2", 2000, "Вторник"));
		planeList.add(new Airline( "Москва", 7566, "typePlane1", 1100, "Понедельник"));
		planeList.add(new Airline( "Берлин", 4564, "typePlane3", 1600, "Вторник"));
		planeList.add(new Airline( "Париж", 1411, "typePlane8", 1800, "Пятница"));
	
	
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
