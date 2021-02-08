package by.main.agregation.class12;

import java.util.ArrayList;
import java.util.Arrays;

//Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля. 


public class Car {
	private String modelName;
	private boolean isFuel;
	private Engine engine;
	private ArrayList<Wheel> wheel;
	
	public Car() {
		
	}

	
	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}




	public boolean isFuel() {
		return isFuel;
	}


	public void setFuel(boolean isFuel) {
		this.isFuel = isFuel;
	}

	public ArrayList<Wheel> getWheel() {
		return wheel;
	}


	 public void setWheels(Wheel w1, Wheel w2, Wheel w3, Wheel w4) {
	        this.wheel = new ArrayList<>(Arrays.asList(w1, w2, w3, w4));
	    }


	public Car(String modelName, boolean isFuel) {
		this.modelName = modelName;
		this.isFuel =isFuel;
		this.wheel = new ArrayList<>(4);
	}
	
	
	public void wheelChange() {
		for(int i=0;i<wheel.size();i++) {
			if(!wheel.get(i).isGood()) {
				System.out.println("Замена колеса под номером "+i);
				getWheel().set(i, new Wheel(true));
			}
		}
		
	}
	
	public void refuel() {
		if(!isFuel) {
			System.out.println("Машина заправлена");
			setFuel(true);
		}
		
		else {
			System.out.println("Заправка не нужна");
		}
	}
	
	public void go() {
		int wheelCounter=0;
		boolean fuel=false;
		boolean isEngine=false;
		
		for(int i=0;i<wheel.size();i++) {
			if(wheel.get(i).isGood()) {
				wheelCounter++;
			}
			else{
				System.out.println("Колесо под ноиером "+i+"неисправно");
			}
		}
		
		
		if(engine!=null) {
			isEngine=true;
		}
		else {
			System.out.println("Нет двигателя");
		}
		
		
		if(isFuel) {
			fuel=true;
		}
		else {
			System.out.println("Машину необходимо заправить");
		}
		
		if(fuel && isEngine && wheelCounter==4) {
			System.out.println("Машина марки "+getModelName()+" готова к поездке");
		}

	}
}
