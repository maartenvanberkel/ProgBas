package be.pxl.h5.exoef01;

import java.util.Scanner;

public class H5ExOef01 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out
				.println("Geef de temperatuur weergegeven in graden Celcius in om om te zetten naar graden Fahrenheit:");
		double gradenCelcius = keyboard.nextDouble();

		double gradenFahrenheit = gradenCelcius * (9.0 / 5.0) + 32;

		System.out.println(gradenCelcius + " graden Celcius is gelijk aan " + gradenFahrenheit + " graden Fahrenheit.");

		keyboard.close();
	}
}