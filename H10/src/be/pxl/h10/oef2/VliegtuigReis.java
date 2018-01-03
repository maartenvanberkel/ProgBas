package be.pxl.h10.oef2;

public class VliegtuigReis extends Reis {
	private String vluchtnummer;
	private static final int MINIMUMPRIJS = 25;
	
	public VliegtuigReis(String bestemming) {
		this(bestemming, 0, bestemming.substring(0, 1).toUpperCase().concat("999"));
	}
	
	public VliegtuigReis(String bestemming, double prijs, String vluchtnummer) {
		super(bestemming);
		setPrijs(prijs);
		setVluchtnummer(vluchtnummer);
		
	}
	
	@Override
	public void setPrijs(double prijs) {
		if (prijs <  MINIMUMPRIJS) {
			super.setPrijs(MINIMUMPRIJS); 
		} else {
			super.setPrijs(prijs);
		}
	}
	

	public void setVluchtnummer(String vluchtnummer) {
		if (vluchtnummer.substring(0, 1).toUpperCase().equals(this.getBestemming().substring(0, 1).toUpperCase())) {
			this.vluchtnummer = vluchtnummer.toUpperCase();
		} else {
			this.vluchtnummer = this.getBestemming().substring(0, 1).toUpperCase().concat(vluchtnummer.toUpperCase());
		}
	}

	public String getVluchtnummer() {
		return vluchtnummer;
	}

	@Override
	public int getMINIMUMPRIJS() {
		return MINIMUMPRIJS;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Vliegtuigreis (vluchtnr "+ this.vluchtnummer + ")");
		
	}

}
