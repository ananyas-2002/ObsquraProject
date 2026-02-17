package superkeyword;

public class Car_Method_Invoke extends Vehicle_Method_Invoke{
	
	public void display_colour(String colour) {
		super.display_colour("Yellow");
		System.out.println("This car colour is"+" "+colour);
	}

	public static void main(String[] args) {
		Car_Method_Invoke c=new Car_Method_Invoke();
		c.display_colour("Red");

	}

}
