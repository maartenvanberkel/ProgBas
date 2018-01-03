package project1;

public class WijnApp {

	public static void main(String[] args) {
		Wijn[] wijnkelder = new Wijn[4];
		
		wijnkelder[0] = new Wijn("Parra", "Wit", "Spanje", 2001, 11.5);
		wijnkelder[0].setDruivenras("Sauvignon Blanc");
		wijnkelder[0].setOmschrijving("Licht, fris en strak");
		wijnkelder[0].setRegio("La Mancha");
		wijnkelder[0].setServeerTip("Visgerechten");
		
		wijnkelder[1] = new Wijn("Domaine de la Jardine", "Rood", "Frankrijk", 2016, 14);
		wijnkelder[1].setDruivenras("Merlot");
		wijnkelder[1].setOmschrijving("Licht, soepel en fruitig");
		wijnkelder[1].setRegio("Pays d'Oc");
		wijnkelder[1].setServeerTip("Gevogelte");
		
		wijnkelder[2] = new Wijn("Montebello Grande Bellezza", "Rood", "Italië", 2012, 13);
		wijnkelder[2].setDruivenras("Negroamaro");
		wijnkelder[2].setOmschrijving("Licht, soepel en fruitig");
		wijnkelder[2].setRegio("Puglia");
		wijnkelder[2].setServeerTip("Gegrild vlees");
		
			
		wijnkelder[3] = new Wijn("Château Palmer 3eme Grand Cru", "Rood", "Frankrijk", 2002, 13.5);
		wijnkelder[3].setDruivenras("Bordeaux");
		wijnkelder[3].setOmschrijving("Complex, krachtig en vol");
		wijnkelder[3].setRegio("Bordeaux");
		wijnkelder[3].setServeerTip("Gevogelte");
		
		double duurste = 0;
		double goedkoopste = 9999999;
		String duursteLabel = null;
		String goedkoopsteLabel = null;
		int rood = 0;
		for (int i = 0; i < wijnkelder.length; i++) {
			if (wijnkelder[i].getAdviesPrijs() > duurste) {
				duurste = wijnkelder[i].getAdviesPrijs();
				duursteLabel = wijnkelder[i].getLabel();
			}
			
			if (wijnkelder[i].getAdviesPrijs() < goedkoopste) {
				goedkoopste = wijnkelder[i].getAdviesPrijs();
				goedkoopsteLabel = wijnkelder[i].getLabel();
			}
			
			if (wijnkelder[i].getKleur().equals("Rood")) {
				rood++;
			}
		}
		
		System.out.println("** Duurste fles:");

		System.out.println(duursteLabel);
		
		System.out.println("** Goedkoopste fles:");
		
		System.out.println(goedkoopsteLabel);
		
		System.out.println("** Aantal flessen rode wijn: ");
		
		System.out.println(rood);
		
		System.out.println("** Suggestie(s) bij gevogelte:");
		
		for (int i = 0; i < wijnkelder.length; i ++) {
			if (wijnkelder[i].getServeerTip().equals("Gevogelte")) {
				System.out.println(wijnkelder[i].getLabel());
				System.out.println();
			}
		}
		
		System.out.println(wijnkelder[0].toString());
		
	}
}