package abstractuse;

public class AbstractChild extends AbstractParent{
	
	public void demo() {
		System.out.println("Inside Abstract child class method");
	}

	public static void main(String[] args) {
		
		AbstractChild obj=new AbstractChild();
		obj.demo();
		obj.display();
		obj.show();
		
		
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		
		System.out.println("Inside display method");
		// TODO Auto-generated method stub
		
	}

}
