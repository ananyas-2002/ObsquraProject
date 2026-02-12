package stringmethods;

public class stringbuilderclass {

	public static void main(String[] args) {
		
				// 1.reverse()
				StringBuilder s1=new StringBuilder("hello");
				s1.reverse();
				System.out.println("Reverse of string: "+s1);
				//2.append()
				StringBuilder s2=new StringBuilder("Hello ");
				s2.append("World");
				System.out.println("Conctenated string: "+s2);
				//3.insert()
				StringBuilder s3=new StringBuilder("Hello ");
				s3.insert(2,"world");
				System.out.println("Inserted string: "+s3);
				//4.delete()
				StringBuilder s4=new StringBuilder("Hello");
				s4.delete(1,3);
				System.out.println("Deleted string: "+s4);
				//5.replace()
				StringBuilder s5=new StringBuilder("Hello");
				s5.replace(1,3,"world");
				System.out.println("Replace String: "+s5);

	}

}
