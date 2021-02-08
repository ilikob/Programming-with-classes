package by.main.agregation.class13;

public class District {
	private String nameOfDistrict;
	private int squareOfDistrict;
	
	public District() {
		
	}
	
	public District(String nameOfDistrict, int squareOfDistrict) {
		super();
		this.nameOfDistrict = nameOfDistrict;
		this.squareOfDistrict = squareOfDistrict;
	}

	public String getNameOfDistrict() {
		return nameOfDistrict;
	}

	public void setNameOfDistrict(String nameOfDistrict) {
		this.nameOfDistrict = nameOfDistrict;
	}

	public int getSquareOfDistrict() {
		return squareOfDistrict;
	}

	public void setSquareOfDistrict(int squareOfDistrict) {
		this.squareOfDistrict = squareOfDistrict;
	}

	@Override
	public String toString() {
		return  nameOfDistrict + squareOfDistrict ;
	}
	
	
}
