package stringmethods;

public class Stringbufferclass {

	public static void main(String[] args) {
		// 1.reverse()
		StringBuffer s1=new StringBuffer("hello");
		s1.reverse();
		System.out.println("Reverse of string: "+s1);
		//2.append()
		StringBuffer s2=new StringBuffer("Hello ");
		s2.append("World");
		System.out.println("Conctenated string: "+s2);
		//3.insert()
		StringBuffer s3=new StringBuffer("Hello ");
		s3.insert(2,"world");
		System.out.println(s3);
		//4.delete()
		StringBuffer s4=new StringBuffer("Hello");
		s4.delete(1,3);
		System.out.println(s4);
		//5.replace()
		StringBuffer s5=new StringBuffer("Hello");
		s5.replace(1,3,"world");
		System.out.println(s5);
		

	}

}
