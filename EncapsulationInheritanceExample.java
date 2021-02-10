package Assignment4;
import java.util.Scanner;

class Book{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	
	
	
	public Book(int bookNo, String title, String author, float price) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public int getBookNo() {
		
		return bookNo;
		
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;

	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String toString()
    {
        return "The details of the book are: " + bookNo + ", " + title + ", " +  author + ", " + price;
    }
}
class EngineeringBook extends Book{
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public EngineeringBook(int bookNo, String title, String author, float price, String category) {
		super(bookNo, title, author, price);
		this.category = category;
	}
	
	
}
class EncapsulationInheritanceExample{
	public static void main(String[] args) {
		Book b=new Book(3,"JAVA","Herbert Schildt",3000);
		System.out.println(b);
		EngineeringBook eb=new EngineeringBook(3,"JAVA","Herbert Schildt",3000,"Engineering");
		}
}