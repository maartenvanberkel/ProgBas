package be.pxl.h9.oef1;

public class Huwelijk {
	private Persoon partner1;
	private Persoon partner2;
	
	private Datum huwDatum;
	
	public Huwelijk(Persoon partner1, Persoon partner2, int dag, int maand, int jaar) {
		
	}
	

	
	{
		
	}
	
	public void adresWijziging(String straat, String huisnummer, int postcode, String gemeente) {
		partner1.getAdres().setStraat(straat);
		partner1.getAdres().setHuisnummer(huisnummer);
		partner1.getAdres().getGemeente().setPostcode(postcode);
		partner1.getAdres().getGemeente().setGemNaam(gemeente);
		partner2.getAdres().setStraat(straat);
		partner2.getAdres().setHuisnummer(huisnummer);
		partner2.getAdres().getGemeente().setPostcode(postcode);
		partner2.getAdres().getGemeente().setGemNaam(gemeente);
	}
	
	public void print() {
		System.out.println(partner1.toString());
		System.out.println("Geboren op" + partner1.getGeboortedatum());
		
		System.out.println();
		
		System.out.println(partner2.toString());
		System.out.println("Geboren op " + partner2.getGeboortedatum());
		
		System.out.println();
		
		System.out.println("Het huwelijk vond plaats op" + huwDatum);
	}
	
}