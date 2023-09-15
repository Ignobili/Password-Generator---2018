package izdinsky;

import java.util.Random;

public class GenereratePassword {
	
	
	
	protected static char[] givePassword(int length) {
		
	
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$";
		String numbers = "1234567890";		
		String combinedChars = capitalLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[length];
		
		password[0] = capitalLetters.charAt(random.nextInt(capitalLetters.length()));
		password[1] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));		
			
		
		for(int i = 4; i<length; i++) {
				
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		
		return password;
	}

}
