package be.pxl.h8.oef2wouter;

public abstract class Tijdstip {

	private int uren = 0;
	private int minuten = 0;
	private int seconden = 0;
	private boolean midnight = false;
	private boolean noon = false;

	Tijdstip(int uren, int minuten, int seconden) {
		checkParameters(uren, minuten, seconden);
	}

	Tijdstip(int seconden) {
		this(0, 0, seconden);
	}

	Tijdstip() {
		this(0, 0, 0);
	}

	public void checkParameters(int uren, int minuten, int seconden) {
		this.uren = uren;
		this.minuten = minuten;
		this.seconden = seconden;
		if (uren == 24 && minuten == 0) {
			midnight = true;
			uren -= 24;
		} else {
			if (uren == 12 && minuten == 0) {
				noon = true;
			}
		}
		if (uren > 24) {
			this.uren = uren - 24;
		}
		if (minuten >= 60) {
			this.uren += minuten / 60;
			this.minuten = minuten % 60;
		}
		if (seconden >= 60) {
			double totalSeconds = seconden;
			this.seconden = (int) (totalSeconds % 60);
			double totalMinutes = totalSeconds / 60;
			this.minuten += (int) (totalMinutes % 60);
			this.uren += (int) (totalMinutes / 60);
		}
	}

	public void setUren(int uren) {
		this.uren += uren;
		checkParameters(this.uren, this.minuten, this.seconden);
	}

	public void setMinuten(int minuten) {
		this.minuten += minuten;
		checkParameters(this.uren, this.minuten, this.seconden);
	}

	public void setSeconden(int seconden) {
		this.seconden += seconden;
		checkParameters(this.uren, this.minuten, this.seconden);
	}

	public void voegUrenToe(int uren) {
		this.uren += uren;
		checkParameters(this.uren, this.minuten, this.seconden);
	}

	public void voegMinutenToe(int minuten) {
		this.minuten += minuten;
		checkParameters(this.uren, this.minuten, this.seconden);
	}

	public void voegSecondenToe(int seconden) {
		this.seconden += seconden;
		checkParameters(this.uren, this.minuten, this.seconden);
	}

	public void voegUrenToe() {
		voegUrenToe(1);
	}

	public int getUren() {
		return uren;
	}

	public int getMinuten() {
		return minuten;
	}

	public int getSeconden() {
		return seconden;
	}

	public String resolve(int seconden) {
		String out = "";
		double totalSeconds = seconden;
		double seconds = totalSeconds % 60;
		double totalMinutes = totalSeconds / 60;
		double minutes = totalMinutes % 60;
		double hours = totalMinutes / 60;
		if ((int) hours > 0) {
			if (minutes >= 60) {
				hours++;
				minutes -= 60;
			}
			out = (int) hours + "h " + (int) minutes + "m " + (int) seconds + "s";
		} else {
			if (totalMinutes > 0) {
				out = (int) minutes + "m " + (int) seconds + "s";
			} else {
				out = (int) totalSeconds + "s";
			}
		}
		return out;
	}

	public String toStringTijd(boolean usTime) {
		StringBuilder sb = new StringBuilder();
		if (!usTime) {
			if (this.uren < 10 && this.minuten < 10) {
				sb.append("0" + this.uren + ":" + "0" + this.minuten + " u");
			} else {
				if (this.minuten < 10) {
					sb.append(this.uren + ":" + "0" + this.minuten + " u");
				} else {
					if (this.uren < 10) {
						sb.append("0" + this.uren + ":" + this.minuten + " u");
					} else {
						sb.append(this.uren + ":" + this.minuten + " u");
					}
				}
			}
		} else {
			int bla = this.uren - 12;
			if (bla >= 0) {
				if (bla < 10 && this.minuten < 10) {
					sb.append("0" + bla + ":" + "0" + this.minuten + " PM");
				} else {
					if (this.minuten < 10) {
						sb.append(bla + ":" + this.minuten + "0" + " PM");
					} else {
						sb.append(bla + ":" + this.minuten + " PM");
					}
				}
			} else {
				if (this.uren < 10 && this.minuten < 10) {
					sb.append("0" + this.uren + ":" + "0" + this.minuten + " AM");
				} else {
					if (this.minuten < 10) {
						sb.append(this.uren + ":" + this.minuten + "0" + " AM");
					} else {
						sb.append(this.uren + ":" + this.minuten + " AM");
					}
				}
			}
			if (midnight) {
				return "12:00 AM (midnight)";
			} else {
				if (noon) {
					return "12:00 PM (noon)";
				}

			}

		}
		return sb.toString();
	}

	public String toStringTechnisch() {
		StringBuilder sb = new StringBuilder();
		String h = Integer.toString(uren);
		String m = Integer.toString(minuten);
		String s = Integer.toString(seconden);
		if (this.uren < 10) {
			h = "0" + this.uren;
		}
		if (this.minuten < 10) {
			m = "0" + this.minuten;
		}
		if (this.seconden < 10) {
			s = "0" + this.seconden;
		}

		sb.append(h + ":" + m + ":" + s);
		return sb.toString();
	}
}