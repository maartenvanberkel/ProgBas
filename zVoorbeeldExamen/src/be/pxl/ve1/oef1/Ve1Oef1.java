package be.pxl.ve1.oef1;

import java.util.Scanner;

import javax.xml.transform.Templates;

public class Ve1Oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String arrayNeerslag[] = new String[7];
		int arrayTemperatuur[] = new int[7];
		int laagsteTemperatuur = 999999999;
		int opgeteldeTemperatuur = 0;
		double gemiddeldeTemperatuur = 0;
		int dagenVeelRegen = 0;
		int dagen = 0;
		String uitstap;
		boolean overvloed = false;

		for (int dag = 0; dag < 7; dag++) {
			System.out.println("Geef de neerslag in: ");
			String neerslag = keyboard.next();

			if (!neerslag.equals("overvloed")) {

				System.out.println("Geef de temperatuur in: ");
				int temperatuur = keyboard.nextInt();
				
				dagen++;

				arrayNeerslag[dag] = neerslag;
				arrayTemperatuur[dag] = temperatuur;

				opgeteldeTemperatuur = opgeteldeTemperatuur + temperatuur;
				gemiddeldeTemperatuur = (double) opgeteldeTemperatuur / (dag + 1);

				if (temperatuur < laagsteTemperatuur) {
					laagsteTemperatuur = temperatuur;
				}
				if (neerslag.equals("veel")) {
					dagenVeelRegen++;
				}
			} else {
				dag = 8;
				overvloed = true;
			}
		}

		if (overvloed) {
			System.out.println("Het gaat niet door.");
		} else {
			if (laagsteTemperatuur >= 15 && laagsteTemperatuur > (gemiddeldeTemperatuur * 0.2) && dagenVeelRegen == 0) {
				System.out.println("We gaan op tweedaagse.");
			} else {
				System.out.println("We gaan op daguitstap. ");
			}
		}

		System.out.printf("%5s %20s %20s \n", "dag", "temperatuur", "neerslag");
		for (int i = 0; i < dagen; i++) {
			System.out.printf("%5d %20d %20s \n", (i + 1), arrayTemperatuur[i], arrayNeerslag[i]);
		}

		keyboard.close();
	}
}