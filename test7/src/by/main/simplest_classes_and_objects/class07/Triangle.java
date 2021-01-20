package by.main.simplest_classes_and_objects.class07;

/*������� �����, �������������� �����������. ������������� ������ ��� �������� ��������, ����������
�������, ��������� � ����� ����������� ������.
*/


public class Triangle {
	private int x;
	private int y;
	
	public Triangle(){
		x=0;
		y=0;
	}
	
	public Triangle(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "x=" + x + ", y=" + y ;
	}
	
	
	
	
}
