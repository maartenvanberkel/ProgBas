package be.pxl.h5.exoef03;

import java.util.Scanner;

public class H5ExOef03 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Wat is de lengte van het zwembad?:");
		double lengteZwembad = keyboard.nextDouble();

		System.out.println("Wat is de breedte van het zwembad?:");
		double breedteZwembad = keyboard.nextDouble();

		System.out.println("Wat is de diepte van het zwembad?:");
		double diepteZwembad = keyboard.nextDouble();

		double inhoudZwembad = lengteZwembad * breedteZwembad * diepteZwembad;
		int waterZwembad = (int) (inhoudZwembad * 0.98);
		int ontsmettingsmiddelZwembad = (int) (inhoudZwembad * 0.02);

		System.out.println("Voor een zwembad met een totale inhoud van " + inhoudZwembad + " kubieke meter moet er "
				+ waterZwembad + " liter water en " + ontsmettingsmiddelZwembad + " liter ontsmettingsmiddel in het zwembad.");

		keyboard.close();
	}
}