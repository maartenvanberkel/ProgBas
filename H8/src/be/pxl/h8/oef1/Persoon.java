package be.pxl.h8.oef1;

public class Persoon {
	// public String voornaam;
	// public String naam;
	// public double lengte;
	// public double gewicht;
	// public int geboorteJaar;

	private String voornaam;
	private String naam;
	private double lengte;
	private double gewicht;;
	private int geboorteJaar;

	public Persoon() {
		this("onbekend", "onbekend");
	}

	public Persoon(String voornaam, String naam) {
		this.voornaam = voornaam;
		this.naam = naam;
	}

	public Persoon(Persoon mens1) {
		this(mens1.voornaam, mens1.naam);
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setLengte(double lengte) {
		if (lengte <= 2.4) {
			this.lengte = lengte;
		} else {
			this.lengte = 2.4;
		}

	}

	public void groei() {
		setLengte(this.lengte + 0.01);
	}

	public void groei(double cm) {
		setLengte(this.lengte + cm / 100);
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public void setGeboorteJaar(int geboorteJaar) {
		this.geboorteJaar = geboorteJaar;
	}

	public String toString() {
		StringBuilder tekst = new StringBuilder(String.format("Deze persoon is %s %s", this.voornaam, this.naam));
		tekst.append(String.format("\n%-15s : %.2f", "gewicht", this.gewicht));
		tekst.append(String.format("\n%-15s : %.2f", "lengte", this.lengte));
		tekst.append(String.format("\n%-15s : %d", "geboortejaar", this.geboorteJaar));
		return tekst.toString();
	}

	public double berekenBmi() {
		double bmi = this.gewicht / this.lengte * this.lengte;

		return bmi;
	}

	public String geefOmschrijving() {
		String bmiOmschrijving = null;

		if (this.berekenBmi() < 18) {
			bmiOmschrijving = "ondergewicht";
		} else {
			if (this.berekenBmi() < 25) {
				bmiOmschrijving = "normaal";
			} else {
				if (this.berekenBmi() < 30) {
					bmiOmschrijving = "overgewicht";
				} else {
					if (this.berekenBmi() < 40) {
						bmiOmschrijving = "obesitas";
					} else {
						bmiOmschrijving = "morbide obesitas";
					}
				}
			}
		}

		return bmiOmschrijving;
	}

	public void voegVoornamenToe(String... voornamen) {
		StringBuilder temp = new StringBuilder(this.getVoornaam());

		for (int i = 0; i < voornamen.length; i++) {
			temp.append(" ");
			temp.append(voornamen[i]);
		}

		this.setVoornaam(temp.toString());
	}

	public String getVoornaam() {
		return voornaam;
	}

	public String getNaam() {
		return naam;
	}

	public double getGewicht() {
		return gewicht;
	}

	public double getLengte() {
		return lengte;
	}

	public double getGeboorteJaar() {
		return geboorteJaar;
	}

	public int getLeeftijd() {
		return 2017 - geboorteJaar;
	}

}
