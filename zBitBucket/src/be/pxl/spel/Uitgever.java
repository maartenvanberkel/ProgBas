package be.pxl.spel;

import java.time.LocalDate;

public class Uitgever {
	private String naam;
	private int jaarOprichting;
	private String hoofdkantoor;
	private String website;

	public Uitgever(String naam, String hoofdkantoor, int jaarOprichting) {
		setNaam(naam);
		setHoofdkantoor(hoofdkantoor);
		setJaarOprichting(jaarOprichting);
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setJaarOprichting(int jaarOprichting) {
		if (jaarOprichting > LocalDate.now().getYear()) {
			this.jaarOprichting =  0;
		} else {
			this.jaarOprichting = jaarOprichting;
		}
	}

	public void setHoofdkantoor(String hoofdkantoor) {
		this.hoofdkantoor = hoofdkantoor;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getNaam() {
		return naam;
	}

	public int getJaarOprichting() {
		return jaarOprichting;
	}

	public String getHoofdkantoor() {
		return hoofdkantoor;
	}

	public String getWebsite() {
		return website;
	}

	@Override
	public String toString() {
		return "Uitgever{naam='" + naam + "', jaarOprichting=" + jaarOprichting + ", hoofdkantoor='" + hoofdkantoor
				+ "', website='" + website + "'}";
	}

}
