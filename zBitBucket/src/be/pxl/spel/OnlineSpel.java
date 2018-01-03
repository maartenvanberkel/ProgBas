package be.pxl.spel;

public class OnlineSpel extends Spel {
	private String genre;
	private String url;
	
	public OnlineSpel(String naam, Uitgever uitgever) {
		super(naam, uitgever);
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getGenre() {
		return genre;
	}

	public String getUrl() {
		return url;
	}

	@Override
	public String toString() {
		return "OnlineSpel " + super.toString() + ", genre=" + this.genre + ", url=" + this.url + "}";
	}
}
