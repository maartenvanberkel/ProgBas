package be.pxl.h6.opdr3;

public class H6Opdr3 {

	public static void main(String[] args) {
		String regelTekst = "Dit is een regel tekst. dit is geen vraag.";
		
		System.out.println(regelTekst);
		System.out.println(regelTekst.length());
		
		System.out.println(regelTekst.toUpperCase());
		System.out.println(regelTekst.toLowerCase());
		
		System.out.println(regelTekst.replace('a', 'o'));
	
		int tel = 0;
		int pos = regelTekst.indexOf("e");
		
		while ( pos != -1) {
			tel++;
			pos = regelTekst.indexOf("e" + pos + 1);
			System.out.println(pos);
		}
		
		
	}
}