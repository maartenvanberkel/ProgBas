package be.pxl.h10.oef3;

import be.pxl.h10.voorbeeld.Persoon;

public class Sporter extends Persoon {

	private String sport;
	private static int teller;

	{
		teller++;
	}

	public Sporter(String naam, String voornaam) {
		this(naam, voornaam, "onbepaald");
	}

	public Sporter(String naam, String voornaam, String sport) {
		super(naam, voornaam);
		setSport(sport);
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getSport() {
		return sport;
	}

	public static int getTeller() {
		return teller;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.sport);
	}
}