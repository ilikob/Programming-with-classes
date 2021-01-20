package by.main.simplest_classes_and_objects.class05;


/* ќпишите класс, реализующий дес€тичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. ѕредусмотрите инициализацию счетчика значени€ми по умолчанию и
произвольными значени€ми. —четчик имеет методы увеличени€ и уменьшени€ состо€ни€, и метод
позвол€ющее получить его текущее состо€ние. Ќаписать код, демонстрирующий все возможности класса.
*/


public class Counter {

	private int max;
	private int min;
	private int tek;
	
	
	public Counter() {
		min=0;
		max=0;
		tek=0;
	}
	
	public Counter( int min, int max, int tek) {
		this.min=min;
		this.max=max;
		this.tek=tek;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getTek() {
		return tek;
	}

	public void setTek(int tek) {
		this.tek = tek;
	}

	@Override
	public String toString() {
		return  "min=" + min + ", max=" + max +", tek=" + tek;
	}
	
	
	
}
