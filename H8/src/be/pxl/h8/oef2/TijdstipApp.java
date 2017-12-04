package be.pxl.h8.oef2;

public class TijdstipApp {

	public static void main(String[] args) {
		Tijdstip moment1 = new Tijdstip(14, 8, 3);

		System.out.println(moment1.getUren());
		System.out.println(moment1.getMinuten());
		System.out.println(moment1.getSeconden());
		
		moment1.setMinuten(12);
		moment1.setSeconden(300);
		moment1.setUren(3);

		System.out.println();

		System.out.println(moment1.toStringTijd(false));

		System.out.println();
		System.out.println(moment1.toStringTechnisch());

	}
}