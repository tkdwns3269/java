package test.t240703;

import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("1.입력 \n2.수정\n3.조회\n4.삭제\n7.종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int n = sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("종료합니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		
		
		
	
	}

}