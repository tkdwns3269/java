package test240709;

public class Product {
	//필드영역
	private String pName;
	private int price;
	private String brand;
	
	//생성자영역
	public Product() {} //기본생성자

	public Product(String pName, int price, String brand) {
		super();
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	
	public void information() {
		System.out.println("제품 : " + this.pName);
		System.out.println("가격 : " + this.price);
		System.out.println("브랜드 : " + this.brand);
	}
	
	public void setPName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getPName() {
		return this.pName;
	}
	
	public int getPrice() {
		return this.price;	
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	

}
