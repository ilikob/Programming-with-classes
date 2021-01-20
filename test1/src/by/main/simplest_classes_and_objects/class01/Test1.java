package by.main.simplest_classes_and_objects.class01;


/* Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.
*/

public class Test1 {
	private int x;
	private int y;
	
	public void print() {
		System.out.print(x+y);
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public int getSum() {
		return x+y;
	}
	
	public int getMax() {
		return x>y ?x:y;
	}
	
	
}
