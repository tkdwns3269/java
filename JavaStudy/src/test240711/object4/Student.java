package test240711.object4;

public class Student {
	private String name;
	private String subject;
	private int score;
	
	
	
	//기본생성자
	public Student() {
	}
	
	//3개의 초기값을 받는 생성자
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
		
	}
	
	//student 클래스의 모든 필드 값들을 합쳐 반환
	public String inform() {
		return "이름 :" + this.name + "/ 과목 :" + this.subject + "/ 점수 :" + this.score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
