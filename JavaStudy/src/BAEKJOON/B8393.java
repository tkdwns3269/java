package BAEKJOON;

import java.util.Scanner;

public class B8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
