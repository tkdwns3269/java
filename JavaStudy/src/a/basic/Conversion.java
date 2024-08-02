package a.basic;

public class Conversion {
	/*
	 * 형변환
	 * 자료형을 다른 자료형으로 변경해주는 것
	 * 
	 * 자동형변환
	 * 두개 이상의 자료형을 연산할 때 하나의 자료형으로 일치시켜야 연산이 가능하다.
	 * 그래서 데이터 손실이 적은 방향으로 컴파일러가 직접 형변환을 해주는 것
	 * 
	 * 명시적 형변환(강제 형변환)
	 * 값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변환할 때
	 * 자동으로 컴파일러가 해주지 않기 때문에 프로그래머가 명시적으로 진행한다.
	 * -> 데이터 손실을 감수한다.
	 */
	public static void main(String[] args) {
		double pi =3.1415;
		int number = (int)pi;

		System.out.println(number);

		long num1 = 3000000007L;
		int number2= (int)num1;
		System.out.println(number2);

		short num2 =1;
		short num3 =2;
		short num4 =(short)(num2 + num3); //short 과 byte의 경우 연산을 할때 자동으로 int형으로 바뀌므로 에러가 발생한다.
										  //따라서 (short)을 사용해서 형변환을 시켜야 한다.
		System.out.println(num4);
	}

}
