package numbersProgram;

import java.util.Scanner;

public class SumOfEachDigitInNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int eachDigit = 0;
		int sum = 0;
		while(number != 0) {			
			eachDigit = number %10;			
			number = number/10;
			sum = sum + eachDigit;
		}
		
		System.out.println(sum);

	}

}
