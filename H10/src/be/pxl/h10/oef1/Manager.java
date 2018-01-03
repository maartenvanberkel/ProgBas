package be.pxl.h10.oef1;


public class Manager extends Werknemer {
	private int bonus;
	private static int aantal;
	
	{
		aantal++;
	}
	
	public Manager(String naam, String voornaam, String functie, int salaris) {
		this(naam, voornaam, functie, salaris, 50);
	}
	
	public Manager(String naam, String voornaam, String functie, int salaris, int bonus) {
		super(naam, voornaam, functie, salaris);
		setBonus(bonus);
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}
	
	@Override
	public int getSalaris() {
		return super.getSalaris() + bonus;
	}
	
	public static int getAantal() {
		return aantal;
	}
	
	public double getProcAandeelManagers() {
		return Math.round((double) getAantal() / super.getAantal() * 10000) / 100.0;
	}
}
