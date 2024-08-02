package test240711.object1;

import java.util.Scanner;

public class T_02 {
	//정수 num 을 입력받아 크기가 num 인 정수형 배열을 만들고 1~100사이의 랜덤값으로 모든 배열의 인덱스값을 대입합니다.
	//이후 모든 배열의 값을 출력하고 홀수 인덱스의 값을 더한 값을 출력하세요.
	
	//5 42 3 10 5
	// 홀수 index 의 합 : 52
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		System.out.print("정수 입력 :");
		int num = sc.nextInt();

		int[] arr = new int[num];
		System.out.print("모든 배열의 값: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			System.out.print(arr[i] + " ");
			if (arr[i] % 2 == 1) {
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("홀수 인덱스의 합 : " + sum);

	}

}
