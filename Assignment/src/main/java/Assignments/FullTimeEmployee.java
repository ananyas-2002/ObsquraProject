package Assignments;

public class FullTimeEmployee extends Employee{

	public FullTimeEmployee(double paymentperhour) {
		super(paymentperhour);
	}

	public static void main(String[] args) {
		
		Contractor con=new Contractor(500,6);
		FullTimeEmployee emp=new FullTimeEmployee(500);
		System.out.println("Contractor salary: "+con.calculatesalary());
		System.out.println("Full Time Employee Salary: "+emp.calculatesalary());
		
		
	}

	@Override
	public double calculatesalary() {
		
		return paymentperhour*8;
	}

}
