package be.pxl.h8.oef6;

public class Datum {
	private int dag;
	private int maand;
	private int jaar;
	private static String[] maandNamen = { "januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus",
			"september", "oktober", "november", "december" };
	
	public Datum() {
		this(1, 1, 2017);
		
	}
	
	public Datum(int d, int m, int j) {
		setDag(d);
		setMaand(m);
		setJaar(j);
	}
	
	public Datum(Datum moment) {
		this(moment.dag, moment.maand, moment.jaar);
	}

	public void setDag(int d) {
		if(d >=1 && d <=12) {
			this.dag = d;
		} else {
			if(d < 1) {
				this.dag = 0;
			} else {
				this.dag = 12;
			}
		}
	}

	public void setMaand(int m) {
		this.maand = m;
	}

	public void setJaar(int j) {
		this.jaar = j;
	}

	
	public String toString() {
		return dag + " " + maandNamen[maand -1] + " " + jaar;
	}
	
	public void drukKalender(int[] actDag, String[] actNaam) {
		System.out.println("**** Kalender voor " + this.getMaandNaam() + " " + this.jaar + " ****");
		for (int i = 0; i < 10; i++) {
			if (actDag[i] == 0) {
				i = 10;
			}
			if (i != 10) {
				System.out.printf("%-2d %s %-15d %s\n", actDag[i], this.getMaandNaam(), this.getJaar(), actNaam[i]);
			}
		}
	}

	public String getMaandNaam() {
		return maandNamen[this.maand-1];
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
}
