/*Pseudo Code
 * Step 1: Get input    
 * 					-> Scanner input = new Scanner(System.in); String duplicate = input.nextLine();
 * Step 2: Pass duplicate string removeDuplicate() method to remove duplicates and store duplicates removed string in another string 
 * 					-> String outputString = removeDuplicateChars(duplicate);
 * Step 3: Write implementation for removeDuplicate() method by getting the argument 
 * 					-> private String removeDuplicate(String duplicate){}
 * Step 4: convert the duplicate string into an array. This will help separate each char and compare.
 *                	-> char[] chrArray = duplicate.toCharArray();
 * Step 5: Declare another string variable to store distinct string
 * 				 	-> String distinct ="";
 * Step 6: Run for loop for character in charArray.  ->  for(char eachChar: charArray)
 * 			What is the function to perform in each iteration and why?
 * 
 * 			What? -> Check the index of character in distinct string is == -1. If yes, add the character into distinct string. 
 * 					-> if(distinctString.indexOf() == -1){  distinctSting += eachChar}
 * 
 * 			Why? -> indexOf() method will return -1 value if the character we are looking in the string is not available.
 * 					Here, We are taking character from duplicate string and checking whether the character exist in distinct String.
 * 					If character exist in distinct string, indexOf() method will return a value more than 0. So, we will not add the
 * 					character to distinct string. If it is not exist in distinct string, the result will be -1. The, we will add the
 * 					character to distinct string.
 * 					If duplicate char exist, indexOf() will return value > 0. hence, that will char will not be added to distinct string
 * 
 * Step7: Return distinct string.
 * 
 */


package stringProgram;

import java.util.Scanner;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		String duplicate = input.nextLine();		
        System.out.println(removeDuplicateChars(duplicate));
    }
 
    private static String removeDuplicateChars(String sourceStr) {
        // Store encountered letters in this string.
        char[] chrArray = sourceStr.toCharArray();
        String targetStr = "";
 
        // Loop over each character.
        for (char value : chrArray) {
            // See if character is in the target
            if (targetStr.indexOf(value) == -1) {
                targetStr += value; // Use StringBuilder as shown below
            }
        }
        return targetStr;
    }

}

