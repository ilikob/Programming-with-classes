package by.main.agregation.class13;

import java.util.ArrayList;

public class Region {
	private String nameOfRegion;
	private int squareOfRegion;
	private City regionCenter;
	private ArrayList<District> districts;

	
	public Region(){
		
	}


	public Region(String nameOfRegion, City regionCenter, int squareOfRegion) {
		this.nameOfRegion = nameOfRegion;
		this.regionCenter = regionCenter;
		this.squareOfRegion=squareOfRegion;
		this.districts = new ArrayList<>();
	}


	
	
	public ArrayList<District> getDistricts() {
		return districts;
	}


	public void setDistricts(District district) {
		districts.add(district);
	}

	public String getNameOfRegion() {
		return nameOfRegion;
	}


	public void setNameOfRegion(String nameOfRegion) {
		this.nameOfRegion = nameOfRegion;
	}


	public int getSquareOfRegion() {
		return squareOfRegion;
	}


	public void setSquareOfRegion(int squareOfRegion) {
			this.squareOfRegion=squareOfRegion;
	}


	public City getRegionCenter() {
		return regionCenter;
	}


	public void setRegionCenter(City regionCenter) {
		this.regionCenter = regionCenter;
	}

	@Override
	public String toString() {
		return  nameOfRegion ;
	}






	


	
	
}
