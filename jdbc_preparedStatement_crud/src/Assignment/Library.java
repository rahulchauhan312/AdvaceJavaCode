package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Library {
	List<Book> b1=new ArrayList<>();
	
    public void addBook(Book b) {
	  b1.add(b);
	}
	public void RemoveBook(int bookid) {
		for(Book b: b1)
		{
			if(b.getBookid() == bookid) {
				b1.remove(b);
				System.out.println("Book with Id" + bookid + "removed");
				return;
			}
		}
		System.out.println("Book with ID " +bookid +" not found in the library.");
	}
	public void DisplayBook() {
		for(Book b:b1)
		{
			System.out.println(b);
		}
	}
}