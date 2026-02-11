package stringmethods;

public class Firstclass {

	public static void main(String[] args) {
		String s1="java";    
		System.out.println(s1.length());				//length()
		String s2="java";
		String s3="Java";
		String s4="java";
		System.out.println(s2.equals(s3));				//equals()
		System.out.println(s2.equals(s4));
		String s5="flower";
		String s6="Flower";
		System.out.println(s5.equalsIgnoreCase(s6));		//equalIgnoreCase()
		String s7="beautiful";
		System.out.println(s7.toUpperCase());			//toUpperCase()
		String s8="BE HAPPY";
		System.out.println(s8.toLowerCase());       	//toLowerCase()
		String s9="vindhya";
		System.out.println(s9.startsWith("vi"));		//startsWith()
		String s10="vindhya";
		System.out.println(s10.endsWith("a"));			//endsWith()
		String s11="Life";
		System.out.println(s11.charAt(2));				//charAt()
		int a=200;
		System.out.println(String.valueOf(a));			//valueOf()
		
		

	}

}
