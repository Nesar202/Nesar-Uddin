package Package1;

public class TestBook extends Book {

	public static void main(String[] args) {
		Book b = new Book();
		b.setBookPrice(300);
		System.out.println(b.getBookPrice());
		b.setAuthorName("History");
		System.out.println(b.getAuthorName());
			

	}

}
