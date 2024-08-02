package test.t240705;

import java.util.Scanner;

public class T_03 {
	public static void main(String[] args) {
		/*
		 * 3수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false 를 출력하세요.
		 * EX.
		 * 입력1 : 5
		 * 입력2 : -8
		 * 입력3 : 5
		 * 
		 * false
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		//내가 작성한 코드
//		System.out.print("입력1 : ");
//		int n1 = sc.nextInt();
//		System.out.print("입력2 : ");
//		int n2 = sc.nextInt();
//		System.out.print("입력3 : ");
//		int n3 = sc.nextInt();
//		
//		if(n1==n2 && n1==n3) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
		//강사님 코드
		for(int i=0; i<arr.length; i++) {
			System.out.printf("입력%d : ", i + 1);
			arr[i] = sc.nextInt();
		}
		
//		if(arr[0] == arr[1] && arr[0] == arr[2]) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
		
		System.out.println(arr[0] == arr[1] && arr[0] == arr[2]);
		

	}

}
