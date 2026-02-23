package Assignments;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();
		
		System.out.print("Enter Pin Number: ");
		int pinnumber=sc.nextInt();
		b.setpin(pinnumber);           			//setting pin
		
		if(b.validatepin()) {					//validate pin
			System.out.println("Pin Verified Successfully. You can Proceed further");
		}
		else {
			System.out.println("*Entered Pin is Wrong. Access denied*");
		}
		
		sc.close();

	}

}
