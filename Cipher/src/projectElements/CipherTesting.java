package projectElements;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * 
 * @author Bryan Dang
 * @date June 2, 2015
 * 
 */

//This classes tests the CipherMaker class
public class CipherTesting {

	@Test
	public void test1() {
		CipherMaker test = new CipherMaker("ABC");
		assertEquals(test.getCipher(), "DEF");
		assertEquals(test.getDecryption(), ">?@");
	}
	
	@Test
	public void test2() {
		CipherMaker test = new CipherMaker("BlueYellow2");
		System.out.println(test.getCipher());
		CipherMaker test2 = new CipherMaker("Eoxhhoorz5");
		System.out.println(test2.getDecryption());
	}
	
	

}
