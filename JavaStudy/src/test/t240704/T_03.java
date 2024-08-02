package test.t240704;

import java.util.Scanner;

public class T_03 {
	/*
	 * 두 수를 입력
	 * 작은수와 큰수 구분하기
	 * 작은수부터 큰수까지 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,m;
		
		System.out.print("첫 번째 숫자 : ");
		n=sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		m=sc.nextInt();
		if(n>0 && m>0) {
			if(n>m) {
				for(int i=m; i<=n; i++) {
					System.out.print(i+ " ");
				}	
			} else {
				for(int i=n; i<=m; i++) {
					System.out.print(i+ " ");
				}
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		
		/*
		 * 다른 방법
		 * int max, min;
		 * 둘 중 더 큰수 구하기
		 * max = (n > m) ? n : m;
		 * min = (n < m) ? n : m;
		 * 
		 * if(min < 1 || max < 1) {
		 * 		System.out.println("1 이상의 숫자를 입력해주세요");
		 * }else {
		 * 		for(int i= min; i<=max; i++){
		 * 				System.out.print(i+ " ");
		 * 		}
		 * }
		 */
		
		
	}

}
