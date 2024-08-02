package test.t240705;

import java.util.Scanner;

public class T_10 {
	public static void main(String[] args) {
		/*
	    사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가
		몇 개 있는지 개수를 출력하세요. 
	 	“더 하시겠습니까?”라고 추가로 물어보도록 하세요.
		이 때, N이나 n이 나오면 프로그램을 끝내고 Y나 y면 계속 진행하도록 하되 Y, y, N, n이 아닌 
		다른 문자를 입력했을 경우 “잘못된 대답입니다. 다시 입력해주세요.”를 출력하고 
		더 하겠냐는 물음을 반복하세요.
		ex.
		문자열 : application			 더 하시겠습니까? (y/n) : k
		문자 : a				         잘못된 대답입니다. 다시 입력해주세요.
		포함된 개수 : 2				 더 하시겠습니까? (y/n) : Y
		더 하시겠습니까? (y/n) : y		 문자열 : ant
		문자열 : business			     문자 : b
		문자 : s				         포함된 개수 : 0
		포함된 개수 : 3				 더 하시겠습니까? (y/n) : N
	 */
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			int count = 0;

			System.out.print("문자열 : ");
			String str = sc.next();

			System.out.print("문자 : ");
			char ch = sc.next().charAt(0);

			char[] arr = new char[str.length()];
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch) {
					count++;
				}
			}
			System.out.println("포함된 갯수 : " + count);
			while (true) {
				System.out.print("더 하시겠습니까? (y/n): ");

				ch = sc.next().charAt(0);

				if (ch == 'n' || ch == 'N' || ch == 'y' || ch == 'Y') {
					break;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
					
				}
				
			}
			if (ch == 'n' || ch == 'N') {
				break;
			}

		}
	}

}
