package be.pxl.h8.opdr10;

public class KlasApp {

	public static void main(String[] args) {
		
		
		Klas tinA = new Klas();
		Klas tinB = new Klas(9, "1TINB");
		Klas tinC = new Klas();
		
		System.out.println("max aantal studenten: " + Klas.maxAantalStudenten);
		System.out.println("count: " + Klas.getCount());
		
		System.out.println();
		
		tinA.setNaamKlas("1TINA");
		tinC.setAantalStudenten(15);
		tinB.setAantalStudenten(45);
		tinC.setNaamKlas("1TINC");
		

		
		Klas klassenTabel[] = new Klas [3];
		klassenTabel[0] = tinA;
		klassenTabel[1] = tinB;
		klassenTabel[2] = tinC;
		
		for (int i = 0; i < klassenTabel.length; i++) {
			System.out.println("Klas " + klassenTabel[i].getNaamKlas() + " heeft " + klassenTabel[i].getAantalStudenten() + " studenten.");
		}
		
		System.out.println();
		System.out.println("totaal aantal studenten: " + Klas.getTotaalAantalStudenten());

	}
}