package by.main.agregation.class13;

public class City {
	private String nameOfCity;
	
	
	public City() {
		
	}
	
	public City( String nameOfCity) {
		this.nameOfCity=nameOfCity;
	}
	

	
	public String getNameOfCity() {
		return nameOfCity;
	}

	public void setNameOfCity(String nameOfCity) {
		this.nameOfCity = nameOfCity;
	}

	

	@Override
	public String toString() {
		return nameOfCity;
	}
}
