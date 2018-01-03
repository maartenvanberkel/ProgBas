package project1;

import java.time.LocalDate;

public class Wijn {
	private String naam;
	private String omschrijving;
	private String druivenras;
	private String kleur;
	private String land;
	private String regio;
	private int jaargang;
	private double alcoholPercentage;
	private String serveerTip;
	private String[] landenArray = { "Frankrijk", "Chili", "Italië", "Spanje" };
	private String[] kleurenArray = { "Wit", "Rood", "Rosé" };

	public Wijn(String naam, String kleur, String land) {
		this(naam, land, kleur, LocalDate.now().getYear() - 1, 12.5);
	}

	public Wijn(String naam, String kleur, String land, int jaargang, double alcoholPercentage) {
		setNaam(naam);
		setLand(land);
		setKleur(kleur);
		setJaargang(jaargang);
		setAlcoholPercentage(alcoholPercentage);
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public void setKleur(String kleur) {
		int count = 0;
		for (int i = 0; i < kleurenArray.length; i++) {
			if (kleurenArray[i].equals(kleur)) {
				this.kleur = kleur;
				count++;
			}
		}
		if (count == 0) {
			this.kleur = "Rood";
		}
	}

	public void setLand(String land) {
		int count = 0;
		for (int i = 0; i < landenArray.length; i++) {
			if (landenArray[i].equals(land)) {
				this.land = land;
				count++;
			}
		}
		if (count == 0) {
			this.land = "Onbekend";
		}
	}

	public void setRegio(String regio) {
		this.regio = regio;
	}

	public void setJaargang(int jaargang) {
		if (jaargang < 1950) {
			this.jaargang = 1950;
		} else {
			if (jaargang > LocalDate.now().getYear()) {
				this.jaargang = LocalDate.now().getYear();
			} else {
				this.jaargang = jaargang;
			}
		}
	}

	public void setAlcoholPercentage(double alcoholPercentage) {
		if (alcoholPercentage < 0) {
			this.alcoholPercentage = 0;
		} else {
			if (alcoholPercentage > 17) {
				this.alcoholPercentage = 17;
			} else {
				this.alcoholPercentage = alcoholPercentage;
			}
		}
	}

	public void setServeerTip(String serveerTip) {
		this.serveerTip = serveerTip;
	}

	public void setDruivenras(String druivenras) {
		this.druivenras = druivenras;
	}

	public String getNaam() {
		return naam;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public String getKleur() {
		return kleur;
	}

	public String getLand() {
		return land;
	}

	public String getRegio() {
		return regio;
	}

	public int getJaargang() {
		return jaargang;
	}

	public double getAlcoholPercentage() {
		return alcoholPercentage;
	}

	public String getServeerTip() {
		return serveerTip;
	}

	public String getDruivenras() {
		return druivenras;
	}

	public double getAdviesPrijs() {
		double basisprijs;
		double extra = (LocalDate.now().getYear() - this.jaargang) * 0.1;

		if (this.land.equals("Frankrijk")) {
			basisprijs = 7.5;
		} else {
			if (this.land.equals("Chili")) {
				basisprijs = 8.25;
			} else {
				if (this.land.equals("Italië")) {
					basisprijs = 9.3;
				} else {
					if (this.land.equals("Spanje")) {
						basisprijs = 6.45;
					} else {
						basisprijs = 9.3;
					}
				}
			}
		}

		if (this.jaargang % 10 != 7) {
			basisprijs = basisprijs + extra;
		}

		return basisprijs;
	}

	public String getLabel() {
		return this.naam + "\n" + this.druivenras + "\n" + this.regio + "\n" + this.jaargang;

	}

	@Override
	public String toString() {
		return "naam: " + this.naam + "\nomschrijving: " + this.omschrijving + "\ndruivenras: " + this.druivenras
				+ "\nkleur: " + this.kleur + "\nland: " + this.land + "\nregio: " + this.regio + "\njaargang: "
				+ this.jaargang + "\nalcoholpercentage: " + this.alcoholPercentage + "\nserveertip: " + this.serveerTip;
	}

}
