package javaConcepts;

public class SingletonImplementingClass {

	public static void main(String[] args) {
		SingletonClass instance = SingletonClass.getInstance();
		instance.methodInSingleton();

		SingletonClass instance2 = SingletonClass.getInstance();

		//Check whether two reference variables are referencing same object
		System.out.println(instance == instance2);
	}

}
