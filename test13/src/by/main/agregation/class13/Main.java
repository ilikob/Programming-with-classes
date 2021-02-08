package by.main.agregation.class13;


//. ������� ������ ������ �����������, ��������� ������ �������, �����, �����. ������: ������� �� �������
//�������, ���������� ��������, �������, ��������� ������. 

public class Main {

	public static void main(String[] args) {
		City minsk = new City("�����");
		
		Country belarus = new Country("��������", minsk);
		
		belarus.setRegions(new Region("������� �������", minsk,39854));
		belarus.setRegions(new Region("��������� �������", (new City("�����")),32786));
		belarus.setRegions(new Region("��������� �������",(new City("�������")),40051));
		belarus.setRegions(new Region("���������� �������", (new City("������")),29068));
		belarus.setRegions(new Region("����������� �������", (new City("������")),25127));
		belarus.setRegions(new Region("���������� �������", (new City("������")),40372));

		System.out.println("������� "+belarus.getCapital());
		System.out.println("���������� ��������: "+belarus.getRegions().size());
		System.out.println("�������: "+ belarus.getSquare());
		
		for(Region x :belarus.getRegions()) {
			System.out.println("��������� ����� "+x.getRegionCenter());
		}
		
	}

}
