package BAEKJOON;

import java.util.Scanner;

public class B2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, n4, n5, n6;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = n1 * (n2 % 10 / 1);
		n4 = n1 * (n2 % 100 / 10);
		n5 = n1 * (n2 % 1000 / 100);
		n6 = n3 + (n4 * 10) + (n5 * 100);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);

	}

}
