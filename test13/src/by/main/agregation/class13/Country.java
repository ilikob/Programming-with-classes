package by.main.agregation.class13;

import java.util.ArrayList;

public class Country {
	private String nameOfCounty;
	private int square;
	private City capital;
	private ArrayList<Region> regions;
	
	public Country() {
		
	}

	public Country(String nameOfCounty, City capital) {
		this.nameOfCounty = nameOfCounty;
		this.capital = capital;
		this.regions = new ArrayList<>();
	}

	
	public ArrayList<Region> getRegions() {
		return regions;
	}

	public void setRegions(Region region) {
		this.regions.add(region);
	}
	
	
	public String getNameOfCounty() {
		return nameOfCounty;
	}

	public void setNameOfCounty(String nameOfCounty) {
		this.nameOfCounty = nameOfCounty;
	}
	

	public int getSquare() {
	
		for(int i=0;i<regions.size();i++) {
			square += regions.get(i).getSquareOfRegion();
		}
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	
	
	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	
	
	
	@Override
	public String toString() {
		return nameOfCounty ;
	}


	
	
	
	
	
	
}
