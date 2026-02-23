package finalkeyword;

public class FinalChild extends FinalParent{
	
	//public void sum(int a,int b) {   //cannot override final method from parent class ie FinalParent
		
		
	//}

	public static void main(String[] args) {
		 FinalChild fc=new FinalChild();
		 fc.sum(6, 4);   //we can call parent class method but cannot override it

	}

}
