package by.main.simplest_classes_and_objects.class07;

public class Side {
	private double side;
	
	public Side() {
		
	}
	
	public Side(Triangle a, Triangle b) {
		side=Math.sqrt(Math.pow(a.getX()-b.getX(), 2)+Math.pow(a.getY()-b.getY(), 2));
	}
	
	
	public void setSide(double side) {
		this.side=side;
	}
	
	public double getSide() {
		return side;
	}
	@Override
	
	public String toString() {
		return ""+side;
	}
}
