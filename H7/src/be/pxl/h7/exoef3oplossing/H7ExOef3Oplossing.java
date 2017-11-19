package be.pxl.h7.exoef3oplossing;

import java.util.Scanner;

public class H7ExOef3Oplossing {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String[] woorden = { "nul ", "een ", "twee ", "drie ", "vier ", "vijf ", "zes ", "zeven ", "acht ", "negen " };
		int getal;
		int cijfer;
		StringBuilder hulp = new StringBuilder();
		System.out.println("geef een positief geheel getal in");
		getal = keyboard.nextInt();
		while (getal >= 10) {
			cijfer = getal % 10;
			hulp.insert(0, woorden[cijfer]);
			getal = getal / 10;
		}
		hulp.insert(0, woorden[getal]);
		System.out.println(hulp);
		keyboard.close();
	}
}