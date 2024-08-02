package test240715.object1;

public class Student {
	//학생성적관리 프로그램을 만들고자한다.
	//학생 클래스를 정의해보자. Student class는 name(String), classRoom(int),
	//javaScore(double), sqlScore(double), practiceScore(double)값을 가진다.
	//각 필드데이터의 getter/setter, 기본생성자, 모든필드데이터를 초기화하는 생성자를 작성하고
	//또한 toString : 학생의 정보를 "xx반 xxx학생 xx점 xx점 xx점" 으로 정보를 반환하는 메소드 각 점수는 자바, sql, practice순으로 작성
	//	isPassed : 모든 점수가 50점 이상이면서 평균이 60점이상이면 true 아니면 false를 반환하는 메소드
	//	reTest : 학생의 모든 점수를 랜덤(1~100)으로 다시 부여하는 메소드 반환없음
	
	//필드
	//접근제한자 자료형 변수이름;
	private String name;
	private int classRoom;
	private double javaScore;
	private double sqlScore;
	private double practiceScore;
	
	
	//생성자
	public Student() {
		
	}



	public Student(String name, int classRoom, double javaScore, double sqlScore, double practiceScore) {
		
		this.name = name;
		this.classRoom = classRoom;
		this.javaScore = javaScore;
		this.sqlScore = sqlScore;
		this.practiceScore = practiceScore;
	}

	public String toString() {
		return this.classRoom + "반 " + this.name+"학생 " + this.javaScore + 
				"점 " + this.sqlScore + "점 " + this.practiceScore + "점 "; 
	}
	
	public double getAvg() {
		double sum = this.javaScore + this.practiceScore + this.sqlScore;
		return sum /3;
	}
	
	public boolean isPassed() {
		if(this.javaScore >=50 && this.sqlScore >= 50 && 
				this.practiceScore >= 50 && this.getAvg()>=60) {
			return true;
		}
		return false;
	}
	
	public void reTest() {
		this.setJavaScore(Math.random()*101);
		this.setPracticeScore(Math.random()*101);
		this.setSqlScore(Math.random()*101);
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getClassRoom() {
		return classRoom;
	}



	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}



	public double getJavaScore() {
		return javaScore;
	}



	public void setJavaScore(double javaScore) {
		this.javaScore = javaScore;
	}



	public double getSqlScore() {
		return sqlScore;
	}



	public void setSqlScore(double sqlScore) {
		this.sqlScore = sqlScore;
	}



	public double getPracticeScore() {
		return practiceScore;
	}



	public void setPracticeScore(double practiceScore) {
		this.practiceScore = practiceScore;
	}
	
	

}
