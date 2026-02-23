package Assignments;

public class Bank {
	
	private int pin;	
	public void setpin(int pin) {
		
		this.pin=pin;
	}
	public boolean validatepin() {
		
		if(pin==1001 || pin==1234 || pin==1212) {
			
			return true;
			
		}
		else {
			return false;
		}
		
	}

}
