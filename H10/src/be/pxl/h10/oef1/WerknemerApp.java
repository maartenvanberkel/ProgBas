package be.pxl.h10.oef1;

public class WerknemerApp {

	public static void main(String[] args) {
		Werknemer galier1 = new Werknemer("obelix", "de Galier");
		Werknemer galier2 = new Werknemer("de Galier", "Asterix", "romeinenkiller", 1);
		Manager baas1 = new Manager("Caesar", "Julius", "keizer", 1);
		

		baas1.print();
		
		System.out.println();
		System.out.println(Werknemer.getAantal());
		System.out.println(Manager.getAantal());
		
		System.out.println(baas1.getProcAandeelManagers());
		System.out.println(baas1.getSalaris());
		System.out.println(galier2.getSalaris());
	}
}