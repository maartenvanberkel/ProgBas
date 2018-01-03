package be.pxl.h8.oef5;

public class AutoApp {

	public static void main(String[] args) {
		Auto mobiel1 = new Auto("Peugeot", "206+", 2010, "grijs", 150);
		Auto mobiel2 = new Auto();
		Auto mobiel3 = new Auto(mobiel1);

		mobiel1.setMaxSnelheid(300);

		Auto[] autos = new Auto[3];
		autos[0] = mobiel1;
		autos[1] = mobiel2;
		autos[2] = mobiel3;
		int aantal = 0;
		double percentage = 0;

		for (int i = 0; i < autos.length; i++) {
			System.out.println(autos[i].print());
			if (autos[i].getMaxSnelheid() < 180) {
				aantal++;
			}
			percentage = (double) aantal / autos.length * 100;

		}
		System.out.printf("%.1f%% van de auto's haalt de maximum snelheid niet. %n", percentage);
		
		System.out.println("aantal objecten = " + Auto.getAantal());
	}

}
