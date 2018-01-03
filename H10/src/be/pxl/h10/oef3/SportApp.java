package be.pxl.h10.oef3;

public class SportApp {

	public static void main(String[] args) {
		Sporter[] sporters = new Sporter[10];

		sporters[0] = new Sporter("van Berkel", "Maarten", "zeilen");
		sporters[1] = new Sporter("Bammens", "Brecht", "zwemmen");
		sporters[2] = new Sporter("Dries", "jan", "duiken");
		sporters[3] = new Sporter("Nouri", "Sabir", "Boksen");
		sporters[4] = new Sporter("Vanhoudt", "Bart", "zwemmen");
		sporters[5] = new Voetballer("Kaminski", "Reini", "FC de Kampioenen", "aanvaller");
		sporters[6] = new Voetballer("Goktas", "Ilkin", "FC de Kampioenen", "middenvelder");
		sporters[7] = new Voetballer("Wijnen", "Johannes", "FC de Kampioenen", "middenvelder");
		sporters[8] = new Voetballer("Kenis", "Wouter", "FC de Kampioenen", "verdediger");
		sporters[9] = new Voetballer("Broux", "Caro", "FC de Kampioenen", "verdediger");



		int countX = 0;
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		System.out.println("Overzicht sporters (behalve voetbal)");
		System.out.println();

		for (int i = 0; i < sporters.length; i++) {

			if (!(sporters[i] instanceof Voetballer)) {
				sporters[i].print();
			} else {
				if (countX == 0) {
					System.out.println();
					System.out.println("Overzicht voetballers volgens opstelling");
					System.out.println();
					countX++;
				}
				if (Voetballer.getOpstellingArray()[1].equals(((Voetballer) sporters[i]).getOpstelling())) {
					if (count1 == 0) {
						System.out.println("***aanvaller***");
						System.out.println();
					}
					count1++;
					sporters[i].print();
				} else {
					if (Voetballer.getOpstellingArray()[2].equals(((Voetballer) sporters[i]).getOpstelling())) {
						if (count2 == 0) {
							System.out.println();
							System.out.println("***verdediger***");
							System.out.println();
						}
						count2++;
						sporters[i].print();
					} else {
						if (Voetballer.getOpstellingArray()[0].equals(((Voetballer) sporters[i]).getOpstelling())) {
							if (count0 == 0) {
								System.out.println();
								System.out.println("***middenvelder***");
								System.out.println();
							}
							count0++;
							sporters[i].print();
						} else {
							if (count3 == 0) {
								System.out.println();
								System.out.println("***onbepaald***");
								System.out.println();
							}
							count3++;
							sporters[i].print();
						}
					}
				}
			}
		}
	}
}