package hierarchicalinheritance;

public class Son extends Father{
	
	public void display() {
		System.out.println("Inside Son class");
	}

	public static void main(String[] args) {
		Son obj=new Son();
		obj.show();
		obj.display();
		// TODO Auto-generated method stub

	}

}
