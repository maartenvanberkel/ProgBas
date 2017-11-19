package be.pxl.h5.exoef15;

import java.util.Scanner;

public class H5ExOef15 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een maximum waarde van de vermenigvuldigingstafel: ");
		int maxWaarde = keyboard.nextInt();

		System.out.println("Geef een vermenigvuldiger in: ");
		int vermenigvuldiger = keyboard.nextInt();

		int i;
		int resultaat;

		for (i = 0; i <= maxWaarde; i++) {
			resultaat = i * vermenigvuldiger;
			System.out.println(i + " x " + vermenigvuldiger + " = " + resultaat);
		}
		keyboard.close();
	}
}