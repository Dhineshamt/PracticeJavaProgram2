package logicalPrograms;

import java.util.Scanner;

public class FibnacciSeries {

	 public static int fibonacci(int n) {
	        int n1=0,n2=1,n3=0;
	        for(int i=1; i<n; i++){
	        	System.out.print(n3+" ");
	             n3 = n1+n2;
	             n1 = n2;
	              n2 = n3;	              
	        }
	        return  n3;
	    }


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        scanner.close();
	        System.out.println(fibonacci(n));
	    }

}
