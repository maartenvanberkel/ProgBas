package be.pxl.h8.exoef1;

public class DatumBewerkingenApp {

	public static void main(String[] args) {
		DatumBewerkingen date = new DatumBewerkingen();
		
		date.bepaalSchrikkelJaar(1901);
		System.out.println(date.dagVanHetJaar(4, 12, 2000));
		
	}
}