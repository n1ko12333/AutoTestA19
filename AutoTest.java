package A19;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Klasse zum Testen von der Klasse Auto
 * @author Wang
 * @version 2016-03-29
 */
//git@github.com:n1ko12333/AutoTestA19.git
public class AutoTest {
	
	Auto a1;
	
	@Before
	public void beforeTest(){
		a1 = new Auto();
	}
	
	/**
	 * Testet ersten Konstruktor ohne Paramenter
	 */
	@Test
	public void testKonstruktor1(){
		a1 = new Auto();
		if(a1.getType() != "Ford")
			fail("fehlerhaft");
	}
	
	/**
	 * Testet zweiten Konstruktor mit Parameter
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testKonstruktor2(){
		a1 = new Auto(null, null, -200);
	}
	
	/**
	 * Testet Methode setType
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testSetType(){
		a1.setType("  ");
	}
	
	/**
	 * Testet Methode setFarbe
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testSetFarbe(){
		a1.setFarbe(null);
	}
	
	/**
	 * Testet Methode setLeistung
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testSetLeistung(){
		a1.setLeistung(-20);
	}
	
}