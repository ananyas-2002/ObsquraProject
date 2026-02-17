package compiletimepolymorphism;

public class Checkpolymorphism {
	public void findsum(int a,int b) {
		int sum=a+b;
		System.out.println("Sum of two numbers= "+sum);
	}
	public void findsum(int a,int b,int c) {
		int d=a+b+c;
		System.out.println("Sum of three numbers= "+d);
		
	}

	public static void main(String[] args) {
		Checkpolymorphism ch=new Checkpolymorphism();
		ch.findsum(6, 4);
		ch.findsum(8, 2, 9);
	}

}
