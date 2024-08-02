package k.exception.ex2;

import java.util.Scanner;

public class CharacterMenu {
	public void menu(){
		// 사용자에게 두 정수를 입력 받아 NumberController의 checkDouble()에
		// 매개변수로 넘겨주어 반환 값을 출력함
		// 이 때 checkDouble()메소드를 호출하는 부분부터 try~catch를 이용하여 예외 처리

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		CharacterController cc = new CharacterController();
		try {
			int length = cc.countAlpha(str);
			System.out.println("\'" +str + "\'에 포함된 영문자 개수 : "+ length);
		} catch (CharCheckException e) {
			System.out.println("문자열에 공백이 포함되어있습니다.");
		} finally {
			sc.close();
			System.out.println("잘 종료되었습니다.");
		}
		
		
	}
}
