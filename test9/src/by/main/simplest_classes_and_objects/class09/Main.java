package by.main.simplest_classes_and_objects.class09;

import java.util.ArrayList;

/*Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года
*/

public class Main {

	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<Book>();
		for(int i=0; i<10;i++) {
		bookList.add(new Book(i,"Name"+i, "author"+i, "publishingOffice"+i, 2000+i, 100+25*i, 40+2*i, "bindingType"+i));
		}

		
		for(Book x:bookList) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println();
		
		Logic author =new Logic();
		for(Book x:author.findBookByAuthor(bookList)) {
			System.out.println(x);
		}
		
		
		System.out.println();
		System.out.println();
		
		Logic publishingOffice =new Logic();
		for(Book x:publishingOffice.findBookByPublishingOffice(bookList)) {
			System.out.println(x);
		}
		
		
		System.out.println();
		System.out.println();
		
		Logic year =new Logic();
		for(Book x:year.findBookByPublishingYear(bookList)) {
			System.out.println(x);
		}
	}

}
