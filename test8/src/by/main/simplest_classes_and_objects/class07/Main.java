package by.main.simplest_classes_and_objects.class07;


/*����� Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����.
����� � �������:
a) ������ ����������� � ���������� �������;
b) ������ �����������, � ������� ����� ��������� �������� ��������� � �������� ���������
*/


import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		ArrayList<Customer>  customerList = new ArrayList<Customer>();
		customerList.add(new Customer(0, "����", "�������", "����������", "��. ������", 11223344, 12345));
		customerList.add(new Customer(1, "������", "��������", "��������", "��. ������", 22334455, 23456));
		customerList.add(new Customer(2, "������", "����������", "���������", "��. ������", 33445566, 34567));
		customerList.add(new Customer(3, "������", "��������", "����������", "��. ���������", 44556677, 45678));
		customerList.add(new Customer(4, "�����", "���������", "�����������", "��. ���������", 55667788, 56789));
		customerList.add(new Customer(5, "������", "��������", "����������", "��. ���������", 66778899, 67890));
		customerList.add(new Customer(6, "������", "���������", "�������������", "��. ����������", 77889900, 78901));
		customerList.add(new Customer(7, "������", "�������", "����������", "��. ����������", 88990011, 89012));
		customerList.add(new Customer(8, "����", "���������", "���������", "��. ����������", 99001122, 90123));
		customerList.add(new Customer(9, "���������", "��������", "�������������", "��. ����������", 10122334, 10234));
		
		Logic  sortByName=new Logic();
		System.out.println("���������� �� �����:");
		for(Customer x:sortByName.sortByAlphabet(customerList)) {
			System.out.println(x);
		}
		
		System.out.println();
		Logic  sortByCreditCart=new Logic();
		for(Customer x:sortByCreditCart.sortByNumberCreditCard(customerList)) {
			System.out.println(x);
		}
		 
	}
}
