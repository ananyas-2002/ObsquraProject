package hierarchicalinheritance;

public class Daughter extends Father {
	public void demo() {
		System.out.println("Inside Daughter class");
	}

	public static void main(String[] args) {
		Daughter obj=new Daughter();
		obj.demo();
		obj.show();
		// TODO Auto-generated method stub

	}

}
