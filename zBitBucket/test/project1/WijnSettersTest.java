package project1;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class WijnSettersTest {
	private Wijn wijn;
	
	@Before
	public void setup() {
		wijn = new Wijn("Wine Complet", "Rood", "Frankrijk");
	}
	
	@Test
	public void testSetLand() {
		wijn.setLand("Chili");
		assertEquals("Chili", wijn.getLand());
	}
	
	@Test
	public void testSetLandWordtOnbekendIndienOngeldigLand() {
		wijn.setLand("Nederland");
		assertEquals("Onbekend", wijn.getLand());
	}
	
	@Test
	public void testSetNaam() {
		wijn.setNaam("YAW");
		assertEquals("YAW", wijn.getNaam());
	}
	
	@Test
	public void testSetOmschrijving() {
		String omschrijving = "Ruikt naar natte hond.";
		wijn.setOmschrijving("Ruikt naar natte hond.");
		assertEquals(omschrijving, wijn.getOmschrijving());		
	}
	
	@Test
	public void testSetDruivenras() {
		wijn.setDruivenras("Pinot gris");
		assertEquals("Pinot gris", wijn.getDruivenras());
	}
	
	@Test
	public void testSetKleur() {
		wijn.setKleur("Wit");
		assertEquals("Wit", wijn.getKleur());
	}
	
	@Test
	public void testSetKleurOngeldigGeeftRood() {
		wijn.setKleur("Blauw");
		assertEquals("Rood", wijn.getKleur());
	}
	
	@Test
	public void testSetRegio() {
		wijn.setRegio("Chablis");
		assertEquals("Chablis", wijn.getRegio());
	}
	
	@Test
	public void testSetServeertip() {
		wijn.setServeerTip("Mango");
		assertEquals("Mango", wijn.getServeerTip());
	}
	
	@Test
	public void testSetJaargang() {
		wijn.setJaargang(1962);
		assertEquals(1962, wijn.getJaargang());
	}
	
	@Test
	public void testSetJaargangVoor1950Geeft1950() {
		wijn.setJaargang(1949);
		assertEquals(1950, wijn.getJaargang());
	}
	
	@Test
	public void testSetJaargangNaHuidigJaarGeeftHuidigJaar() {
		wijn.setJaargang(LocalDate.now().getYear() + 1);
		assertEquals(LocalDate.now().getYear(), wijn.getJaargang());
	}
	
	@Test
	public void testSetAlcoholPercentage() {
		wijn.setAlcoholPercentage(15.3);
		assertEquals(15.3, wijn.getAlcoholPercentage(), 0);
	}
	
	@Test
	public void testSetAlcoholPercentageNegatiefGeef0() {
		wijn.setAlcoholPercentage(-1.0);
		assertEquals(0.0, wijn.getAlcoholPercentage(), 0);
	}

//	@Test
//	public void testSetAlcoholPercentageBovenMaxGeeftMax() {
//		wijn.setAlcoholPercentage(Wijn.MAX_ALCOHOLPERCENTAGE + 0.1);
//		assertEquals(Wijn.MAX_ALCOHOLPERCENTAGE, wijn.getAlcoholPercentage(), 0);
//	}

}
