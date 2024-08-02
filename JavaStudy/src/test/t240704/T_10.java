package test.t240704;

public class T_10 {
	public static void main(String[] args) {
		/*
		 * 4행 4열짜리 정수형 배역을 선언 및 할당하고
		 * 1) 1 ~16까지 값을 거꾸로 저장하세요.
		 * 2) 저장된 값들을 차례대로 출력하세요.
		 */
		
		int[][] arr= new int[4][4];
		int value = 16;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = value--;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
