package exception;

public class ThrowsException {

	public static void main(String[] args) throws VotingException {
		
		int age=15;
		if(age>=18) {
			System.out.println("Eligible for Voting");
		}
		else {
			throw new VotingException("Age is not eligible");
		}
	}

}
