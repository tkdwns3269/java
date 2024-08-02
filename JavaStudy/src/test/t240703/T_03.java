package test.t240703;

import java.util.Scanner;

public class T_03 {
	/*
	 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	
	ex.
	첫 번째 숫자 : 8	첫 번째 숫자 : 4	첫 번째 숫자 : 9
	두 번째 숫자 : 4 	두 번째 숫자 : 8 	두 번째 숫자 : 0
	4 5 6 7 8 		4 5 6 7 8 		1 이상의 숫자를 입력해주세요.
	 */
	
	//두 수를 입력
	//작은수와 큰수 구분하기
	//작은수부터 큰수까지 출력

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수 : ");
		int a = sc.nextInt();

		System.out.print("수학점수 : ");
		int b = sc.nextInt();

		System.out.print("영어점수 : ");
		int c = sc.nextInt();

		int sum = a + b + c;
		double avg = (double) sum / 3;
		if (a >= 40 && b >= 40 && c >= 40 && avg >= 60) {
			System.out.println("국어:" + a);
			System.out.println("수학:" + b);
			System.out.println("영어:" + c);
			System.out.println("합계:" + sum);
			System.out.println("평균:" + avg);
			System.out.println("축하합니다, 합격입니다!");

		} else
			System.out.println("불합격입니다.");

	}

}
