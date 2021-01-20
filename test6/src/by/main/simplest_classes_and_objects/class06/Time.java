package by.main.simplest_classes_and_objects.class06;

/*6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.*/

public class Time {
	private int seconds;
	private int minutes;
	private int hours;
	
	
	public Time(){
		
	}
	
	public Time(int hours, int minutes,int seconds) {
		if(hours<=24 && hours>=0) {
			this.hours = hours;
		}
		else {
			this.hours=0;
		}
		
		
		if(minutes<=60 && minutes>=0) {
			this.minutes = minutes;
		}
		else {
			this.minutes=0;
		}
		
		
		if(seconds<=60 && seconds>=0) {
			this.seconds = seconds;
		}
		else {
			this.seconds=0;
		};

	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public void setMinutes(int minutes) {
			this.minutes = minutes;
	}
	
	public int getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
			this.hours = hours;
	}

	@Override
	public String toString() {
		return "hours=" + hours+  ", minutes=" + minutes + ", seconds=" + seconds ;
	}
	
	
	
}
