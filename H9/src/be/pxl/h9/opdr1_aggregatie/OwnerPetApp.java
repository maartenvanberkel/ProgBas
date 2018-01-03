package be.pxl.h9.opdr1_aggregatie;

public class OwnerPetApp {

	public static void main(String[] args) {
		Owner mens = new Owner("guido");
		Pet hond = new Pet("Blacky");
		
		mens.setPet(hond);
		
		System.out.println(mens.getPet().getName());
		
		Owner nieuweMens = new Owner("Jos");
		
		nieuweMens.setPet(hond);
		
		nieuweMens.getPet().setName("Korgan");
		
		System.out.println(nieuweMens.getPet().getName());
	}
}