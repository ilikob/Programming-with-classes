package by.main.simplest_classes_and_objects.class06;


/*6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.*/


import java.util.Scanner;

public class Main {
	
	static Scanner scanner=new Scanner(System.in);
	
	
	public static void main(String[] args) {

		
		
		
		System.out.println("Введите часы");
		int hours=read(scanner);
		
		System.out.println("Введите минуты");
		int minutes=read(scanner);
			
		System.out.println("Введите секунды");
		int seconds=read(scanner);
		
		
		Time time=new Time(hours, minutes, seconds);
		
		System.out.println(time.toString());
		
		hoursChange(time, seconds);
		minutesChange(time, seconds);
		secondsChange(time, seconds);

		System.out.println("Изменённое время "+time.toString());

	}

	
	public static int read(Scanner scanner) {
		return scanner.nextInt();
		
	}
	
	public static void secondsChange(Time time, int seconds) {
		System.out.println("Введите на сколько хотите изменить секунды");
		int secondschange=read(scanner);
		if(seconds + secondschange<=60 && seconds + secondschange>=0) {
			time.setSeconds(seconds + secondschange);
		}
		
		
		else {
			time.setSeconds(0);
		}
	}
		
		
		public static void minutesChange(Time time, int minutes) {
			System.out.println("Введите на сколько хотите изменить минуты");
			int minuteschange=read(scanner);
			if(minutes + minuteschange<=60 && minutes + minuteschange>=0) {
				time.setMinutes(minutes + minuteschange);
			}
			
			
			else {
				time.setMinutes(0);
			}
	}
		
		public static void hoursChange(Time time, int hours) {
			System.out.println("Введите на сколько хотите изменить часы");
			int hourschange=read(scanner);
			if(hours + hourschange<=24 && hours + hourschange>=0) {
				time.setHours(hours + hourschange);
			}
			
			
			else {
				time.setHours(0);
			}
	}
}
