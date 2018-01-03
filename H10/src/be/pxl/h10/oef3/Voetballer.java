package be.pxl.h10.oef3;

public class Voetballer extends Sporter {
	private String club;
	private String opstelling;
	private static String[] opstellingArray = { "middenvelder", "aanvaller", "verdediger", "onbekend" };

	public Voetballer(String naam, String voornaam) {
		this(naam, voornaam, "onbekend", "onbekend");
	}

	public Voetballer(String naam, String voornaam, String club, String opstelling) {
		super(naam, voornaam);
		setSport("voetbal");
		setClub(club);
		setOpstelling(opstelling);
	}

	public void setClub(String club) {
		this.club = club;
	}

	public void setOpstelling(String opstelling) {
		for (int i = 0; i < opstellingArray.length; i++) {
			if (opstelling.toLowerCase().equals(opstellingArray[i])) {
				this.opstelling = opstelling.toLowerCase();
				i = 999999999;
			} else {
				this.opstelling = opstellingArray[3];
			}
		}
	}

	public String getClub() {
		return club;
	}

	public String getOpstelling() {
		return opstelling;
	}

	public static String[] getOpstellingArray() {
		return opstellingArray;
	}

	@Override
	public void print() {
		super.print();
		System.out.print("club: " + getClub() + " ");
		System.out.println("opstelling: " + getOpstelling());
	}
}