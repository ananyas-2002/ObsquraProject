package protectedaccespecifier;

public class Vehicle {
	protected void name() {
		System.out.println("Name is car");
	}

	public static void main(String[] args) {
		Vehicle obj=new Vehicle();
		obj.name();
		
	}

}
