package be.pxl.h9.oef1;

public class Gemeente {
	private int postcode;
	private String gemNaam;
	
	public Gemeente(int postcode, String gemNaam) {
		setPostcode(postcode);
		setGemNaam(gemNaam);
	}

	public void setPostcode(int postcode) {
		while (postcode < 1000) {
			postcode = postcode * 10;
		}
		
		while (postcode > 1000) {
			postcode = postcode / 10;
		}
		
		this.postcode = postcode;
	}

	public void setGemNaam(String gemNaam) {
		this.gemNaam = gemNaam;
	}
	

	@Override
	public String toString() {
		return this.postcode + " " + this.gemNaam;
	}

	public int getPostcode() {
		return postcode;
	}

	public String getGemNaam() {
		return gemNaam;
	}
	
	

}
