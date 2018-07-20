package logicalPrograms;

public class SwapNumberWithoutThirdVariable {

	public static void main(String[] args) {
		int x=10, y=20;
		
		System.out.println("Value of X before swap: "+x +" Value of Y before swap: "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Value of X after  swap: "+x +" Value of Y after  swap: "+y);

	}

}
