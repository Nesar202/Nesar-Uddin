package Package1;

public class TestBook extends Book {

	public static void main(String[] args) {
		
		Book b = new Book();
		
		System.out.println("Enter the Book Name: ");
		b.setBookName("Java");
		System.out.println(b.getBookName());
		
		System.out.println("Enter the Book Price: ");
		b.setBookPrice(500);
		System.out.println(b.getBookPrice());
		
		System.out.println("Enter the Author Name: ");
		b.setAuthorName("Einstein");
		System.out.println(b.getAuthorName());
			

	}

}
