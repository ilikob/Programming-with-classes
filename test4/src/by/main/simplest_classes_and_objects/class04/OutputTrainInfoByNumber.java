package by.main.simplest_classes_and_objects.class04;

import java.util.ArrayList;
import java.util.Scanner;

public class OutputTrainInfoByNumber {

	static Scanner scanner=new Scanner(System.in);
	
	public static int read() {
		System.out.println("Введите номер: ");
		while(!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Введите номер: ");
			
		}
		return scanner.nextInt();
		
	}
	
	public static String trainInfo(ArrayList<Train> trains,int number) {
		for(Train x: trains) {
			if(x.getTrainNumber()==number) {
				return "Пункт назначения: "+x.getDestination()+ ",  Время: "+x.getDepartureTime();
			}
		}
		return "Нет такого поезда";
	}
}
