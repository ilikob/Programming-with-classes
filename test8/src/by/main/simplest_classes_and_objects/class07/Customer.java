package by.main.simplest_classes_and_objects.class07;

public class Customer {
	private int id;
	private String surname;
	private String name;
	private String middleName;
	private String adress;
	private int numberCreditCard;
	private int bankAccountNumber;
	
	
	public Customer() {
		
	}
	
	public Customer(int id,  String name, String surname, String middleName, String adress, int numberCreditCard, int bankAccountNumbe) {
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.middleName=middleName;
		this.adress=adress;
		this.numberCreditCard=numberCreditCard;
		this.bankAccountNumber= bankAccountNumbe;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public int getNumberCreditCard() {
		return numberCreditCard;
	}
	
	public void setNumberCreditCard(int numberCreditCard) {
		this.numberCreditCard = numberCreditCard;
	}
	
	public int getBankAccountNumber() {
		return bankAccountNumber;
	}
	
	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", surname=" + surname +", middleName=" + middleName
				+ ", adress=" + adress + ", numberCreditCard=" + numberCreditCard + ", bankAccountNumber="
				+ bankAccountNumber;
	}
	
	
	
	
	
}
