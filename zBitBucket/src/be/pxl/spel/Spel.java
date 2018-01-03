package be.pxl.spel;

public abstract class Spel {
	private String naam;
	private int minimumLeeftijd;
	private Uitgever uitgever;
	
	public Spel(String naam, Uitgever uitgever) {
		setNaam(naam);
		this.uitgever = uitgever;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setMinimumLeeftijd(int minimumLeeftijd) {
		if (minimumLeeftijd < 0) {
			this.minimumLeeftijd = 12;
		} else {
			this.minimumLeeftijd = minimumLeeftijd;
		}
	}

	public String getNaam() {
		return naam;
	}

	public int getMinimumLeeftijd() {
		return minimumLeeftijd;
	}

	public Uitgever getUitgever() {
		return uitgever;
	}

	@Override
	public String toString() {
		return "{naam='" + this.naam + "', minimumLeeftijd=" + this.minimumLeeftijd + ", uitgever=" + this.uitgever;
	}
	
	
	
	
}
