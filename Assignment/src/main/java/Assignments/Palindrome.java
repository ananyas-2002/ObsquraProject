package Assignments;

public class Palindrome {
	public static void checkpalindrome(String str) {
		String original=str;
		String reverse="";
		for(int i=original.length()-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		if(original.equalsIgnoreCase(reverse)) {
			System.out.println("Given string "+original+" "+"is palindrome");
		}
		else {
			System.out.println("Given String "+original+" "+"is not palindrome");
		}
	}
	public static void main(String[] args) {
		
		checkpalindrome("Java");
		checkpalindrome("Malayalam");

	}

}
