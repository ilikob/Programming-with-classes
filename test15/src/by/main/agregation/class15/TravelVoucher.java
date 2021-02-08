package by.main.agregation.class15;

public class TravelVoucher {
	private String city;
	private TypeOfTour typeOfTour;
	private Transport transport;
	private Food food;
	private Client client;
	private int numberOfDays;
	
	public TravelVoucher(){
		
	}

	public TravelVoucher(String city, TypeOfTour typeOfTour, Transport transport, Food food, Client client,
			int numberOfDays) {
		super();
		this.city = city;
		this.typeOfTour = typeOfTour;
		this.transport = transport;
		this.food = food;
		this.client = client;
		this.numberOfDays = numberOfDays;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public TypeOfTour getTypeOfTour() {
		return typeOfTour;
	}

	public void setTypeOfTour(TypeOfTour typeOfTour) {
		this.typeOfTour = typeOfTour;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	@Override
	public String toString() {
		return "city=" + city + ", typeOfTour=" + typeOfTour + ", transport=" + transport + ", food="
				+ food + ", client=" + client + ", numberOfDays=" + numberOfDays;
	}
	
	
}
