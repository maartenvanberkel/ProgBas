package be.pxl.h6.oef5;

public class H6Oef5 {
	public static void main(String[] args) {
		double getalD = 0;

		System.out.printf("%20s %-20s %20s %20s\n", "1. gewoon", "2. links", "3. rechts (met nul)", "4. rechts met 3 dec");

		for (int count = 1; count < 10; count++) {
			getalD = getalD * 10 + count;

			System.out.printf("%20.6f %-20f %020.6f %20.3f\n", getalD, getalD, getalD, getalD);
		}
	}
}
