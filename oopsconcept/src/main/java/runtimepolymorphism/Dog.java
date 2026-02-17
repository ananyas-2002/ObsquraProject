package runtimepolymorphism;

public class Dog extends Animal {
	public void breed(String a) {
		System.out.println("In Dog class dog breed: "+a);
		super.breed("Cat"); //to call parent class Animal method using super keyword
	}

	public static void main(String[] args) {
		
		Dog obj=new Dog();
		obj.breed("Shitzu");
		Animal object=new Dog();
		object.breed("German Shepard");
		

	}

}
