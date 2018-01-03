package be.pxl.h8.opdr3;

public class BoekApp {

	public static void main(String[] args) {
		Auteur schrijver = new Auteur();
		Boek boek1 = new Boek();
		
		schrijver.setNaam("van Berkel");
		schrijver.setVoornaam("Maarten");
		
		boek1.setAuteur(schrijver);
		boek1.setTitel("Peuk: the untold story");
		boek1.setBladzijden(9000);
		boek1.setIsbn("MVBPEUK21387632876");
		
		boek1.toonBoekGegevens();
		
		
	}
}