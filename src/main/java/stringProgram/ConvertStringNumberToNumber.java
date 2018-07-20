package stringProgram;

public class ConvertStringNumberToNumber {

	public static void main(String[] args) {
		String name = "752";
		int sum = 0;
		
		//Convert string to char array. This will help to separate each character
		char[] charArray = name.toCharArray();
		
		/*Ascii of 0 is 48. Subtracting ascii of other number will help get that number. For ex: ascii of 7 is 55.
		 	expected no = ascii of expected no - ascii of 0 = 55-48 = 7*/
		int asciiOfZero = (int) '0';
		
		//integer variable to store ascii value of character
		int asciiOfChar = 0;
		int convertedNumber = 0;
		
		//Run for each loop for every character in charArray 
		for(char eachChar: charArray) {
			
			//get ascii value of char (number)
			asciiOfChar = (int) eachChar;
			
			/*Converting the character to number. Ascii of 0 is 48. Subtracting ascii of other number with ascii of zero 
			 * will help get the expected number. 
			 * For ex: ascii of 7 is 55.
		 	 *expected no = ascii of expected no - ascii of 0 = 55-48 = 7*/
			convertedNumber = asciiOfChar - asciiOfZero;
			
			
			
			/*Perform below formula to form the expected number. 
			  Ex: Iteration 1:  each = '7'. charAscii = 55. sum = (0*10) + 7 = 7
			 	  Iteration 2:  each = '5'. charAscii = 53. sum = (7*10) + 5 = 75
			 	  Iteration 3:  each = '2'. charAscii = 50. sum = (75*10)+ 2 = 752	*/ 
			sum = (sum*10) + convertedNumber;
		}
		
		System.out.println(sum);

	}

}
