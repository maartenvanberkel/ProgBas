package be.pxl.spel;

import java.time.LocalDate;

public class Speler {
	private String naam;
	private int geboortejaar;
	
	public Speler(String naam, int geboortejaar) {
		setNaam(naam);
		setGeboortejaar(geboortejaar);
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setGeboortejaar(int geboortejaar) {
		if (geboortejaar > LocalDate.now().getYear() || geboortejaar < 1900) {
			this.geboortejaar = 0;
		} else {
			this.geboortejaar = geboortejaar;
		}
	}

	public String getNaam() {
		return naam;
	}

	public int getGeboortejaar() {
		return geboortejaar;
	}
	
	public int getLeeftijd() {
		if (this.geboortejaar == 0) {
			return -1;
		}
		
		return LocalDate.now().getYear() - this.geboortejaar;
	}
	
	
}
