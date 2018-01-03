package be.pxl.h9.oef1;

public class Persoon {
	private String naam;
	private String voornaam;
	private Datum geboortedatum;
	private Adres adres;

	public Persoon() {
		this("Aerts", "Jef", new Datum(29, 11, 1990), new Adres("Lindestraat", "23D", 3500, "Hasselt"));
	}

	public Persoon(String naam, String voornaam, Datum geboortedatum, Adres adres) {
//		setNaam(naam);
//		setVoornaam(voornaam);
//		this.geboortedatum = new Datum();
//		setAdres(adres);
		
		this.naam = naam;
		this.voornaam = voornaam;
		this.geboortedatum = geboortedatum;
		this.adres = adres;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	
	public void voegVoornamenToe(String... voornamen) {
		StringBuilder temp = new StringBuilder(getVoornaam());
		
		for (int i = 0; i < voornamen.length; i++) {
			temp.append(" ");
			temp.append(voornamen[i]);
		}
		setVoornaam(temp.toString());
	}
	
	@Override
	public String toString() {
		return this.getVoornaam() + " " + this.getNaam() + "\n" + adres.toString();
	}

	public String getNaam() {
		return naam;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public Datum getGeboortedatum() {
		return geboortedatum;
	}

	public Adres getAdres() {
		return adres;
	}
	
	

}
