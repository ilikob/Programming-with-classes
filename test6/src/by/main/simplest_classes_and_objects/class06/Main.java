package by.main.simplest_classes_and_objects.class06;


/*6. ��������� �������� ������ ��� ������������� �������. ������������ ����������� ��������� ������� �
��������� ��� ��������� ����� (���, ������, �������) � ��������� ������������ �������� ��������. � ������
������������ �������� ����� ���� ��������������� � �������� 0. ������� ������ ��������� ������� ��
�������� ���������� �����, ����� � ������.*/


import java.util.Scanner;

public class Main {
	
	static Scanner scanner=new Scanner(System.in);
	
	
	public static void main(String[] args) {

		
		
		
		System.out.println("������� ����");
		int hours=read(scanner);
		
		System.out.println("������� ������");
		int minutes=read(scanner);
			
		System.out.println("������� �������");
		int seconds=read(scanner);
		
		
		Time time=new Time(hours, minutes, seconds);
		
		System.out.println(time.toString());
		
		hoursChange(time, seconds);
		minutesChange(time, seconds);
		secondsChange(time, seconds);

		System.out.println("��������� ����� "+time.toString());

	}

	
	public static int read(Scanner scanner) {
		return scanner.nextInt();
		
	}
	
	public static void secondsChange(Time time, int seconds) {
		System.out.println("������� �� ������� ������ �������� �������");
		int secondschange=read(scanner);
		if(seconds + secondschange<=60 && seconds + secondschange>=0) {
			time.setSeconds(seconds + secondschange);
		}
		
		
		else {
			time.setSeconds(0);
		}
	}
		
		
		public static void minutesChange(Time time, int minutes) {
			System.out.println("������� �� ������� ������ �������� ������");
			int minuteschange=read(scanner);
			if(minutes + minuteschange<=60 && minutes + minuteschange>=0) {
				time.setMinutes(minutes + minuteschange);
			}
			
			
			else {
				time.setMinutes(0);
			}
	}
		
		public static void hoursChange(Time time, int hours) {
			System.out.println("������� �� ������� ������ �������� ����");
			int hourschange=read(scanner);
			if(hours + hourschange<=24 && hours + hourschange>=0) {
				time.setHours(hours + hourschange);
			}
			
			
			else {
				time.setHours(0);
			}
	}
}
