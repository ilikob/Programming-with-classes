package by.main.simplest_classes_and_objects.class09;

import java.util.ArrayList;

public class Logic {

	
	public ArrayList<Book> findBookByAuthor(ArrayList<Book> bookList){
		ArrayList<Book> suitableAuthor =new ArrayList<Book>();
		System.out.println("������� ��� ������:");
		String author =View.readString();
		for(int i=0; i<bookList.size();i++) {
			if(bookList.get(i).getAuthor().compareTo(author)==0) {
				suitableAuthor.add(bookList.get(i));
			}
		}
		if(suitableAuthor.size()==0) {
			System.out.println("������ � ����� ��������� ����");
		}
		return suitableAuthor;
	}
	
	
	
	public ArrayList<Book> findBookByPublishingOffice(ArrayList<Book> bookList){
		ArrayList<Book> suitablePublishingOffice =new ArrayList<Book>();
		System.out.println("������� �������� �������:");
		String author =View.readString();
		for(int i=0; i<bookList.size();i++) {
			if(bookList.get(i).getPublishingOffice().compareTo(author)==0) {
				suitablePublishingOffice.add(bookList.get(i));
			}
		}
		if(suitablePublishingOffice.size()==0) {
			System.out.println("������ ������� �� ����������");
		}
		return suitablePublishingOffice;
	}
	
	
	public ArrayList<Book> findBookByPublishingYear(ArrayList<Book> bookList){
		ArrayList<Book> suitablePublishingYear =new ArrayList<Book>();
		System.out.println("������� ���:");
		int year =View.readInt();
		for(int i=0; i<bookList.size();i++) {
			if(bookList.get(i).getPublishingYear()<year) {
				suitablePublishingYear.add(bookList.get(i));
			}
		}
		
		if(suitablePublishingYear.size()==0) {
			System.out.println("�������� ���");
		}
		
		return suitablePublishingYear;
	}
}
