package javaConcepts;

public class SingletonClass {
	
private SingletonClass() {
		
	}
	
	private static SingletonClass obj = new SingletonClass();
	
	/*static {
		obj = new SingletonClass();
	}*/
	
	
	
	public static SingletonClass getInstance() {
		return obj;
	}
	
	public void methodInSingleton() {
		System.out.println("You successfully accessed method in Singleton class");
	}

}
