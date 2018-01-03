package be.pxl.h10.oef2;

public class ReisApp {

	public static void main(String[] args) {
		TreinReis trein1 = new TreinReis("213213232Brussel");
		VliegtuigReis vliegtuig1 = new VliegtuigReis("Malaga");
		TreinReis trein2 = new TreinReis("Gibraltar", 6.4, false, "GIB45");
		VliegtuigReis vliegtuig2 = new VliegtuigReis("Brussel", 122.36, "vBRU234");
		TreinReis trein3 = new TreinReis("Hasselt");
		
		
		GeboekteReis reizen = new GeboekteReis("Maarten van Berkel", 5);
		
		reizen.voegReisToe(trein1);
		reizen.voegReisToe(vliegtuig1);
		reizen.voegReisToe(trein2);
		reizen.voegReisToe(vliegtuig2);
		reizen.voegReisToe(trein3);
		
		reizen.print();
	}
}