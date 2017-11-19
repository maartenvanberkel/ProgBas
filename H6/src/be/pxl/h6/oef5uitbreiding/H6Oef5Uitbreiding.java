package be.pxl.h6.oef5uitbreiding;

import java.text.DecimalFormat;

public class H6Oef5Uitbreiding {

	public static void main(String[] args) {
		double getalD = 0;
		double dec;

		System.out.printf("%20s %-20s %20s %20s\n", "1. gewoon", "2. links", "3. rechts (met nul)", "4. rechts met 3 dec");

		for (int count = 1; count < 10; count++) {
			if (count <= 5) {
				getalD = getalD * 10 + count;
			} else {
				dec = count;
				for (int j = 6; j)
			}
			System.out.printf("%20.6f %-20f %020.6f %20.3f\n", getalD, getalD, getalD, getalD);
		}
	}

}
