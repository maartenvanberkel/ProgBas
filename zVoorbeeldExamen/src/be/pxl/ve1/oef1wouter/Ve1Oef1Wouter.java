package be.pxl.ve1.oef1wouter;

import java.util.ArrayList;
import java.util.Scanner;

public class Ve1Oef1Wouter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

	//	int temp = 0;
		int dagen = 0;
		int avgTemp = 0;
		int dag = 1;
		int lowTemp = 100;
		boolean overvloed = false;
		boolean tweeDaagse = true;
		boolean avgTempBool = false;
		String neerslag = "";

		int[] temperatures = new int[7];
		ArrayList<String> precipitation = new ArrayList<String>();

		while ((dagen <= 6) && !overvloed) {
			
			System.out.println("Temperatuur?");
			temperatures[dagen] = in.nextInt();
			
			System.out.println("Neerslag? (veel, matig, overvloed, geen)");
			neerslag = in.next();

			precipitation.add(neerslag);
			
			if (neerslag.equals("overvloed")) {
				overvloed = true;
			}


			dagen++;
		}
		
		for (int i = 0; i < temperatures.length; i++) {
			avgTemp += temperatures[i];
			if (temperatures[i] < lowTemp) {
				lowTemp = temperatures[i];
			}
			if (temperatures[i] < 15) {
				tweeDaagse = false;
			}
		}
		
		for (int i = 0; i < precipitation.size(); i++) {
			if (precipitation.get(i).equals("veel")) {
				tweeDaagse = false;
			}
		}
		double twentyPercentAvgTemp = ((double)avgTemp / dagen) / 100 * 20;
		if (lowTemp > twentyPercentAvgTemp) {
			avgTempBool = true;
		}
		
//		System.out.println("Laagste temp: " + lowTemp);
//		System.out.println("Gemiddelde temp: " + ((double)avgTemp / dagen));
//		System.out.println("20% gemiddelde temp: " + ((double)avgTemp / dagen) / 100 * 20);
		
		System.out.printf("%15s %15s %15s \n", "dag", "temperatuur", "neerslag");
		for (int i = 0; i < dagen; i++) {
			System.out.printf("%15d %15d %15s \n", i + 1, temperatures[i], precipitation.get(i));
		}
		if (overvloed) {
			System.out.println("Het gaat niet door.");
		} else {
			if (tweeDaagse == false || avgTempBool == false) {
				System.out.println("1 daagse, feelsokman");
			} else {
				System.out.println("twee daagse hype! it feels so good");
			}
		}
		in.close();
	}
}