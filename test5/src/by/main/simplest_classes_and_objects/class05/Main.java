package by.main.simplest_classes_and_objects.class05;

/* ������� �����, ����������� ���������� �������, ������� ����� ����������� ��� ��������� ���� ��������
�� ������� � �������� ���������. ������������� ������������� �������� ���������� �� ��������� �
������������� ����������. ������� ����� ������ ���������� � ���������� ���������, � �����
����������� �������� ��� ������� ���������. �������� ���, ��������������� ��� ����������� ������.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {



		Counter counter=new Counter();
		
		
		System.out.println("�������� �� ���������: "+counter.toString());
		
		Counter counter1=new Counter(10,20,15);
		System.out.println(counter1.toString());
		
		low(counter1);
		knowPresentValue(counter1);
		increace(counter1);
		knowPresentValue(counter1);
		

	}
	
	public static void  low(Counter counter1) {
		counter1.setTek(counter1.getTek()-1);
		if(counter1.getTek()<counter1.getMin()) {
			counter1.setTek(counter1.getMax());
		}
	}
	
	public static void  increace(Counter counter1) {
		counter1.setTek(counter1.getTek()+1);
		if(counter1.getTek()>counter1.getMax()) {
			counter1.setTek(counter1.getMin());
		}
	}
	
	
	public static void knowPresentValue(Counter counter1) {
		System.out.println("������� ��������="+counter1.getTek());
	}

}
