package Assignment;

public class Book{
	private int Bookid;
	private String BookName;
	private String Title;
	private String Author;
	public Book(int Bookid, String BookName, String Title, String Author) {
		this.Bookid=Bookid;
		this.BookName=BookName;
		this.Title=Title;
		this.Author=Author;
	}
	public int getBookid() {
		return Bookid;	}
	public void setBookid(int bookid) {
		Bookid = bookid;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String toString() {
		return "\nBook id is "+Bookid  +"\nBook name is "+BookName +"\nBook title is "+Title +"\nBook Author is " +Author +"\n"+"===============================";
	}
	
}
