package test240709;

public class Book {
	//필드
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {
		this("미입력", "미정", "미입력", 0, 0);
	}

	public Book(String title, String publisher, String author, int price, double discountRate) {
		//this(title, publisher, author, 0, 0);
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}

	public Book(String title, String publisher, String author) {
		
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public void inform() {
		System.out.println("제목: "+ this.title);
		System.out.println(" 출판사 : " + this.publisher); 
		System.out.println(" 저자 : " + this.author);
		System.out.println(" 가격 : " + this.price);
		System.out.println(" 할인율 : " + this.discountRate + "%");
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getPublisher() {
		return this.publisher;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public double getDiscountRate() {
		return this.discountRate;
	}
	

}
