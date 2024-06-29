package Assignment;

public class LibraryDriver{
	public static void main(String[] args) {
		 Library library =f;new Library();

	        // Adding some books to the library
	        library.addBook(new Book(1, "To Kill a Mockingbird", "Harper Lee","Ram"));
	        library.addBook(new Book(2, "1984", "George Orwell", ""));
	        library.addBook(new Book(3, "Pride and Prejudice", "Jane Austen", ""));

	        // Display all books in the library
	        library.DisplayBook();

	        // Remove a book by ID
	        library.RemoveBook(3);

	        // Display all books after removal
	        library.DisplayBook();
	}
}
