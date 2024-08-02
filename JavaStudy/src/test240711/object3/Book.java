package test240711.object3;

public class Book {
	private String title;
	private String genre;
	private String author;
	private int number;

	public Book() {}

	public Book(String title, String genre, String author, int bookNumber) {
		super();
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.number = bookNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int bookNumber) {
		this.number = bookNumber;
	}
	
	public String toString() {
		return "제목: " + this.title + " 장르: " + this.genre + " 저자: "+ this.author + " 책번호: "+ this.number;
		
		
	}
}
