package be.pxl.h10.oef2;

public class TreinReis extends Reis {
	private boolean nationaal;
	String specificatie;
	private String[] specificatieBinnenland = { "IC", "IR", "L", "P" };
	
	public TreinReis(String bestemming) {
		this(bestemming, 5.0, true, "IC");
	}

	public TreinReis(String bestemming, double prijs, boolean nationaal, String specificatie) {
		super(bestemming, prijs);
		setNationaal(nationaal);
		setSpecificatie(specificatie);
		
	}

	public void setNationaal(boolean nationaal) {
		this.nationaal = nationaal;
	}

	public void setSpecificatie(String specificatie) {
		this.specificatie = specificatie;
		if (this.nationaal) {
			int count = 0;
			for (int i = 0; i < this.specificatieBinnenland.length; i++) {
				if (this.specificatie.equals(specificatieBinnenland[i])) {
					count++;
					i = 999999999;
				}
			}
			if (count == 0) {
				this.specificatie = this.specificatieBinnenland[0];
			}
		}
	}

	public boolean isNationaal() {
		return nationaal;
	}

	public String getSpecificatie() {
		return specificatie;
	}
	
	@Override
	public void print() {
		String nationaal = "Internationale";
		super.print();
		if (this.nationaal) {
			nationaal = "Nationale";
		}
		System.out.println(nationaal + " treinreis (" + this.specificatie + ")");
	}
	
	
}
