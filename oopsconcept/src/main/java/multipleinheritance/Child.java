package multipleinheritance;

public class Child implements Parent1,Parent2{
	
	public void division(int c,int d ) {
		int div=c/d;
		System.out.println("Inside Child class division method division is: "+div);
		
	}

	public static void main(String[] args) {
		
		Child ch=new Child();
		ch.sum(6, 4);
		ch.multiplication(8, 2);
		ch.division(4, 2);

	}

	@Override
	public void multiplication(int x,int y) {
		int mul=x*y;
		System.out.println("Inside Parent2 class method multiplication is : "+mul);
		
	}

	@Override
	public void sum(int a,int b) {
		int add=a+b;
		System.out.println("Inside Parent1 class method sum is: "+add);
	}

}
