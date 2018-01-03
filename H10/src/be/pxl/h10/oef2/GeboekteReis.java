package be.pxl.h10.oef2;

public class GeboekteReis {
	private String naam;
	private Reis[] reizen;
	private static int aantalReizen;
	private static int count = 0;
	
	public GeboekteReis(String naam, int aantalReizen) {
		GeboekteReis.aantalReizen = aantalReizen;
		this.naam = naam;
		this.reizen = new Reis[this.aantalReizen];
	}
	
	public void voegReisToe(Reis reis) {
		if(GeboekteReis.count < GeboekteReis.aantalReizen) {
			reizen[GeboekteReis.count] = reis;
			GeboekteReis.count++;
		}
	}
	
	public void print() {
		System.out.println("Reis van " + this.naam);
		for ( int i = 0; i < reizen.length; i++) {
			System.out.print("==> reis " + (i + 1) + " ");
			reizen[i].print();
		}
		System.out.println("Deze passagier moet " + (reizen.length - 1) + " keer overstappen.");
	}
}
