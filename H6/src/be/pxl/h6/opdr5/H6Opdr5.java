package be.pxl.h6.opdr5;

public class H6Opdr5 {

	public static void main(String[] args) {
		double voet = 3.2808399;
		
		for (double i = 1; i <= 20; i += 0.5) {
			
			double uitkomst = i * voet;
			System.out.printf("%5.2f \t %6.2f \n", i, uitkomst);
		}
	}
}