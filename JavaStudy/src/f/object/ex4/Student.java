package f.object.ex4;

//이름 나이 수학점수 영어점수 국어점수를 데이터로 가지고 있는 개체를 만들어라
//데이터는 직접 접근을 허용하지 않고 모두 간접적으로 set/get 을 해줄 수 있도록 작성해라
//모든 데이터를 매개변수로 받아 초기화하면서 객체를 생성할 수 있는 생성자를 작성

public class Student {
	//필드영역(데이터)
	private String name;
	private int age;
	private int mathScore;
	private int enScore;
	private int krScore;
	
	//생성자영역
	public Student() {} //기본생성자
	// Alt + Shift + S 하고 O 누르면 생성 가능
	public Student(String name, int age, int mathScore, int enScore, int krScore) {
		this.name = name;
		this.age = age;
		this.mathScore = mathScore;
		this.enScore = enScore;
		this.krScore = krScore;
	}
	
	public String toScore() {
		return "이름 :" + this.name + "나이 :" + this.age + 
				"수학점수 :" + mathScore + "영어점수 :" + enScore + "국어점수 :" + krScore;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		if(age < 1) {
			this.age = 1;
			return; //메소드 종료
		}
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setMathScore(int mathScore) {
		if(mathScore < 0) {
			this.mathScore = 0;
			return;
		}
		this.mathScore = mathScore;
	}
	public int getMathScore() {
		return this.mathScore;
	}
	public void setEnScore(int enScore) {
		if(enScore < 0) {
			this.enScore = 0;
			return;
		}
		this.enScore = enScore;
	}
	public int getEnScore() {
		return this.enScore;
	}
	public void setKrScore(int krScore) {
		if(krScore < 0) {
			this.krScore = 0;
			return;
		}
		this.krScore = krScore;
	}
	public int getKrScore() {
		return this.krScore;
	}
	
	public double getEvg() {
		double evg = (this.krScore + this.enScore + this.mathScore) / 3.0;
		return evg;
	}
	
	public void printEvg() {
		System.out.println(this.getName() + "님의 평균 :" + this.getEvg());
	}
	
}
