package superkeyword;

public class Cat extends Animal {
	
	int legnumber=5;
	public void display() {
		System.out.println("Cat class variable is"+" "+legnumber);
		System.out.println("Parent class variable is"+" "+super.legnumber);
	}

	public static void main(String[] args) {
		
		Cat c=new Cat();
		c.display();

	}

}
