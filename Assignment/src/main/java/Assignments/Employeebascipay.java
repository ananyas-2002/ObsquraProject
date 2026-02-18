package Assignments;

import java.util.Scanner;

public class Employeebascipay {
	double basicpay;
	double deduction;
	double bonus;
	public void getdetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic pay: ");
		basicpay=sc.nextDouble();
		System.out.println("Enter Deduction: ");
		deduction=sc.nextDouble();
		System.out.println("Enter Bonus: ");
		bonus=sc.nextDouble();
		
		sc.close();
		
	}

}
