package by.main.simplest_classes_and_objects.class07;


/*Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
*/


import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		ArrayList<Customer>  customerList = new ArrayList<Customer>();
		customerList.add(new Customer(0, "Иван", "Дроздов", "Михайлович", "ул. Гоголя", 11223344, 12345));
		customerList.add(new Customer(1, "Андрей", "Фамильян", "Иванович", "ул. Гоголя", 22334455, 23456));
		customerList.add(new Customer(2, "Богдан", "Мурахоедов", "Франкович", "ул. Гоголя", 33445566, 34567));
		customerList.add(new Customer(3, "Виктор", "Викторян", "Викторович", "ул. Советская", 44556677, 45678));
		customerList.add(new Customer(4, "Франк", "Ибрагимов", "Ибрагимович", "ул. Советская", 55667788, 56789));
		customerList.add(new Customer(5, "Наташа", "Дроздова", "Алексеевна", "ул. Советская", 66778899, 67890));
		customerList.add(new Customer(6, "Оксана", "Ростинова", "Ростиславовна", "ул. Московская", 77889900, 78901));
		customerList.add(new Customer(7, "Степан", "Боруков", "Алексеевич", "ул. Московская", 88990011, 89012));
		customerList.add(new Customer(8, "Олег", "Чекелидзе", "Андреевич", "ул. Московская", 99001122, 90123));
		customerList.add(new Customer(9, "Александр", "Добрынин", "Станиславович", "ул. Московская", 10122334, 10234));
		
		Logic  sortByName=new Logic();
		System.out.println("Сортировка по имени:");
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
