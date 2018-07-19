package numbersProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		
		Set<Integer> distinct = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		
		for(Integer each: numbers) {
			if(!distinct.add(each)) {
				duplicate.add(each);
				System.out.println(each);
			}			
		}
		
		

	}

}
