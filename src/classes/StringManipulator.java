package classes;

public class StringManipulator {
	
	public static int stringLength(String str) {
		return str.length();
	}

	public static String evenChars(String str) {
		String even="";
		for (int i=1; i<str.length(); i+=2) 
			if (Character.isLetter(str.charAt(i))) 
				even+=str.charAt(i);
		
		return even;
	}

	public static String oddChars(String words) {
		String odd="";
		for (int i=0; i<words.length(); i+=2) 
			if (Character.isLetter(words.charAt(i))) 
				odd+=words.charAt(i);
				
		return odd;
	}

	public static int uppercaseCharCounter(String str) {
		int uppercaseCounter=0;
		for (int i=0; i<str.length(); i++) 
			if (Character.isUpperCase(str.charAt(i)))
				uppercaseCounter++;
			
		return uppercaseCounter;
	}

	public static int lowercaseCharCounter(String str) {
		int lowercaseCounter=0;
		for (int i=0; i<str.length(); i++) 
			if (Character.isLowerCase(str.charAt(i))) 
				lowercaseCounter++;
				
		return lowercaseCounter;
	}

	public static String nonLetterCharacters(String str) {
		String notLetters="";
		for (int i = 0; i < str.length(); i++) 
			if (!(Character.isLetter(str.charAt(i)))) 
				notLetters+=str.charAt(i);
				
		return notLetters;
	}
}
