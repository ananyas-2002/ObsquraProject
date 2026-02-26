package exception;

public class ThrowException {

	public static void main(String[] args) {
		
		int age=15;
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		
		else {
			throw new ArithmeticException("Not eligible for Voting VotingException");
		}
		
		/*
		try {
		    throw new Exception("VotingAgeException");
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		}
		*/

	}

}
