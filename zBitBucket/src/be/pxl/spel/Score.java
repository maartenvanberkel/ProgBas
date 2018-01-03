package be.pxl.spel;

public class Score {
	public final static int MAX_SCORE = 5;
	private int waarde;

	public Score(int waarde) {
		setWaarde(waarde);
	}

	public Score(Score[] scores) {
		double total = 0;
		int average = 0;
		for (int i = 0; i < scores.length; i++) {
			total = total + scores[i].waarde;
		}
		average = (int) (total / scores.length);
		setWaarde(average);
	}

	private void setWaarde(int waarde) {
		if (waarde > MAX_SCORE) {
			this.waarde = MAX_SCORE;
		} else {
			if (waarde < 0) {
				this.waarde = 0;
			} else {
				this.waarde = waarde;
			}
		}
	}

	public String getStars() {
		StringBuilder stars = new StringBuilder("");

		for (int i = 0; i < this.waarde; i++) {
			stars.append("*");
		}

		return stars.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + waarde;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		if (waarde != other.waarde)
			return false;
		return true;
	}
}