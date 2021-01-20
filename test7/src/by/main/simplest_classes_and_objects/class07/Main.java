package by.main.simplest_classes_and_objects.class07;

import java.util.Scanner;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.
*/


public class Main {

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Введите координаты вершины а:");
		Triangle a =new Triangle(read(),read());
		
		System.out.println("Введите координаты вершины b:");
		Triangle b =new Triangle(read(),read());
		
		System.out.println("Введите координаты вершины c:");
		Triangle c =new Triangle(read(),read());
		
		
		Perimeter perimeter= new Perimeter(a,b,c);
		System.out.println(perimeter);
		

		Calculations calculation =new Calculations();

		System.out.println("Площадь = "+calculation.square(a, b, c));
		
		System.out.print( "Координата x точеипересечения медиан= "+ calculation.medianIntersectionPointX(a,b)+" ");
		System.out.println("Координата y точеипересечения медиан= "+calculation.medianIntersectionPointY(a,b));

		
	}

	
	
	
	public static int read() {
		while(!scanner.hasNextInt()) {
			scanner.next();
			
		}
		return scanner.nextInt();
		
	}
}
