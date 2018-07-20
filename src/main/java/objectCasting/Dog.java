/* This program explains object upcasting of interface */
package objectCasting;

public class Dog implements AnimalInterface{
	
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	public void bark() {
		System.out.println("Dog is barking");
	}

	public static void main(String[] args) {
		AnimalInterface animal = new Dog();
		
		System.out.print("Dog object is upcasted to animal.Hence, ");
		animal.eat();
		//obj.bark();        -> This code will through compiler error. Because, Dog's object referred (upcasted) to AnimalInterface
		
		System.out.print("animal object reference is downcasted to Cat object. Hence, ");
		((Dog) animal).bark();    //This will not throw compiler error and print "Dog is barking". because, animal object
								  //reference downcasted to Dog.

	}

	

}

/*Output: Dog is eating*/
