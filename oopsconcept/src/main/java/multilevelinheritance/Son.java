package multilevelinheritance;

public class Son extends Father {
	
	public void child() {
		System.out.println("Inside Son class");
	}

	public static void main(String[] args) {
		Son obj=new Son();
		obj.grandpa();
		obj.appa();
		obj.child();

	}

}
