package be.pxl.h10.oef2;

public class Reis {
	private String bestemming;
	private double prijs;
	private final static int MINIMUMPRIJS = 5;
	
	public Reis (String bestemming) {
		this(bestemming, MINIMUMPRIJS);
	}
	
	public Reis(String bestemming, double prijs) {
		setBestemming(bestemming);
		setPrijs(prijs);
	}

	public void setBestemming(String bestemming) {
		
		while (bestemming.charAt(0) >= '0' && bestemming.charAt(0) <= '9') {
			bestemming = bestemming.substring(1);
//			bestemming = bestemming.replace(bestemming.substring(0, 1), "");
		}
		
		

			

		this.bestemming = bestemming;
	}

	public void setPrijs(double prijs) {
		if (prijs < MINIMUMPRIJS) {
			this.prijs = MINIMUMPRIJS;
		} else {
			this.prijs = prijs;
		}
	}

	public String getBestemming() {
		return bestemming;
	}

	public double getPrijs() {
		return prijs;
	}

	public int getMINIMUMPRIJS() {
		return MINIMUMPRIJS;
	}
	
	public void print() {
		System.out.printf("Reis met bestemming %s kost %.2f euro.\n", getBestemming(), getPrijs());
	}

}
