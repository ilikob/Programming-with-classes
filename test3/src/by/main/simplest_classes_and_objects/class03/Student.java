package by.main.simplest_classes_and_objects.class03;

import java.util.Arrays;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.*/


public class Student {
	private String name;
	private int groupNumber;
	private int rating[]= new int[5];
	
	
	public Student() {
	}
	
	
	public Student(String name, int groupNumber, int []rating ) {
		this.name=name;
		this.groupNumber=groupNumber;
		this.rating=rating;
	}
	
	
	public boolean isGoodRating() {
		for(int i=0;i<rating.length;i++) {
			if(rating[i]>8) {
				return true;
			}
		}
		
		
		return false;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getGroupNumber() {
		return groupNumber;
	}
	
	public void setGroupNumber(int groupNumber) {
		this.groupNumber=groupNumber;
	}
	
	public int[] getRating() {
		return rating;
	}
	
	public void setRating(int [] rating) {
		this.rating=rating;
	}
	
	@Override
	
	public String toString() {
		return "Student name "+name+" groupNumber "+groupNumber+ " rating "+Arrays.toString(rating);
	}
	
}
