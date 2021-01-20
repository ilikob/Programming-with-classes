package by.main.simplest_classes_and_objects.class09;

public class Book {
	private int id;
	private String name;
	private String author;
	private String publishingOffice;
	private int publishingYear;
	private int numberOfPages;
	private int price;
	private String bindingType;
	
	
	public Book() {
		
	}
	
	public Book(int id, String name, String author, String publishingOffice, int publishingYear, int numberOfPages, int price, String bindingType) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publishingOffice = publishingOffice;
		this.publishingYear = publishingYear;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.bindingType = bindingType;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public String getPublishingOffice() {
		return publishingOffice;
	}
	
	public void setPublishingOffice(String publishingOffice) {
		this.publishingOffice = publishingOffice;
	}
	
	
	public int getPublishingYear() {
		return publishingYear;
	}
	
	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}
	
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String getBindingType() {
		return bindingType;
	}
	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public String toString() {
		return "id=" + id +  " "+ name  + " " + author + " "  + publishingOffice + " publishingYear="
				+ publishingYear  + " numberOfPages= " + numberOfPages + " price= " + price +" руб."
				+ " " + bindingType;
	}
		
	
	
	
}
