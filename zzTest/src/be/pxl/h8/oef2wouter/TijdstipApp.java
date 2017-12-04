package be.pxl.h8.oef2wouter;

public class TijdstipApp {

	public static void main(String[] args) {
		Tijdstip[] array = new Tijdstip[4];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = new Tijdstip(i + 12, i + 61, i + 40);
			System.out.println(array[i].toStringTechnisch());
		}
	}
}
