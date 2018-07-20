/* This program explains Object UpCasting and downcasting. */

package objectCasting;

public class Cat extends AnimalClass {

	public void eat() {
		System.out.println("Cat is eating");		
	}
	
	public void meow() {
		System.out.println("Cat is meowing");
	}
	
	public static void main(String[] args) {
		
		AnimalClass animal = new Cat();
		System.out.println("Cat object is upcasted to animal");
		animal.eat();  				//This will print "Cat is eating"
		//animal.meow();               -> This will throw compiler error. because, object of Cat is upcasted to animal
										//and animal has no meow method.
									
		
		System.out.println("animal object reference is downcasted to Cat object");
		((Cat) animal).meow();    //This will not throw compiler error and print "Cat is meowing". Becasue, animal object
								  //reference downcasted to Cat.
	}
}
