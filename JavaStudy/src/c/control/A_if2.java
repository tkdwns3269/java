package c.control;

import java.util.Scanner;

public class A_if2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//나이를 입력받아
		//13세 이하: 어린이
		//13세 초과: 19세 이하 : 청소년
		//19세 초과: 성인
		
		//나이를 입력: xx
		//xx세는 xxx에 속합니다.
		
//		System.out.print("나이를 입력: ");
//		int age = sc.nextInt();
//		if(age<=13) {
//			System.out.println(age +"세는 어린이에 속합니다.");
//		} else if(age<=19) {
//			System.out.println(age+ "세는 청소년에 속합니다.");
//		} else {
//			System.out.println(age+ "세는 성인에 속합니다.");
//		}
//		sc.close();
		
		//성별을 (m/f)(대소문자 상관x)로 입력받아 남학생인지 여학생인지
		//출력하는 프로그램을 작성하세요
		
		//성별(m/f) : X
		//여학생입니다 / 남학생입니다 / 잘못입력하셨습니다.
		
//		System.out.print("성별(m/f) : ");
//		char gender = sc.next().charAt(0);
//		if(gender=='m' || gender == 'M') {
//			System.out.println("남학생입니다.");
//		} else if(gender=='f' || gender == 'F') {
//			System.out.println("여학생입니다.");
//		} else {
//			System.out.println("잘못입력하셨습니다.");
//			return; //함수를 끝낸다.
//		}
		
		//정수(양수)를 입력받아
		//짝수인지 홀수인지 출력하는 프로그램을 작성해라.
		
		//정수 입력 : xx
		//짝수다 / 홀수다/ 양수가 아닙니다.
		
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		if(num >0 && num % 2 == 0) {
			System.out.println("짝수다");
		} else if(num > 0 && num % 2 == 1) {
			System.out.println("홀수다");
		} else {
			System.out.println("양수가 아닙니다.");
		}
		
	}

}
