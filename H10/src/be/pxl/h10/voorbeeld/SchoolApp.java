package be.pxl.h10.voorbeeld;

public class SchoolApp {

	public static void main(String[] args) {
//		Persoon mens = new Persoon();
//		
//		Student leerling = new Student();
//		
//		Persoon pol = new Student();
//		
//
//		
//		leerling.setNaam("van Berkel");
//		leerling.setVoornaam("Maarten");
//		
//		leerling.setLeerkrediet(60);
//		leerling.wijzigLeerkrediet(11);
//		leerling.setStudentennummer("11700987");
//		leerling.setOpeiding("Toegepaste Informatica");
		

		
//		System.out.println(leerling.getVoornaam() + " " + leerling.getNaam());
//		System.out.println();
//		System.out.println("leerkrediet: " + leerling.getLeerkrediet());
		
//		mens.print();
		
//		leerling.print();
		
		
//      opdracht 5a
//		pol.setNaam("pot");
//		pol.setVoornaam("pol");
//		
//		pol.print();
		
//		opdracht5b		
//		Lector leerkracht = new Lector();		
//		leerkracht.setNaam("sdfds");
//		leerkracht.setPersooneelsnummer("ssd2321321");
//		leerkracht.print();
		
		
		Persoon mens1 = new Persoon();
		Persoon mens2 = new Persoon("van Berkel", "Maarten");
		
		Lector leerkracht1 = new Lector();
		Lector leerkracht2 = new Lector("Tans", "Heidi", 100, 3000);
		Lector leerkracht3 = new Lector("Tans", "Heidi", "123124", 100, 3000);
		
		Student leerling1 = new Student();
		Student leerling2 = new Student("van Berkel", "Maarten");
		Student leerling3 = new Student("van Berkel", "Maarten", "11700987", "Toegepaste Informatica");
		Student leerling4 = new Student(leerling1);
		
		
		System.out.println("aantal personen: " + Persoon.getAantal());
		System.out.println("aantal lectoren: " + Lector.getAantal());
		System.out.println("aantal studenten: " + Student.getAantal());
	}
	
}