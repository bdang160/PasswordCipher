package projectElements;

/**
 * 
 * @author Bryan Dang
 * @date June 2, 2015
 * 
 */

//This class takes in a String password and converts it into
//a new password using a Caesar cipher
//TODO Allow spaces to be used
public class CipherMaker {

	private String original;
	private String encrypted;
	private String decrypted;
	private static final int caesarShift = 3;

	//Sections of acceptable ASCII values that can be used

	//Characters "!, ", #, $, %, &"
	private static final int section1Start = 33;
	private static final int section1End = 38;
	private static final int section1Length = 6;

	//Numbers 0 - 9
	private static final int section2Start = 48;
	private static final int section2End = 57;
	private static final int section2Length = 10;

	//Capital Letters A-Z
	private static final int section3Start = 65;
	private static final int section3End = 90;
	private static final int section3Length = 26;

	//Lowercase letters a-z
	private static final int section4Start = 97;
	private static final int section4End = 122;
	private static final int section4Length = 26;


	//Constructor for CipherMaker
	public CipherMaker(String passwordIn) throws IllegalArgumentException {
		//Iterates through the length of the string
		for (int index = 0; index < passwordIn.length(); index++) {
			//Checks to see if the password has the appropriate characters
			if ((passwordIn.charAt(index) >= section1Start &&
					passwordIn.charAt(index) <= section1End) ||
					(passwordIn.charAt(index) >= section2Start &&
					passwordIn.charAt(index) <= section2End) ||
					(passwordIn.charAt(index) >= section3Start &&
					passwordIn.charAt(index) <= section3End) ||
					(passwordIn.charAt(index) >= section4Start &&
					passwordIn.charAt(index) <= section4End) 
					) {
				original = passwordIn; //Sets original to the input
			}
			else
				throw new IllegalArgumentException();
		}


		
		encrypted = createCipher(original);
		decrypted = decryptCipher(original);


	}

	//This method returns a string where each character has been shifted
	//three spaces
	private String createCipher(String input) {
		String retVal = ""; //String to be returns

		//Iterates through the length of the string
		for (int index = 0; index < input.length(); index++) {
			//Finds the ASCII value of the current character
			//Adds three to that
			int org = input.charAt(index);
			int tempInt = input.charAt(index) + caesarShift;
			
			//Changing the character based on which section the character was
			//originally in
			if (section1Start <= org && org <= section1End) {
				if (tempInt > section1End) {
					tempInt -= section1Length;
				}
			}
			if (section2Start <= org && org <= section2End) {
				if (tempInt > section2End) {
					tempInt -= section2Length;
				}
			}
			if (section3Start <= org && org <= section3End) {
				if (tempInt > section3End) {
					tempInt -= section3Length;
				}
			}
			if (section4Start <= org && org <= section4End) {
				if (tempInt > section4End) {
					tempInt -= section4Length;
				}
			}
			
			char tempChar = (char) tempInt; //Converts int to char
			retVal += tempChar; //Adds the character to the return string
		}
		return retVal;
	}

	//This method returns a string where each character has been shifted
	//backward three spaces
	private String decryptCipher(String input) {
		String retVal = "";
		for (int index = 0; index < input.length(); index++) {
			int org = input.charAt(index);
			int tempInt = input.charAt(index)- caesarShift;
			
			if (section1Start <= org && org <= section1End) {
				if (tempInt < section1Start) {
					tempInt += section1Length;
				}
			}
			if (section2Start <= org && org <= section2End) {
				if (tempInt < section2Start) {
					tempInt += section2Length;
				}
			}
			if (section3Start <= org && org <= section3End) {
				if (tempInt < section3Start) {
					tempInt += section3Length;
				}
			}
			if (section4Start <= org && org <= section4End) {
				if (tempInt < section4Start) {
					tempInt += section4Length;
				}
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

