package projectElements;

/**
 * 
 * @author Bryan Dang
 * @date June 2, 2015
 * 
 */

//This class takes in a String password and converts it into
//a new password using a Caesar cipher
//TODO Make a GUI for this
//TODO Make the values that can be inputed more exclusive
public class CipherMaker {

	private String original;
	private String encrypted;
	private String decrypted;
	private static final int caesarShift = 3;

	//Constructor for CipherMaker
	public CipherMaker(String passwordIn) {
		original = passwordIn; //Sets original to the input
		encrypted = createCipher(original);
		decrypted = decryptCipher(original);
	}

	//This method returns a string where each character has been shifted
	//three spaces
	public String createCipher(String input) {
		String retVal = "";
		for (int index = 0; index < input.length(); index++) {
			int tempInt = input.charAt(index) + caesarShift;
			if (tempInt > 122) {
				tempInt -= 90;
			}
			char tempChar = (char) tempInt;
			retVal += tempChar;
		}
		return retVal;
	}

	//This method returns a string where each character has been shifted
	//backward three spaces
	public String decryptCipher(String input) {
		String retVal = "";
		for (int index = 0; index < input.length(); index++) {
			int tempInt = input.charAt(index)- caesarShift;
			if (tempInt < 33) {
				tempInt += 90;
			}
			char tempChar = (char) tempInt;
			retVal += tempChar;
		}
		return retVal;
	}

	//Returns the changed password
	public String getCipher() {
		return encrypted;
	}

	//Returns the changed password
	public String getDecryption() {
		return decrypted;
	}

	public static void main(String[]args) {
		System.out.println("From Github to local repository");
		System.out.println("From local repository to Github");
	}
}

