package Assignments;

import java.util.Scanner;

public class HDFC implements Rbi{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		HDFC obj=new HDFC();
		System.out.print("Enter Deposit Amount: ");
		double amount=sc.nextDouble();
		System.out.print("Enter Duration: ");
		int duration=sc.nextInt();
		
		System.out.println("Amount getting after depositing for"+" " +duration+" "+"years: "+obj.recurringdeposit(amount, duration));
		
		sc.close();
	}

	@Override
	public double recurringdeposit(double amount, int duration) {
		double maturityamount=amount+(amount*intrestrate*duration);
		return maturityamount;
	}

}
