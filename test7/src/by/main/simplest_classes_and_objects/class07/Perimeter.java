package by.main.simplest_classes_and_objects.class07;

public class Perimeter {
	private double perimeter;
	
	public Perimeter(Triangle a, Triangle b, Triangle c) {
		Side ab=new Side(a,b);
		Side ac=new Side(a,c);
		Side bc=new Side(b,c);
		perimeter=ab.getSide()+ac.getSide()+bc.getSide();
	}


	
	public double getPerimeter() {
		return perimeter;
	}



	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}



	@Override
	public String toString() {
		return "perimeter=" + perimeter;
	}


}
