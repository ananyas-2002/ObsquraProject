package Assignments;

public class Totalsalary extends HraPf {
	double totalsalary;
	
	public void total() {
	
		totalsalary=basicpay+hra-pf-deduction+bonus;
		System.out.println("Basic Pay: "+basicpay);
		System.out.println("Deduction: "+deduction);
		System.out.println("HRA: "+hra);
		System.out.println("PF: "+pf);
		System.out.println("Bonus: "+bonus);
		System.out.println("Total salary: "+totalsalary);
	}

	public static void main(String[] args) {
		Totalsalary obj=new Totalsalary();
		obj.getdetails();
		obj.calculate();
		obj.total();
	}

}
