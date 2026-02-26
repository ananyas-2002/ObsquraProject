package exception;

public class Demo {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=10/0;
			//a[5]=10/2;
			//System.out.println(a[5]);
			//int x=5/0;
		}
		/*
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
		*/
		catch(Exception a) {
			
			System.out.println(a);
		}
	}

}
