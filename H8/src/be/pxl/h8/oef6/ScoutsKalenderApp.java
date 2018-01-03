package be.pxl.h8.oef6;


import java.util.Scanner;

public class ScoutsKalenderApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Datum moment1 = new Datum();
		moment1.setMaand(2);
		System.out.println(moment1.getMaandNaam());
		
		System.out.println("geef het nummer van de mmaand in: ");
		moment1.setMaand(keyboard.nextInt());
		
		System.out.println("Geef het jaartal in: ");
		moment1.setJaar(keyboard.nextInt());
		
		System.out.println("Geef een dagnummer in: ");
		int dag = keyboard.nextInt();
		
		keyboard.nextLine();
		
		int[] actDag = new int [10];
		String[] actNaam = new String[10];
		
		int count = 0;
		
		while (dag != 0) {
			
			System.out.println("Geef de activiteit in: ");
			String activiteit = keyboard.nextLine();
			
			actDag[count] = dag;
			actNaam[count] = activiteit;
			
			count++;
			
			System.out.println("Geef een dagnummer in: ");
			dag = keyboard.nextInt();
			
			keyboard.nextLine();
			
		}
		moment1.drukKalender(actDag, actNaam);
		
		keyboard.close();
	}
}