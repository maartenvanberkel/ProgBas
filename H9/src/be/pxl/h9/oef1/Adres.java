package be.pxl.h9.oef1;

public class Adres {
	private String straat;
	private String huisnummer;
	private Gemeente gemeente;
	
	public Adres(String straat, String huisnummer, int postcode, String gemeente) {
		setStraat(straat);
		setHuisnummer(huisnummer);
		this.gemeente = new Gemeente(postcode, gemeente);
		
	}
	
	public void setStraat(String straat) {
		this.straat = straat;
	}
	public void setHuisnummer(String huisnummer) {
		this.huisnummer = huisnummer;
	}
	
	@Override
	public String toString() {
		return this.straat + " " + this.huisnummer + "\n" + gemeente.toString();
	}

	public String getStraat() {
		return straat;
	}
	public String getHuisnummer() {
		return huisnummer;
	}
	public Gemeente getGemeente() {
		return gemeente;
	}
}
