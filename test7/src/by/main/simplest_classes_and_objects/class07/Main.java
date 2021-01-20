package by.main.simplest_classes_and_objects.class07;

import java.util.Scanner;

/*������� �����, �������������� �����������. ������������� ������ ��� �������� ��������, ����������
�������, ��������� � ����� ����������� ������.
*/


public class Main {

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("������� ���������� ������� �:");
		Triangle a =new Triangle(read(),read());
		
		System.out.println("������� ���������� ������� b:");
		Triangle b =new Triangle(read(),read());
		
		System.out.println("������� ���������� ������� c:");
		Triangle c =new Triangle(read(),read());
		
		
		Perimeter perimeter= new Perimeter(a,b,c);
		System.out.println(perimeter);
		

		Calculations calculation =new Calculations();

		System.out.println("������� = "+calculation.square(a, b, c));
		
		System.out.print( "���������� x ���������������� ������= "+ calculation.medianIntersectionPointX(a,b)+" ");
		System.out.println("���������� y ���������������� ������= "+calculation.medianIntersectionPointY(a,b));

		
	}

	
	
	
	public static int read() {
		while(!scanner.hasNextInt()) {
			scanner.next();
			
		}
		return scanner.nextInt();
		
	}
}
