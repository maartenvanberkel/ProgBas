package be.pxl.h9.oef1;

public class Datum {
	private int dag;
	private int maand;
	private int jaar;
	private static String[] maandNamen = {"januari", "februari", "maart", "april", "mei",
			"juni", "juli", "augustus", "september", "oktober", "november", "december"};
	
	public Datum() {
		this(1, 1, 2017);
	}
	
	public Datum(int d, int m, int j) {
		setDag(d);
		setMaand(m);
		setJaar(j);
	}

	public void setDag(int d) {
		this.dag = d;
	}

	public void setMaand(int m) {
		this.maand = m;
		
		if (m > maandNamen.length) {
			this.maand = maandNamen.length;
		}
		
		if (m < 1) {
			this.maand = 1;
		}
	}

	public void setJaar(int j) {
		this.jaar = j;
	}

	public void setMaandNamen(String[] maandNamen) {
		this.maandNamen = maandNamen;
	}
	
	

	@Override
	public String toString() {
		return this.dag + " " + maandNamen[this.maand - 1] + " " + this.jaar;
	}

	public int getDag() {
		return dag;
	}

	public int getMaand() {
		return maand;
	}

	public int getJaar() {
		return jaar;
	}

	public String[] getMaandNamen() {
		return maandNamen;
	}
	
	
}
