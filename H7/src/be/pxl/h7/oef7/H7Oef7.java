package be.pxl.h7.oef7;

public class H7Oef7 {

	public static void main(String[] args) {
		String[] kleuren = {"rood", "wit", "blauw", "oranje", "zwart"};
		String[] sizes = {"small", "medium", "large"};
		int[][] voorraad = {{45, 102, 19, 55, 0}, {79, 47, 58, 22, 46}, { 109, 33, 112, 0, 0}};
		double totaal = 0;
		
		for (int maat = 0; maat < sizes.length; maat++) {
			for (int kleur = 0; kleur < kleuren.length; kleur++) {
				totaal = totaal + voorraad[maat][kleur];
			}
			//2de for is nodig omdat er tussentijds het totaal berkend moet worden.
			for (int kleur = 0; kleur < kleuren.length; kleur++) {
				if (voorraad[maat][kleur] < totaal / 3) {
					System.out.println("Er moeten " + kleuren[kleur] + " " + sizes[maat] + " worden bijbesteld.");
				}
			}
			totaal = 0;
		}
	}
}