package be.pxl.h6.exoef4;

public class H6ExOef4 {

	public static void main(String[] args) {
		StringBuilder tekst = new StringBuilder();
		char karakter = 'a';
		
		for (int i = 0; i < 26; i++) {
			tekst.insert(i, karakter);
			karakter++;
		}
		System.out.println(tekst);
		
		karakter = 'B';
		
		for (int i = 1; i <= 25; i += 2) {
			tekst.setCharAt(i, karakter);
			karakter += 2;
		}
		System.out.println(tekst);
		
		String tekst2 = tekst.toString().replaceAll("H", "X");
		System.out.println(tekst2);
	}
}