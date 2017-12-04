package be.pxl.h8.oef2;

public class Tijdstip {
	private int uren;
	private int minuten;
	private int seconden;

	public Tijdstip(int seconden) {
		this(0, 0, seconden);
	}

	public Tijdstip(int uren, int minuten, int seconden) {
		checkParameters(uren, minuten, seconden);

	}

	public Tijdstip(Tijdstip moment1) {
		this(moment1.uren, moment1.minuten, moment1.seconden);
	}

	public void checkParameters(int uren, int minuten, int seconden) {
		this.uren = uren;
		this.minuten = minuten;
		this.seconden = seconden;

		if (uren >= 24) {
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
		checkParameters(this.uren, this.minuten, this.seconden);
		this.uren = uren;

	}

	public void setMinuten(int minuten) {
		checkParameters(this.uren, this.minuten, this.seconden);
		this.minuten += minuten;
	}

	public void setSeconden(int seconden) {
		checkParameters(this.uren, this.minuten, this.seconden);
		this.seconden += seconden;

	}

	public void voegUrenToe(int uren) {
		checkParameters(this.uren, this.minuten, this.seconden);
		this.uren += uren;
	}

	public void voegUrenToe() {
		voegUrenToe(1);
	}

	public void voegMinutenToe(int minuten) {
		checkParameters(this.uren, this.minuten, this.seconden);
		this.minuten += minuten;
	}

	public void voegSecondenToe(int seconden) {
		checkParameters(this.uren, this.minuten, this.seconden);
		this.seconden += seconden;
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

	public String toStringTijd(boolean engels) {
		StringBuilder tekst = new StringBuilder();

		if (!engels) {
			tekst.append(this.getUren()).append(":");
			if (this.getMinuten() < 10) {
				tekst.append("0");
			}
			tekst.append(this.getMinuten()).append(" u");
		} else {
			if (this.getUren() < 12) {
				tekst.append(this.getUren()).append(":");
				if (this.getMinuten() < 10) {
					tekst.append("0");
				}
				tekst.append(this.getMinuten()).append(" AM");
			} else {
				int TijdelijkUren = this.getUren() - 12;
				tekst.append(TijdelijkUren).append(":");
				if (this.getMinuten() < 10) {
					tekst.append("0");
				}
				tekst.append(this.getMinuten()).append(" PM");
			}

		}
		if (tekst.toString().equals("0:00 AM")) {
			return "12:00 AM (midnight)";
		}
		if (tekst.toString().equals("0:00 PM")) {
			return "12:00 PM (noon)";
		}

		return tekst.toString();
	}

	public String toStringTechnisch() {
		StringBuilder tekst = new StringBuilder();

		if (this.getUren() >= 10) {
			tekst.append(this.getUren()).append(":");
			if (this.getMinuten() >= 10) {
				tekst.append(this.getMinuten()).append(":");
				if (this.getSeconden() >= 10) {
					tekst.append(this.getSeconden());
				} else {
					tekst.append("0").append(this.getSeconden());
				}
			} else {
				tekst.append("0").append(this.getMinuten()).append(":");
				if (this.getSeconden() >= 10) {
					tekst.append(this.getSeconden());
				} else {
					tekst.append("0").append(this.getSeconden());
				}
			}
		} else {
			tekst.append("0").append(this.getUren()).append(":");
			if (this.getMinuten() >= 10) {
				tekst.append(this.getMinuten()).append(":");
				if (this.getSeconden() >= 10) {
					tekst.append(this.getSeconden());
				} else {
					tekst.append("0").append(this.getSeconden());
				}
			} else {
				tekst.append("0").append(this.getMinuten()).append(":");
				if (this.getSeconden() >= 10) {
					tekst.append(this.getSeconden());
				} else {
					tekst.append("0").append(this.getSeconden());
				}
			}
		}
		return tekst.toString();
	}
}
