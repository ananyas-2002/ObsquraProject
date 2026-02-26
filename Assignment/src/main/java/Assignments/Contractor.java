package Assignments;

public class Contractor extends Employee{
 
	int workinghours;
	public Contractor(double paymentperhour,int workinghours) {
		
		super(paymentperhour);
		this.workinghours=workinghours;
	}


	@Override
	public double calculatesalary() {
    
		return paymentperhour*workinghours;
		
	}

}
