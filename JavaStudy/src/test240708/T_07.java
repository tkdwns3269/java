package test240708;

public class T_07 {
	public static void main(String[] args) {
		/*
		 * 배열에 들어있는 데이터 중 홀수의 값들을 출력하고 합을 구한다.
		 * 단, continue 를 이용하여 작성한다.
		 */
		
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				System.out.println(array[i]);
				sum += array[i];
			}
		}

		System.out.println("합계 : " + sum);
	}
}
