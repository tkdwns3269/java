package test.t240705;

import java.util.Scanner;

public class T_11 {
	public static void main(String[] args) {
		/*
		 * 1부터 100 사이의 정수 중 임의의 난수가 정해지고 사용자는 정해진 난수를 맞추는데 몇 번 만에
		 * 맞췄는지 출력하세요.
		 * 
		 * EX.
		 * 1~100 사이의 숫자를 입력해주세요: 90
		 * 1~100 사이의 임의의 난수를 맞춰보세요 : 0
		 * UP!
		 * 1~100 사이의 임의의 난수를 맞춰보세요 : 101
		 * UP!
		 * 1~100 사이의 임의의 난수를 맞춰보세요 : 50
		 * UP!
		 * 1~100 사이의 임의의 난수를 맞춰보세요 : 75
		 * UP!
		 * 1~100 사이의 임의의 난수를 맞춰보세요 : 83
		 * UP!
		 * 1~100 사이의 임의의 난수를 맞춰보세요 : 93
		 * UP!
		 * 1~100 사이의 임의의 난수를 맞춰보세요 : 90
		 * UP!
		 * 정답입니다 !!
		 * 7회만에 맞추셨습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		
		int rand = (int)(Math.random()*100)+1;
		System.out.println(rand);
		while(true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int n = sc.nextInt();
			
			if(n<0 && n>100) {
				System.out.print("1~100 사이의 숫자를 입력해주세요 : ");
				continue;
			}
			
			if(rand==n) {
				System.out.println("정답입니다 !!");
				System.out.println(count+"회 만에 맞추셨습니다.");
				break;
				
				
			}else if(rand<n){
				System.out.println("DOWN !");
				count++;
			}else {
				System.out.println("UP !");
				count++;
			}
			
		}
		sc.close();
		
	}

}
