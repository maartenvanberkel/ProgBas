package be.pxl.h11.oef1;

public enum Munt {
	TWEEEURO, EENEURO, VIJFTIGCENT, TWINTIGCENT, TIENCENT, VIJFCENT, TWEECENT, EENCENT;
	
	public int getWaarde(Munt munt) {
			
		
		switch (munt) {
		case TWEEEURO:
			return 200;
		case EENEURO:
			return 100;
		case VIJFTIGCENT:
			return 50;
		case TWINTIGCENT:
			return 20;
		case TIENCENT:
			return 10;
		case VIJFCENT:
			return 5;
		case TWEECENT:
			return 2;
		case EENCENT:
			return 1;
			
		}
		return 0;
	}
}
