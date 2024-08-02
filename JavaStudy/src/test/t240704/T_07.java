package test.t240704;

import java.util.Scanner;

public class T_07 {
	public static void main(String[] args) {
		/*
		 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력되면서
		 다시 사용자가 값을 입력하도록 하세요.

		ex.
		첫 번째 숫자 : 8	첫 번째 숫자 : 4	첫 번째 숫자 : 9
		두 번째 숫자 : 4 	두 번째 숫자 : 8 	두 번째 숫자 : 0
		4 5 6 7 8 		4 5 6 7 8 		1 이상의 숫자를 입력해주세요.
										첫 번째 숫자 : 6
										두 번째 숫자 : 2
										2 3 4 5 6 
		 */
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		System.out.print("문자열 : ");
		String str = sc.next(); //application
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0); // i
		
		char[] chArr = new char[str.length()];
		for(int i=0; i< chArr.length; i++) {
			chArr[i] = str.charAt(i);
		}
		
		System.out.print(str + "에 " + ch +"가 존재하는 위치(인덱스) :");
		
		//str에서 i 위치
		for(int i=0; i< chArr.length; i++) {
			if(str.charAt(i) == ch) { //문자열에서 가져온 n번째 문자와 입력받은 문자 비교
				System.out.print(i + " ");
				count++;
			}
			
		}
		System.out.println();
		System.out.println(ch + "개수 :" + count);
	}

}
