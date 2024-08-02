package test240715.object1;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수 num1, num2, num3를 입력받아 홀짝을 출력하라
		// 입력 : 6 4 7
		// 짝 짝 홀
		/*
		int num1, num2, num3;
		System.out.print("세 가지 정수를 입력하세요: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1 %2 ==0) {
			System.out.print(" 짝 ");
		}else {
			System.out.print(" 홀 ");
		}
		if(num2 %2 ==0) {
			System.out.print(" 짝 ");
		}else {
			System.out.print(" 홀 ");
		}
		if(num3 %2 ==0) {
			System.out.print(" 짝 ");
		}else {
			System.out.print(" 홀 ");
		}
		//삼항 연산자 사용할 때
		System.out.print(num1 % 2 == 0 ? "짝 " : "홀 ");
		System.out.print(num2 % 2 == 0 ? "짝 " : "홀 ");
		System.out.print(num3 % 2 == 0 ? "짝 " : "홀 ");
		*/
		
		//정수 (0~100)을 입력받아 0부터 입력받은 수까지 출력
		//입력 : 7
		//0 1 2 3 4 5 6 7
		
		/*
		System.out.print("(0~100)까지의 정수를 입력하세요: ");
		int n1 = sc.nextInt();
		
		for(int i=0; i<=n1; i++) {
			System.out.print(i + " ");
		}
		*/
		
		//번호를 입력한 횟수를 구하는 프로그램을 작성한다.
		//번호 (1~20)까지를 무작의로 10번 입력받는다.
		//입력받은 1~20까지의 수가 각각 몇번 입력되었는지를 출력한다.
		//입력 : 1 5 7 10 15 5 1 7 7 2
		//입력횟수 : 2 1 0 0 2 0 3 0 0 1 0 0 0 0 1 0 0 0 0 0
		
		/*
		int[] arr = new int [20]; // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
		
		System.out.print("입력 : ");
		
		for(int i=0; i<10; i++) {
			int num= sc.nextInt();
			arr[num -1]++;
			
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		*/
		
		//학생 10명을 생성하고 reTest를 실행한 후 모든 학생의 점수를 출력하라
		Student[] stArr = new Student[10];
		
		for(int i=0; i<stArr.length; i++) {
			stArr[i] = new Student();
			
			System.out.print("이름 :");
			stArr[i].setName(sc.next());
			
			System.out.print("반 :");
			stArr[i].setClassRoom(sc.nextInt());
			
			stArr[i].reTest();
		}
		
		System.out.printf("%5s %3s %4s %4s %4s\n", "이름", "반", "자바", "sql", "실습");
		for(int i=0; i<stArr.length; i++) {
			Student st = stArr[i];
			System.out.printf("%5s %3d %4.2f %4.2f %4.2f\n", st.getName(), st.getClass(), st.getJavaScore(), st.getSqlScore(), st.getPracticeScore());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
