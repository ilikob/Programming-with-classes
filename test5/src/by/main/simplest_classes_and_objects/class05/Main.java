package by.main.simplest_classes_and_objects.class05;

/* ќпишите класс, реализующий дес€тичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. ѕредусмотрите инициализацию счетчика значени€ми по умолчанию и
произвольными значени€ми. —четчик имеет методы увеличени€ и уменьшени€ состо€ни€, и метод
позвол€ющее получить его текущее состо€ние. Ќаписать код, демонстрирующий все возможности класса.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {



		Counter counter=new Counter();
		
		
		System.out.println("«начени€ по умолчанию: "+counter.toString());
		
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
		System.out.println("“екущее значение="+counter1.getTek());
	}

}
