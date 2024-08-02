package test240723.object2;

import java.util.Scanner;

public class NumberMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("정수1 : ");
		n1= sc.nextInt();
		
		System.out.print("정수2 : ");
		n2 = sc.nextInt();
		
		NumberController nc = new NumberController();
		try {
			boolean isDouble = nc.checkDouble(n1, n2);
			System.out.println(n1+"은(는) "+ n2 + "의 배수인가?"+ isDouble);
		} catch (NumRangeException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
