package be.pxl.h5.exoef11;

public class H5ExOef11 {

	public static void main(String[] args) {
		int gradenCelcius;
		int gradenFahrenheit;
		
		for (gradenCelcius = -40; gradenCelcius <= 100; gradenCelcius += 10 ) {
			gradenFahrenheit = (int) ((9.0 / 5.0) * gradenCelcius + 32);
			
			System.out.println(gradenCelcius + "\t" + gradenFahrenheit);
		}

	}
}