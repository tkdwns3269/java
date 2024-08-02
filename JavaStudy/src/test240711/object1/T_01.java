package test240711.object1;

import java.util.Scanner;

public class T_01 {
	//정수 n(2~9)를 입력받아 2부터 n 까지 중 짝수의 구구단을 출력하는 코드를 작성하세요.
	//만약 2~9사이의 값을 입력하지 않는다면 다시 입력하세요를 반복합니다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2~9사이의 값을 입력해주세요: ");
		int n = sc.nextInt();
		while(true) {
			if(n<2 || n>9) {
				System.out.println("다시 입력하세요.");
				continue;
			}else {
				for (int i = 2; i <= n; i++) {
					for (int j = 1; j < 10; j++) {
						if (i % 2 == 1) {
							continue;
						} else {
							System.out.println(i + " * " + j + " = " + i*j);
						}

					}
				}
			}
		}
		
		
	}

}
