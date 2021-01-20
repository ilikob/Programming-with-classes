package by.main.simplest_classes_and_objects.class04;


public class Train {
	private String destination;
	private int trainNumber;
	private int departureTime;
	
	
	public Train(String destination, int trainNumber, int departureTime) {
		this.destination=destination;
		this.trainNumber=trainNumber;
		this.departureTime=departureTime;
	}
	
	public void setDestination(String destination) {
		this.destination=destination;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setTrainNumber(int trainNumber) {
		this.trainNumber=trainNumber;
	}
	
	public int getTrainNumber() {
		return trainNumber;
	}
	
	public void setDepartureTime(int departureTime) {
		this.departureTime=departureTime;
	}
	
	public int getDepartureTime() {
		return departureTime;
	}
	
	@Override
	
	public String toString() {
		return "Пункт назаначения: "+destination+",  Номер поезда: "+trainNumber+",  Время: "+departureTime;
	}
}
