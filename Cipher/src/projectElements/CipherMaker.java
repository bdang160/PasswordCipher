package projectElements;

/**
 * 
 * @author Bryan Dang
 * @date June 2, 2015
 * 
 */

//This class takes in a String password and converts it into
//a new password using a Caesar cipher
public class CipherMaker {

	private String original;
	private String encrpyted;

	//Constructor for CipherMaker
	public CipherMaker(String passwordIn) {
		original = passwordIn; //Sets original to the input
		encrpyted = createCipher(original);
	}
	
	//This method returns a string where each character has been shifted
	//three spaces
	public String createCipher(String input) {
		String retVal = "";
		return retVal;
	}
	public static void main(String[]args) {
		System.out.println("From Github to local repository");
		System.out.println("From local repository to Github");
	}
}

