package Assignments;

public class HraPf extends Employeebascipay {
	double hra;
	double pf;
	public void calculate() {
		hra=0.05*super.basicpay;
		pf=0.2*super.basicpay;
	}

}
