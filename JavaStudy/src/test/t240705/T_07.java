package test.t240705;

import java.util.Scanner;

public class T_07 {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 2개의 값을 입력받아 그 사이의 숫자를 출력하세요.
		 * 만일 1 미만의 숫자가 입력됐다면 "1이상의 숫자를 입력하세요"를 출력
		 * 다시 사용자가 값을 입력하도록 하세요.
		 * 
		 * EX.
		 * 첫 번째 숫자 : 8		첫 번째 숫자 : 4	첫 번째 숫자 : 9
		 * 두 번쨰 숫자 : 4		두 번쨰 숫자 : 8	두 번쨰 숫자 : 0
		 * 4 5 6 7 8		4 5 6 7 8		1이상의 숫자를 입력해주세요.
		 * 									첫 번쨰 숫자 : 6
		 * 									두 번쨰 숫자 : 2
		 * 									2 3 4 5 6 
		 */
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		while (true) {
			System.out.print("첫 번째 숫자 : ");
			n1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			n2 = sc.nextInt();

			if (n1 <= 0 || n2 <= 0) {
				System.out.println("1이상의 숫자를 입력하세요");
				continue;
			} else {
				if (n1 > n2) {
					for (int i = n2; i <= n1; i++) {
						System.out.print(i + " ");
					}
				} else {
					for (int i = n1; i <= n2; i++) {
						System.out.print(i + " ");
					}
				}
				break;
			}
		}

	}
}
