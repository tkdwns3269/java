package BAEKJOON;

import java.util.Scanner;

public class B2525 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int min = 60 * A + B; // 시 -> 분 
		min += C; //요리하는데 걸린 시간 더하기

		int hour = (min / 60) % 24; // 시 (24시 이상이 될 경우 0시부터 다시 시작)
		int minute = min % 60; //분
		
		System.out.println(hour + " " + minute);

	}

}
