package aggregation;

public class AggregationDemo2 {
	int x,y;
	AggregationDemo1 ag;  //entity reference 
	public void display(int x,int y,AggregationDemo1 ag) {
		this.x=x;
		this.y=y;
		this.ag=ag;
	}
	
	public void print() {
		System.out.println("Value of a is: "+ag.a);
		System.out.println("Value of b is: "+ag.b);
		System.out.println("Value of x is: "+x);
		System.out.println("Value of y is: "+y);
	}
	
	public static void main(String[] args) {
		
		AggregationDemo1 ad1=new AggregationDemo1();
		ad1.show(20,60);
		
		AggregationDemo2 ad2=new AggregationDemo2();
		ad2.display(30, 70, ad1);
		ad2.print();
		
		
		
	}

}
