package test.t240705;

import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		/*
		 * 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요. 
		 * 이때 총점과 평균은 정수형으로 처리하세요.
		 * 
		 * EX. 국어 : 90.0 영어 : 90.0 수학 : 90.0
		 * 
		 * 총점 : 270 평균 :90
		 */

		Scanner sc = new Scanner(System.in);
		float kr, ma, en;
		System.out.print("국어 : ");
		kr = sc.nextFloat();
		System.out.print("수학 : ");
		ma = sc.nextFloat();
		System.out.print("영어 : ");
		en = sc.nextFloat();
		int sum = (int) (kr + ma + en);
		int avg = (int) (kr + ma + en) / 3;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
