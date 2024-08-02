package c.control;

import java.util.Scanner;

public class B_switch1 {
	/*
	 * switch 문도 if 문과 동일하게 조건문이다.
	 * 
	 * 다만, if 문과의 "차이점"이라면 >if 문은 조건식을 자유롭게 기술할 수 있다. switch 문은 동등비교 밖에 수행되지 않는다.
	 * >실행할 구문만 실행하고 자동으로 빠져나올 수 없다.(직접 빠져나오도록 설정이 필요하다.)
	 * 
	 * [표현식] switch(비교대상(정수 , 문자, 문자열)){ 
	 * case 값1 : 실행코드; 
	 * case 값2 : 실행코드; 
	 * case 값3 : 실행코드; 
	 * case 값... : 실행코드
	 * ; ... 
	 * default: 위에 값들이 모두 일치하지 않았을 때 실행하는 코드; }
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 
		 * 정수를 입력받아 1일 경우 "빨간색입니다." 2일 경우 "파란색입니다." 3일 경우 "초록색입니다." 다른 경우 모두
		 * "잘못입력하셨습니다."
		 */

//		int num;
//
//		System.out.print("정수 입력 : ");
//		num = sc.nextInt();
//
//		switch (num) {
//		case 1:
//			System.out.println("빨간색입니다.");
//			break;
//		case 2:
//			System.out.println("파란색입니다.");
//			break;
//		case 3:
//			System.out.println("초록색입니다.");
//			break;
//		default:
//			System.out.println("잘못입력하셨습니다.");
//		}
//		
//		if(num == 1) {
//			System.out.println("빨간색입니다.");
//		} else if(num == 2) {
//			System.out.println("파란색입니다.");
//		} else if(num == 3){
//			System.out.println("초록색입니다.");
//		} else {
//			System.out.println("잘못입력하셨습니다.");
//		}
		
		/*
		 * 과일을 구매하는 프로그램을 작성하여 봅시다.
		 * 구매하고자 하는 과일을 입력하면
		 * 그에 맞는 가격이 출력되는 프로그램을 작성 해주세요.
		 * 
		 * 구매하고자 하는 과일(사과(2000), 바나나(3000), 딸기(5000)) 입력: xx
		 * xx의 가격은 xxxx입니다 / 잘못입력하셨습니다.
		 */
//		System.out.print("구매하고자 하는 과일을 입력해주세요: ");
//		String fruit = sc.next();
//		
//		switch(fruit) {
//		case "사과":
//			System.out.println("사과의 가격은 2000원입니다.");
//			break;
//		case "바나나":
//			System.out.println("바나나의 가격은 3000원입니다.");
//			break;
//		case "딸기":
//			System.out.println("딸기의 가격은 5000원입니다.");
//			break;
//		default :
//			System.out.println("잘못 입력하셨습니다.");
//		
//		}
//		
//		if(fruit.equals("사과")) {
//			System.out.println("사과의 가격은 2000원입니다.");
//		} else if (fruit.equals("바나나")) {
//			System.out.println("바나나의 가격은 3000원입니다.");
//		} else if (fruit.equals("딸기")) {
//			System.out.println("딸기의 가격은 5000원입니다.");
//		} else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
		
		/*
		 * 월을 입력받아 해당월에 말일이 며칠까지 있는지를 출력하는 프로그램 작성
		 * 월을 입력하세요 : xx
		 * xx월은 xx일 까지입니다.
		 * 1,3,5,7,8,10,12 => 31
		 * 4,6,9,11 => 30
		 * 2=> 28
		 */
		
		//내가 작성한 코드
		System.out.print("월을 입력하세요 :");
		int month = sc.nextInt();
		int day;
//		switch (month) {
//		case 1:
//			System.out.println(month+"월은 31일 까지입니다.");
//			break;
//		case 2:
//			System.out.println(month+"월은 28일 까지입니다.");
//			break;
//		case 3:
//			System.out.println(month+"월은 31일 까지입니다.");
//			break;
//		case 4:
//			System.out.println(month+"월은 30일 까지입니다.");
//			break;
//		case 5:
//			System.out.println(month+"월은 31일 까지입니다.");
//			break;
//		case 6:
//			System.out.println(month+"월은 30일 까지입니다.");
//			break;
//		case 7:
//			System.out.println(month+"월은 31일 까지입니다.");
//			break;
//		case 8:
//			System.out.println(month+"월은 30일 까지입니다.");
//			break;
//		case 9:
//			System.out.println(month+"월은 30일 까지입니다.");
//			break;
//		case 10:
//			System.out.println(month+"월은 31일 까지입니다.");
//			break;
//		case 11:
//			System.out.println(month+"월은 30일 까지입니다.");
//			break;
//		case 12:
//			System.out.println(month+"월은 31일 까지입니다.");
//			break;
//		default :
//			System.out.println("잘못입력하셨습니다.");
//		}
		
		//강사님 코드
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day= 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day= 28;
			break;
		default :
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		System.out.println(month +"월은" + day + "일 까지입니다.");
		
		//내가 작성한 if 문
//		if(month == 2) {
//			System.out.println(month+"월은 28일 까지입니다.");
//		} else if( month == 4 || month == 6 || month == 9 || month == 11) {
//			System.out.println(month+"월은 30일 까지입니다.");
//		} else {
//			System.out.println(month+"월은 31일 까지입니다.");
//		}
//		
		
	}

}
