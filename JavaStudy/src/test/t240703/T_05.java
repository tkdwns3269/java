package test.t240703;

import java.util.Scanner;

public class T_05 {
	/*
	 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
	 * 
	 * ex.
	 * 정수를 하나 입력하세요 : 8
	 * 
	 * 1+2+3+4+5+6+7+8 =36
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int n = sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			sum+=i;
			
		}
		for(int i=1; i<=n; i++) {
			if(i == n) {
				System.out.print(i+" ");
			}else {
				System.out.print(i+"+");
			}
			
		}
		
		System.out.print("= "+sum);
		
//		//또 다른 방법
//		System.out.println();
//		System.out.print("1");
//		for(int i=2; i<=n; i++) {
//			System.out.print("+" + i);
//		}
//		System.out.println("=" + sum);
//		
	}

}
