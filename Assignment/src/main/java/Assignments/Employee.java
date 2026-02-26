package Assignments;

public abstract class Employee {
	
	double paymentperhour;
	public Employee(double paymentperhour) {
		this.paymentperhour=paymentperhour;
	}
	public abstract double calculatesalary();

}
