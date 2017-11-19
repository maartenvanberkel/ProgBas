package be.pxl.h6.exoef2;

public class H6ExOef2 {

	public static void main(String[] args) {
		String regelTekst = "Dit is een regel tekst.";
		
		if(regelTekst.length() % 3 == 0) {
			System.out.println(regelTekst.toUpperCase());
		} else {
			System.out.println(regelTekst.toLowerCase());
		}
	}
}