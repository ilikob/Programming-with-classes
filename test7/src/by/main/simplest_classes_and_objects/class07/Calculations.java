package by.main.simplest_classes_and_objects.class07;

public class Calculations {

	public double square(Triangle a, Triangle b, Triangle c) {
		double square;
		Side ab=new Side(a,b);
		Side ac=new Side(a,c);
		Side bc=new Side(b,c);
		Perimeter p=new Perimeter(a, b, c);
		
		square=Math.sqrt((p.getPerimeter()/2)*((p.getPerimeter()/2)-ab.getSide()))*((p.getPerimeter()/2)-ac.getSide())*((p.getPerimeter()/2)-bc.getSide());
		return square;
	}
	
	
	
	public double middleSideABX(Triangle a, Triangle b) {
		double x;
		x=(a.getX()+b.getX())/2;
		
		return x;
	}
	
	
	public double middleSideABY(Triangle a, Triangle b) {
		double y;
		y=(a.getY()+b.getY())/2;
		return y;
	}
	
	
	public double medianIntersectionPointX(Triangle a, Triangle b) {
		double x;
		x=(a.getX()+2* middleSideABX(a,b))/(3);
		
		return x;
	}
	
	
	public double medianIntersectionPointY(Triangle a, Triangle b) {
		double y;
		y=(a.getY()+2* middleSideABY(a,b))/(3);
		
		return y;
	}
		
}
