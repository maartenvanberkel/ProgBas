package be.pxl.h10.voorbeeld;

public class Student extends Persoon {
	private int leerkrediet;
	private String studentennummer;
	private String opleiding;
	private static int aantal;
	
	{
		aantal++;
	}
	
	public Student() {
		this("onbekend", "onbekend");
	}
	
	public Student(String naam, String voornaam) {
		this(naam, voornaam, "15999999", "“XXX”");
	}
	
	public Student(String naam, String voornaam, String studentennummer, String opleiding ) {
		super(naam, voornaam);
		setStudentennummer(studentennummer);
		setOpeiding(opleiding);
		setLeerkrediet(140);
	}
	
	public Student(Student leerling) {
		this(leerling.getNaam(), leerling.getVoornaam(), leerling.getStudentennummer(), leerling.getOpleiding());
		this.leerkrediet = leerling.getLeerkrediet();
	}
	
	public void setLeerkrediet(int leerkrediet) {
		this.leerkrediet = leerkrediet;
		controleLeerkrediet();
	}
	
	public void wijzigLeerkrediet(int leerkrediet) {
		this.leerkrediet += leerkrediet;
		controleLeerkrediet();
	}
	
	public void setStudentennummer(String studentennummer) {
		this.studentennummer = studentennummer;
	}
	
	public void setOpeiding(String opleiding) {
		this.opleiding = opleiding;
	}

	public int getLeerkrediet() {
		return leerkrediet;
	}

	public String getStudentennummer() {
		return studentennummer;
	}
	
	public String getOpleiding() {
		return opleiding;
	}
	
	private void controleLeerkrediet() {
		if (this.leerkrediet > 140) {
			this.leerkrediet = 140;
		} else {
			if (this.leerkrediet < 0) {
				this.leerkrediet = 0;
			}
		}
	}
	
	
	public void print() {
		super.print();
		System.out.println("studentennummer: " + studentennummer);
		System.out.println("opleiding: " + opleiding);
		System.out.println("leerkrediet: " + leerkrediet);
	}
	
	public static int getAantal() {
		return aantal;
	}
}
