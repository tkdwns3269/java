package q.thread.ex3;

import java.util.Scanner;

public class FarmMenu {
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();

	public void mainMenu() {
		while (true) {
			System.out.println("========== KH 마트 ==========");
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 직원메뉴"); // adminMenu() 실행
			System.out.println("2. 손님 메뉴"); // customerMenu()
			System.out.println("9. 종료"); // “프로그램 종료.” 출력 후 main()으로 리턴
			System.out.print("메뉴 번호 선택 : "); // 메뉴 화면 반복 실행 처리

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				adminMenu();
				break;
			case 2:
				customerMenu();
				break;
			case 9:
				System.out.println("프로그램 종료.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}

	}

	public void adminMenu() {
		while (true) {
			System.out.println("******* 직원 메뉴 *******");
			System.out.println("1. 새 농산물 추가"); // addNewKind() 실행
			System.out.println("2. 종류 삭제"); // removeKind()
			System.out.println("3. 수량 수정"); // changeAmount()
			System.out.println("4. 농산물 목록"); // printFarm()
			System.out.println("9. 메인으로 돌아가기"); // mainMenu()로 리턴
			System.out.print("메뉴 번호 선택 : "); // 메뉴 화면 반복 실행 처리

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				addNewKind();
				break;
			case 2:
				removeKind();
				break;
			case 3:
				changeAmount();
				break;
			case 4:
				printFarm();
				break;
			case 9:
				System.out.println("프로그램 종료.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}

	public void customerMenu() {
		
		while(true) {
			System.out.println("******* 고객 메뉴 *******");
			System.out.println("1. 농산물 사기"); // buyFarm() 실행
			System.out.println("2. 농산물 빼기"); // removeFarm()
			System.out.println("3. 구입한 농산물 보기"); // printBuyFarm()
			System.out.println("9. 메인으로 돌아가기"); // mainMenu()로 리턴
			System.out.println("메뉴 번호 선택 : "); // 메뉴 화면 반복 실행 처리
			
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				buyFarm();
				break;
			case 2:
				removeFarm();
				break;
			case 3:
				printBuyFarm();
				break;
			case 4:
				mainMenu();
				break;
			case 9:
				mainMenu();
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
		// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
	}

	public void addNewKind() {
//		‘’를 통해 번호로 종류를 받고 추가 농산물의 이름, 수량도
//		받음. 이때 없는 번호를 선택하면 “잘못 입력하셨습니다. 다시 입력해주세요.”가
//		출력되며 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름. 
//		객체 안에 종류와 이름을 저장. 데이터를 저장한 객체와 수량을 fc(FarmController)의
//		addNewKind()로 넘기고 전달 받은 반환 값이 true면 “새 농산물이 추가되었습니다.”,
//		false면 “새 농산물 추가에 실패하였습니다. 다시 입력해주세요.” 출력
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.println("추가할 종류 번호 : ");
			
			int type = sc.nextInt();
			sc.nextLine();
			
			if(type != 1 && type !=2 && type !=3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue; 
			}
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("수량 : ");
			int amount = sc.nextInt();
			sc.nextLine();
			
			Farm newItem = null;
			
			switch(type) {
			case 1:
				newItem = new Fruit("과일", name);
				break;
			case 2:
				newItem = new Vegetable("채소", name);
				break;
			case 3:
				newItem = new Nut("견과", name);
				break;
			}
			
			if(fc.addNewKind(newItem, amount)) {
				System.out.println("새 농산물이 추가되었습니다.");
				break;
			} else {
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void removeKind() {
		
		
	}

	public void changeAmount() {

	}

	public void printFarm() {

	}

	public void buyFarm() {

	}

	public void removeFarm() {

	}

	public void printBuyFarm() {

	}
}