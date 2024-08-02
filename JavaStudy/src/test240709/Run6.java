package test240709;

public class Run6 {
	public static void main(String[] args) {
		Book b1 = new Book("마녀와의 7일", "현대문학", "히가시노 게이고", 16920, 10.0);
		Book b2 = new Book("녹나무의 여신", "소미미디어", "히가시노 게이고", 16920, 10.0);
		Book b3 = new Book("인간 실격", "민음사", "다자이 오사무");
		
		
		
		b1.inform();
		System.out.println();
		b2.inform();
		System.out.println();
		b3.inform();
		
	}

}
