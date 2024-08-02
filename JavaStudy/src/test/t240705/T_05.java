package test.t240705;

import java.util.Scanner;

public class T_05 {
	public static void main(String[] args) {
		/*
		 * 키, 몸무게를 double 로 입력 받고 BMI수치를 계산하여 계산 결과에 따라 
		 * 저체중/정상체중/과체중/비만을 출력하세요.
		 * BMI = 몸무게 / ((키(m) *키(m))
		 * BMI가 18.5 미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		 * BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		 * BMI가 30이상일 경우 고도 비만
		 * 
		 * EX.
		 * 키(m)를 입력해 주세요 :1.65
		 * 몸무게(kg)룰 입력해주세요 :58.4
		 * BMI 지수 : 21.45
		 * 정상체중
		 */
		Scanner sc = new Scanner(System.in);
		double m, kg, BMI;
		System.out.print("키(m)를 입력해 주세요 : ");
		m = sc.nextDouble();
		System.out.print("몸무게(kg)룰 입력해주세요 : ");
		kg = sc.nextDouble();

		BMI = kg / (m * m);
		System.out.println("BMI 지수 : " + BMI);
		
		if(BMI < 18.5) {
			System.out.println("저체중");
		}else if(BMI<23) {
			System.out.println("정상체중");
		}else if(BMI<25) {
			System.out.println("과체중");
		}else if(BMI<30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
		
	}

}
