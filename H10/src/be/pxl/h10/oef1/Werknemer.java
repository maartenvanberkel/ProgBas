package be.pxl.h10.oef1;
import be.pxl.h10.voorbeeld.Persoon;

public class Werknemer extends Persoon {
	private String functie;
	private int salaris;
	private static final int MINUMUNSALARIS = 1000;
	private static int aantal;
	
	{
		aantal++;
	}
	
	public Werknemer(String naam, String voornaam) {
		this(naam, voornaam, "algemeen bediende", 1800);
	}
	
	public Werknemer(String naam, String voornaam, String functie, int salaris) {
		super(naam, voornaam);
		setFunctie(functie);
		setSalaris(salaris);
	}

	public void setFunctie(String functie) {
		this.functie = functie;
	}

	public void setSalaris(int salaris) {
		if (salaris < MINUMUNSALARIS) {
			this.salaris = MINUMUNSALARIS;
		} else {
			this.salaris = salaris;
		}
	}

	public String getFunctie() {
		return functie;
	}

	public int getSalaris() {
		return salaris;
	}
	
	public static int getMinumunsalaris() {
		return MINUMUNSALARIS;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("functie: " + getFunctie());
		System.out.println("salaris: " + getSalaris());
	}
	
	public static int getAantal() {
		return aantal;
	}
	
	
}
