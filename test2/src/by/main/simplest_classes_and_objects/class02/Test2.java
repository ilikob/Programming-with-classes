package by.main.simplest_classes_and_objects.class02;

/*������� ����� Test2 ����� �����������. �������� ����������� � �������� �����������. ��������
�����������, ���������������� ����� ������ �� ���������. �������� set- � get- ������ ��� ����� ����������
������.
*/


public class Test2 {
	private int x;
	private int y;
	
	
	public Test2() {
		x=0;
		y=0;
	}
	public Test2(int x,int y) {
		this.x=x;
		this.y=y;
	}
	

	
	public void setX(int x) {
		this.x=x;
	}
	
	public int getX() {
		return x; 
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public int getY() {
		return y;
	}
}
