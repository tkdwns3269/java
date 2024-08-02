package test.t240703;

import java.util.Scanner;

public class T_02 {
	public static void main(String[] args) {
		/*
		 * 키보드로 정수를 입력 받아 정수가 양수이면서 짝수일때만 "짝수다" 를 출력하고 
		 * 짝수가 아니면 "홀수다"를 출력하세요. 
		 * 양수가 아니면 "양수만 입력해주세요." 를 출력하세요
		 * 
		 * ex. 숫자를 한 개 입력하세요 : -1 양수만 입력해주세요.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int n = sc.nextInt();

		if (n > 0) {
			if (n % 2 == 0) {
				System.out.println("양수다!");
			} else if (n % 2 == 1) {
				System.out.println("홀수다! \n양수만 입력해주세요.");
			} else {
				System.out.println("양수만 입력해주세요.");
			}
		}
	}
}
