package be.pxl.h10.voorbeeld;

public class Lector extends Persoon{
	private String personeelsnummer;
	private int aanstellingsPercentage;
	private int salaris;
	private static int aantal;
	{
		aantal++;
	}
	
	public Lector() {
		this("onbekend", "onbekend", "20009999", 100, 2000);
	}
	
	public Lector(String naam, String voornaam, int aanstellingsPercentage, int salaris) {
		this(naam, voornaam, "onbekend", 100, 2000);
	}
	
	public Lector(String naam, String voornaam, String personeelsnummer, int aanstellingsPercentage, int salaris) {
		super(naam, voornaam);
		setPersoneelsnummer(personeelsnummer);
		setAanstellingsPercentage(aanstellingsPercentage);
		setSalaris(salaris);
	}
	
	public void setPersoneelsnummer(String persooneelsnummer) {
		this.personeelsnummer = persooneelsnummer;
	}
	
	public void setAanstellingsPercentage(int aanstellingsPercentage) {
		int oudAanstellingsPercentage = this.aanstellingsPercentage;

		if (aanstellingsPercentage < 0) {
			this.aanstellingsPercentage = 0;
		} else {
			if (aanstellingsPercentage > 100) {
				this.aanstellingsPercentage = 100;
			} else {
				this.aanstellingsPercentage = aanstellingsPercentage;
			}
		}
		
		if (this.salaris != 0 && oudAanstellingsPercentage != 0) {
			this.salaris = this.salaris / oudAanstellingsPercentage * this.aanstellingsPercentage;
		}
	}
	

	
	public void setSalaris(int salaris) {
		this.salaris = salaris;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("personeelsnummer: " + this.personeelsnummer);
		System.out.println("aanstellingspercentage: " + this.aanstellingsPercentage);
		System.out.println("salaris: " + this.salaris);
	}
	
	public String getPersoneelsnummer() {
		return personeelsnummer;
	}
	
	public int getAanstellingsPercentage() {
		return aanstellingsPercentage;
	}
	
	public int getSalaris() {
		return salaris;
	}
	
	public static int getAantal() {
		return aantal;
	}
	
	
}
