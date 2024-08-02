package test.t240705;

import java.util.Scanner;

public class T_02 {
	public static void main(String[] args) {
		/*
		 * 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		 * EX.
		 * 주민번호를 입력하세요(- 포함) : 132456-2123456
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		
		String IdNumber = sc.next();
		char gender = IdNumber.charAt(7);
		
		
//		if(gender==1 || gender==3) {
//			System.out.println("남자입니다.");
//		}else
//		{
//			System.out.println("여자입니다.");
//		}
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
	}

}
