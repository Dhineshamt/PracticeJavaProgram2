package stringProgram;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class FindMaxOccurCharInString {

	public static void main(String[] args) {
		
		String input = "hello";
		
		char[] charArray = input.toCharArray();
		
		Map<Character, Integer> chars = new HashMap<>();
		
		for(char eachChar: charArray) {
			if(chars.containsKey(eachChar)) {
				chars.put(eachChar, chars.get(eachChar)+1);
			}
			else
				chars.put(eachChar, 1);
		}
		
		Set<Character> keys = chars.keySet();
		
		int max=0; char maxChar = 0;
		
		for(Character eachKey: keys) {
			if(chars.get(eachKey) > max) {
				max = chars.get(eachKey);
				maxChar = eachKey;
			}
		}
		
		System.out.println(max +":"+ maxChar);

	}

}
