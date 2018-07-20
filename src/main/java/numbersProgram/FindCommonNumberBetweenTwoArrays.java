package numbersProgram;

import java.util.ArrayList;
import java.util.List;

public class FindCommonNumberBetweenTwoArrays {

	public static void main(String[] args) {
		/*
		 * Psuedo code
		 * 
		 * Declare two integer arrays Get first element for first array compare first
		 * element from first array to all the elements in second array. If it is
		 * matching, store it in a list. else continue to next comparison.
		 */

		int[] array1 = { 1, 2, 3, 4 };
		int[] array2 = { 1, 2, 3, 5 };
		List<Integer> commonNumbers = new ArrayList<>();
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					commonNumbers.add(array1[i]);
					break;
				}

			}
		}
		System.out.println(commonNumbers);
	}

}
