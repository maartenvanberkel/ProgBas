package be.pxl.h7.oef6;

public class H7Oef6 {

	public static void main(String[] args) {
		int tabel[][] = {{12, 4, 12, 9}, {14, 5, 9, 11}, {8, 9, 7, 12}, {7, 12, 11, 10}, {11, 18, 10, 14}};
		int laagstePunt[] = {20, 20, 20, 20};
		int gemiddelde[] = new int[4];
		int naam[] = new int[5];
		
		
		for (int kolom = 0; kolom < 4; kolom++) {
			for (int rij = 0; rij < 5; rij++) {
				if (tabel[rij][kolom] < laagstePunt[kolom]) {
					laagstePunt[kolom] = tabel[rij][kolom];
					naam[kolom] = rij;
				}
				gemiddelde[kolom] = gemiddelde[kolom] + tabel[rij][kolom];
			}
			gemiddelde[kolom] = gemiddelde[kolom] / naam.length;
		}	
		for (int i = 0; i < 4; i++) {
			int vaknummer = i + 1;
			System.out.println("Het laagste punt behaaldd voor vak " + vaknummer + " is " + laagstePunt[i] + " behaald door student " + (naam[i] + 1) + ". Het gemiddelde voor dit vak bedraagt " + gemiddelde[i]);
		}
	}
}