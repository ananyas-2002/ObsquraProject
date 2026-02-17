package privateaccespecifier;

public class Book {
	private void bookname(String book) {
		System.out.println("Book name is "+book);
	}

	public static void main(String[] args) {
		Book b=new Book();
		b.bookname("Java");
		
	}

}
