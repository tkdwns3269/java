package test.t240704;

import java.util.Scanner;

public class T_04 {
	/*
	 * 사용자로부터 입력 받은 숫자의 단을 출력하세요.
	 * 단, 9를 초과하는 숫자가 들어오면 "9 이하의 숫자만 입력해주세요"를 출력하세요.
	 * EX)
	 * 숫자 : 4						숫자 : 10
	 * ===== 4단 =====				9 이하의 숫자만 입력해주세요
	 * 4 * 1 = 4
	 * 4 * 2 = 8
	 * 4 * 3 = 12
	 * 4 * 4 = 16
	 * 4 * 5 = 20
	 * 4 * 6 = 24
	 * 4 * 7 = 28
	 * 4 * 8 = 32
	 * 4 * 9 = 36
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int n = sc.nextInt();

		if(n>9) {
			System.out.println("9 이하의 숫자만 입력해주세요");
			
		}else {
			System.out.println("=====" + n + "단" + "=====");
			for (int i = 0; i < 10; i++) {
				System.out.println(n + " * " + i + " = " + (n * i));
			}
		}
		
		
		
	}

}
