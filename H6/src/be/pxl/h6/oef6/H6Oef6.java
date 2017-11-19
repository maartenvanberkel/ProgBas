package be.pxl.h6.oef6;

import java.util.Scanner;


public class H6Oef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef de naam van de verkoper in: ");
		String naamVerkoper = keyboard.nextLine();
				
		System.out.println("Geef de hoogte (tussen 2m en 6.5m) van de poort in: ");
		double hoogte = keyboard.nextDouble();

		while (!testenHoogte(hoogte)) {
			System.out.println("Geef de hoogte (tussen 2m en 6.5m) van de poort in: ");
			hoogte = keyboard.nextDouble();
		}
		
		System.out.println("Geef de breedte (tussen 2m en 8m) van de poort  in:");
		double breedte = keyboard.nextDouble();
		
		while (!testenBreedte(breedte)) {
			System.out.println("Geef de breedte (tussen 2m en 8m) van de poort  in:");
			breedte = keyboard.nextDouble();
		}
		
		System.out.println("Wilt u een speciale kleur? Ja of Nee? ");
		String kleur = keyboard.next();
		
		double oppervlakte = berekenOppervlakte(breedte, hoogte);
		double gewicht = berekenGewicht(oppervlakte);
		String typeMotor = berekenMotor(gewicht);
		double prijsMotor = berekenPrijsMotor(typeMotor);
		double prijs = berekenPrijs(oppervlakte, typeMotor, kleur, prijsMotor);
		String offertenummer = genereerOfferteNummer(naamVerkoper, prijs);
		
		System.out.println(prijs);
		System.out.println(offertenummer);

		
		keyboard.close();
	}
	public static boolean testenHoogte(double hoogte) {
	
		return hoogte > 2 && hoogte < 6.5;
	}
	public static boolean testenBreedte(double breedte) {
	
		return breedte > 2 && breedte < 8;
		
	}
	public static double berekenOppervlakte(double breedte, double hoogte) {
		return breedte * hoogte;
	}
	public static double berekenGewicht(double oppervlakte) {
		return oppervlakte * 11;
	}
	public static String berekenMotor(double gewicht) {
		if (gewicht < 150) {
			return "A101";
		}
		if (gewicht > 300) {
			return "X300";
		}
		return "A105";
	}
	public static double berekenPrijsMotor(String typeMotor) {
		if (typeMotor == "A101") {
			return 120.0;
		}
		if (typeMotor == "A105") {
			return 220.5;
		}
		return 250.5;
	}
	public static double berekenPrijs(double oppervlakte, String typeMotor, String kleur, double prijsMotor) {
		if (kleur.toLowerCase().trim().equals("ja")) {
			return (oppervlakte * 113.5  + prijsMotor) * 1.1;
		}
		return oppervlakte * 113.5 + prijsMotor;
	}
	public static String genereerOfferteNummer(String naamVerkoper, double prijs) {
		String prijsString = String.valueOf(prijs);
		StringBuilder prijsStringBuilder = new StringBuilder(prijsString);
		prijsStringBuilder.reverse();
		String prijsTotaal = prijsStringBuilder.toString();
		String offerteNummer = "2016_".concat(naamVerkoper).toUpperCase().concat("_").concat(prijsTotaal);
		
		return offerteNummer;
	}
}