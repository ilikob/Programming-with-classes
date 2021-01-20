package by.main.simplest_classes_and_objects.class04;


/*. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.*/


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Train> trainList= new ArrayList<Train>();
		trainList.add(new Train("Брест", 211, 2200));
		trainList.add(new Train("Брест", 322, 2100));
		trainList.add(new Train("Москва", 113, 1300));
		trainList.add(new Train("Минск", 214, 1620));
		trainList.add(new Train("Минск", 411, 1120));
		
		
		System.out.println("Поезда:");
		for(Train x: trainList) {
			System.out.println(x);
		}
		
		
		System.out.println();
		System.out.println("Сортировка по номеру поезда:");
		TrainLogic t =new TrainLogic();
		for(Train x:t.sortByTrainNumber(trainList) ) {
			System.out.println(x);
		}
		

		
		System.out.println();
		System.out.println("Поиск номеру поезда:");
		int trainNumber=OutputTrainInfoByNumber.read();
		System.out.println(OutputTrainInfoByNumber.trainInfo(trainList, trainNumber));
	
		
		System.out.println();
		System.out.println("Сортировка по пункту назначения и времени:");
		for(Train x: t.sortByDepartureTime(trainList)) {
			System.out.println(x);
		}
		
		
	}
	

	
}
