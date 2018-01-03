package be.pxl.h8.opdr3;

public class Boek {
	private String isbn;
	private String titel;
	private int bladzijden;
	private Auteur auteur;
	
	public Boek() {
		this("onbekend", "onbekend", 0, new Auteur());
	}
	
	public Boek(String isbn, String titel, int bladzijden, Auteur auteur) {
		setIsbn(isbn);
		setTitel(titel);
		setBladzijden(bladzijden);
		setAuteur(auteur);
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public int getBladzijden() {
		return bladzijden;
	}
	public void setBladzijden(int bladzijden) {
		this.bladzijden = bladzijden;
	}
	public Auteur getAuteur() {
		return auteur;
	}
	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
	
	public void toonBoekGegevens() {
		StringBuilder tekst = new StringBuilder();
		
		tekst.append(String.format("%-15s : %s%n", "Auteur", auteur));
		tekst.append(String.format("%-15s : %s%n", "titel", titel));
		tekst.append(String.format("%-15s : %d%n", "bladzijden", bladzijden));
		tekst.append(String.format("%-15s : %s%n", "isbn", isbn));
		System.out.println(tekst.toString());
	}
}
