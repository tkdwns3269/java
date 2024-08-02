package test.t240705;

import java.util.Scanner;

public class T_04 {
	public static void main(String[] args) {
		/*
		 * A,B,C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여
		 * 출력하고 인센티브 포함 급여가 3000만원 이상이면 "3000 이상", 미만이면"3000 미만"을 출력하세요
		 * (A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
		 * 
		 * EX.
		 * A 사원의 연봉 : 2500
		 * B 사원의 연봉 : 2900
		 * C 사원의 연봉 : 2600
		 * 
		 * A사원의 연봉 / 연봉+a : 2500/3500.0
		 * 3000 이상
		 * B사원의 연봉 / 연봉+a : 2900/2900.0
		 * 3000 미만
		 * C사원의 연봉 / 연봉+a : 2600/2989.9999999999995
		 * 3000 미만
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int A,B,C;
		System.out.print("A 사원의 연봉 : ");
		A = sc.nextInt();
		System.out.print("B 사원의 연봉 : ");
		B = sc.nextInt();
		System.out.print("C 사원의 연봉 : ");
		C = sc.nextInt();
		
		System.out.println("A사원의 연봉 / 연봉+a : "+ A +"/"+(A*1.4));
		if((A*1.4)>=3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		
		System.out.println("B사원의 연봉 / 연봉+a : "+ B +"/"+B);
		if(B>=3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		
		System.out.println("C사원의 연봉 / 연봉+a : "+ C +"/"+ (C*1.15));
		if((C*1.15)>=3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		
	}

}
