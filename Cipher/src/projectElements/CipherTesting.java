package projectElements;

import static org.junit.Assert.*;

import javax.swing.JTextField;
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
		System.out.println(test.getCipher());
		System.out.println(test.getDecryption());
		assertEquals(test.getDecryption(), "XYZ");
	}
	
	@Test
	public void test2() {
		CipherMaker test = new CipherMaker("BlueYellow2");
		System.out.println(test.getCipher());
		CipherMaker test2 = new CipherMaker("EoxhBhoorz5");
		System.out.println(test2.getDecryption());
	}
	
	

}
