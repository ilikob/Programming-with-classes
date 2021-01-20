package by.main.simplest_classes_and_objects.class10;


/*Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*/


public class Airline {

	private String destination;
	private int flightNumber;
	private String typePlane;
	private int departureTime;
	private String dayOfWeek;
	
	public Airline() {
		
	}
	
	public Airline(String destination, int flightNumber, String typePlane, int departureTime, String dayOfWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.typePlane = typePlane;
		this.departureTime = departureTime;
		this.dayOfWeek = dayOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getTypePlane() {
		return typePlane;
	}

	public void setTypePlane(String typePlane) {
		this.typePlane = typePlane;
	}

	public int getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	
	
	
	@Override
	public String toString() {
		return "destination=" + destination + ", flightNumber=" + flightNumber + ", typePlane=" + typePlane
				+ ", departureTime=" + departureTime + ", dayOfWeek=" + dayOfWeek;
	}
	
	
}
