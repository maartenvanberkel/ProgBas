package be.pxl.spel;

public class BordSpel extends Spel {
	private int speelduur;
	private int aantalSpelers;
	
	public BordSpel(String naam, Uitgever uitgever) {
		super(naam, uitgever);
	}

	public void setSpeelduur(int speelduur) {
		if (speelduur < 0) {
			this.speelduur = 30;
		} else {
			this.speelduur = speelduur;
		}
	}

	public void setAantalSpelers(int aantalSpelers) {
		if (aantalSpelers < 0) {
			this.aantalSpelers = 1;
		} else {
			this.aantalSpelers = aantalSpelers;
		}
	}

	public int getSpeelduur() {
		return speelduur;
	}

	public int getAantalSpelers() {
		return aantalSpelers;
	}

	@Override
	public String toString() {
		return "Bordspel " + super.toString() + ", aantalSpelers=" + this.aantalSpelers + ", speelduur=" + this.speelduur + "}";
	}
}
