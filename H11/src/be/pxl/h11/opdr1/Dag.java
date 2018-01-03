package be.pxl.h11.opdr1;

public enum Dag {
	MAANDAG(false), DINSDAG(false), WOENSDAG(false), DONDERDAG(false), VRIJDAG(false), ZATERDAG(true), ZONDAG(true);
	
	private boolean weekend;

	private Dag (boolean weekend) {
		this.weekend = weekend;
	}
	

	public String toString() {
		String hulp = "door de week";
		if (weekend) {
			hulp = "in het weekend";
		}
		return name() + " is dag nr " + (ordinal()+1) + " " + hulp;
	}


}
