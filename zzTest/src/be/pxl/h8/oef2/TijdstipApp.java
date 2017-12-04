package be.pxl.h8.oef2;

public class TijdstipApp {

	public static void main(String[] args) {
		
		Tijdstip moment1 = new Tijdstip(3,10, 23);
		

		System.out.println(moment1.getUren());
		System.out.println(moment1.getMinuten());
		System.out.println(moment1.getSeconden());
		
		System.out.println();
		
		System.out.println(moment1.toStringTijd(false));
		
		System.out.println();
		System.out.println(moment1.toStringTechnisch());
	}

}
