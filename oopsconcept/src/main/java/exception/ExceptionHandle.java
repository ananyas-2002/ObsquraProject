package exception;

public class ExceptionHandle {
	
	public static void main(String[] args) {
		try {
			int a=10/0;
			System.out.println(a);
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("Exception: "+e);
		}
		
		
		finally {
			System.out.println("Printing finally");
		}

	}

}
