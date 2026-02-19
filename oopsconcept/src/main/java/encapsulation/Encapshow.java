package encapsulation;

public class Encapshow {

	private int a;
	private int b;
	
	public void settermathod(int a,int b) {  //setter method for setting data
		this.a=a;
		this.b=b;
	}
    public void gettermethod() {		//getter method for getting the seted  data
	System.out.println("Value of a: "+a);
	System.out.println("Value of b: "+b);
}
}
