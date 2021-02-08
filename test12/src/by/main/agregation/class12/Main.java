package by.main.agregation.class12;

public class Main {

	public static void main(String[] args) {
		Engine engine =new Engine(130);
		
		boolean[] isGoodWheel= {false, false, false, false};
		for(int i=0;i<4;i++) {
			if(Math.random()<0.5) {
				isGoodWheel[i]=true;
			}
		}
		Wheel w1=new Wheel(isGoodWheel[0]);
		Wheel w2=new Wheel(isGoodWheel[1]);
		Wheel w3=new Wheel(isGoodWheel[2]);
		Wheel w4=new Wheel(isGoodWheel[3]);
		
		boolean isFuel=false;
		if(Math.random()<0.5) {
			isFuel=true;
		}
		Car car=new Car("Renault", isFuel);
		car.setEngine(engine);
		car.setWheels(w1, w2, w3, w4);
		
		car.refuel();
		car.wheelChange();
		car.go();
	}

}
