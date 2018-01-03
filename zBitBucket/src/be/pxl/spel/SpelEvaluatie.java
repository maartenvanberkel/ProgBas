package be.pxl.spel;

public class SpelEvaluatie {
	private String motivatie;
	private Spel spel;
	private Speler speler;
	private Score score;
	
	
	public SpelEvaluatie(Spel spel, Speler speler) {
		this.spel = spel;
		this.speler = speler;
	}


	public Spel getSpel() {
		return spel;
	}


	public Speler getSpeler() {
		return speler;
	}
	
	public Score getScore() {
		return score;
		
	}

	public String getMotivatie() {
		return motivatie;
	}
	
	public boolean maakBeoordeling(int score, String motivatie) {
		if (this.motivatie == null) {
			this.motivatie = motivatie;
			this.score = new Score(score);
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean isGeldig() {
		if (spel != null && speler != null && score != null && speler.getLeeftijd() >= spel.getMinimumLeeftijd()) {
			return true;
		}
		return false;
	}
	
	
}
