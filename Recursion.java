import java.util.Scanner;
public class StringReverse {

	static String reversedString = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stringToReverse;
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		
		stringToReverse = read.next();
		
		reverseString(stringToReverse);
		
		System.out.println("The reversed string: " + reversedString);

		
	}
	
	public static void reverseString(String theSentence) {
		
		String sentenceSubString;
		char lastCharOfString;
		
		if (theSentence.length() > 0) {
			
			sentenceSubString = theSentence.substring(0, theSentence.length()-1);
			reverseString(sentenceSubString);
			
			lastCharOfString = theSentence.charAt(theSentence.length()-1);
			reversedString = String.valueOf(lastCharOfString) + reversedString; 
		}
		
	}

}
