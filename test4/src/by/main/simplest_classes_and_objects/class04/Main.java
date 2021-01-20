package by.main.simplest_classes_and_objects.class04;


/*. �������� ����� Train, ���������� ����: �������� ������ ����������, ����� ������, ����� �����������.
�������� ������ � ������ �� ���� ��������� ���� Train, �������� ����������� ���������� ��������� ������� ��
������� �������. �������� ����������� ������ ���������� � ������, ����� �������� ������ �������������.
�������� ����������� ���������� ������ �� ������ ����������, ������ ������ � ����������� ��������
���������� ������ ���� ����������� �� ������� �����������.*/


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Train> trainList= new ArrayList<Train>();
		trainList.add(new Train("�����", 211, 2200));
		trainList.add(new Train("�����", 322, 2100));
		trainList.add(new Train("������", 113, 1300));
		trainList.add(new Train("�����", 214, 1620));
		trainList.add(new Train("�����", 411, 1120));
		
		
		System.out.println("������:");
		for(Train x: trainList) {
			System.out.println(x);
		}
		
		
		System.out.println();
		System.out.println("���������� �� ������ ������:");
		TrainLogic t =new TrainLogic();
		for(Train x:t.sortByTrainNumber(trainList) ) {
			System.out.println(x);
		}
		

		
		System.out.println();
		System.out.println("����� ������ ������:");
		int trainNumber=OutputTrainInfoByNumber.read();
		System.out.println(OutputTrainInfoByNumber.trainInfo(trainList, trainNumber));
	
		
		System.out.println();
		System.out.println("���������� �� ������ ���������� � �������:");
		for(Train x: t.sortByDepartureTime(trainList)) {
			System.out.println(x);
		}
		
		
	}
	

	
}
