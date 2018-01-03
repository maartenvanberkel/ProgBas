package be.pxl.h8.oef1;

public class PersoonApp {

	public static void main(String[] args) {
		Persoon mens = new Persoon();
		
//		mens.voornaam = "Maarten";
//		mens.naam = "van Berkel";
//		mens.lengte = 1.99;
//		mens.gewicht = 85;
//		mens.geboorteJaar = 1990;
//		
//		System.out.println("Deze persoon is " + mens.voornaam.concat(" ") + mens.naam);
		
//		mens.setVoornaam("Maarten");
//		mens.setNaam("van Berkel");
//		mens.setGewicht(85);
//		mens.setLengte(1.99);
//		mens.setGeboorteJaar(1990);
//		
//		System.out.println(mens.toString());
//		
//		System.out.println(mens.getLengte());
//	
//		mens.groei();
//		System.out.println(mens.getLengte());
//		
//		mens.groei(20);
//		System.out.println(mens.getLengte());
		Persoon mens2 = new Persoon("Maarten", "vb");
		
		mens2.setLengte(2);
		mens2.setGewicht(50);
		mens2.setGeboorteJaar(1990);
		
		System.out.println(mens2.toString());
	}
}