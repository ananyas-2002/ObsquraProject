package Assignments;

public class Onseason extends Offseason{
	 public void discount(double amount) {
		 
		 double discountamount=amount*0.40;
		 double finalamount=amount-discountamount;
		 
		 System.out.println("Onseason Discount Amount(40%) : "+discountamount);
		 System.out.println("Final Amount : "+finalamount);
		 
		 super.discount(2000);
	 }

	public static void main(String[] args) {
		
		Onseason objon=new Onseason();
		objon.discount(3000);
		Offseason objoff=new Onseason();
		objoff.discount(1500);

	}

}
