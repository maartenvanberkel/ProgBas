package be.pxl.h8.opdr10;

public class Klas {
	private String naamKlas;
	private int aantalStudenten;
	public static int maxAantalStudenten;
	private static int count = 0;
	private static int totaalAantalStudenten;
	
	static {
		maxAantalStudenten = 40;
	}
	
	{
		count++;
	}
	public Klas () {
		this(0, "1TINx");
	}
	
	public Klas (int aantalStudenten, String naamKlas) {
//		this.aantalStudenten = aantalStudenten;
		setAantalStudenten(aantalStudenten);
		
		this.naamKlas = naamKlas;
	}
	
	public void setAantalStudenten(int aantalStudenten) {
		totaalAantalStudenten -= + this.aantalStudenten;
		
		if(aantalStudenten > maxAantalStudenten) {
			this.aantalStudenten = 40;
		} else {
			this.aantalStudenten = aantalStudenten;
		}
		
		totaalAantalStudenten += this.aantalStudenten;
	}
	
	public void setNaamKlas(String naamKlas) {
		this.naamKlas = naamKlas;
	}
	
	public static void setCount(int count) {
		Klas.count = count;
	}
	
	public static void setTotaalAantalStudenten(int totaalAantalStudenten) {
		Klas.totaalAantalStudenten = Klas.totaalAantalStudenten + totaalAantalStudenten;
	}
	
	public int getAantalStudenten () {
		return aantalStudenten;
	}
	
	public String getNaamKlas() {
		return naamKlas;
	}
	
	public static int getCount() {
		return count;
	}
	
	public static int getTotaalAantalStudenten() {
		return totaalAantalStudenten;
	}
}
