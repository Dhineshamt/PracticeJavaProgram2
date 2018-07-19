package stringProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateChars {

	public static void main(String...args) {
		
		String dupString = "Hello";
		
		char[] charArray = dupString.toCharArray();
		
		Map<Character, Integer> duplicates = new HashMap<>();
		
		for(char each: charArray) {
			if(duplicates.containsKey(each)) {
				duplicates.put(each, duplicates.get(each)+1 );
			}			
			else
				duplicates.put(each, 1);
		}
		
		
		//Implementation using keySet() method. keySet() method will return keys in the map as Set	
		System.out.println("Implemenation using keyset");
		Set<Character> keys = duplicates.keySet();		
		for(Character key: keys) {
			if(duplicates.get(key) > 1) {
				System.out.println(key+":"+ duplicates.get(key));
			}
		}
		
		//Implementation using entrySet() method. entrySet() method will return both key and value as Set.
		System.out.println("Implemenation using entryset");
		Set<Map.Entry<Character, Integer>> entryset = duplicates.entrySet();		
		for(Map.Entry<Character, Integer> entry: entryset) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			
		}
		
		
	}

}
