package be.pxl.h8.oef5;

public class Auto {
	private String merk;
	private String model;
	private int bouwjaar;
	private String kleur;
	private int maxSnelheid;
	private static final int MAX = 180;
	private static int aantal;
	
	public Auto() {
		this("VW", "Polo", 2017, "grijs", 160);
	}
	
	public Auto(String merk, String model, int bouwjaar, String kleur, int maxSnelheid) {
		setMerk(merk);
		setModel(model);
		setBouwjaar(bouwjaar);
		setKleur(kleur);
		setMaxSnelheid(maxSnelheid);
		aantal++;
	}
	
	public Auto( Auto mobiel1) {
		this(mobiel1.merk, mobiel1.model, mobiel1.bouwjaar, mobiel1.kleur, mobiel1.maxSnelheid);
	}
	
	public void setMerk(String merk) {
		this.merk = merk;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setBouwjaar(int bouwjaar) {
		this.bouwjaar = bouwjaar;
	}
	public void setKleur(String kleur) {
		this.kleur = kleur;
	}
	public void setMaxSnelheid(int maxSnelheid) {
		if (maxSnelheid <= MAX) {
			this.maxSnelheid = maxSnelheid;
		} else {
			this.maxSnelheid = MAX;
		}
	}
	
	public String print() {
		StringBuilder tekst = new StringBuilder();
		
		tekst.append(String.format("%-15s : %s%n", "merk", this.merk));
		tekst.append(String.format("%-15s : %s%n", "model", this.model));
		tekst.append(String.format("%-15s : %d%n", "bouwjaar", this.bouwjaar));
		tekst.append(String.format("%-15s : %s%n", "kleur", this.kleur));
		tekst.append(String.format("%-15s : %s%n", "max snelheid", this.maxSnelheid));
		
		return tekst.toString();
	}

	public String getMerk() {
		return merk;
	}

	public String getModel() {
		return model;
	}

	public int getBouwjaar() {
		return bouwjaar;
	}

	public String getKleur() {
		return kleur;
	}

	public int getMaxSnelheid() {
		return maxSnelheid;
	}
	
	public static int getAantal() {
		return aantal;
	}
	
}
