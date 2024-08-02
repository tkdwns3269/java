package e.array;

public class B_Array_Copy {
	public static void main(String[] args) {
		/*
		int[] origin = { 1, 2, 3, 4, 5 };
		
		System.out.println("==원본 배열 출력==");
		for(int i=0; i< origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); //개행
		//단순하게 origin 을 다시 대입시킨 copy 배열 생성
		int[] copy = origin;
		
		System.out.println("==복사본 배열 출력==");
		for(int i=0; i< copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		copy[2] = 99;
		System.out.println("-------------------복사본 값 변경 후 ----------------");
		
		System.out.println("==원본 배열 출력==");
		for(int i=0; i< origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		*/
		//copy 의 값만 수정해도 원본의 값이 함께 변경된다.
		//왜? origin 과 copy 가 같은 메모리를 참조하고 있기 때문(참조변수의 주소값이 동일)
		//얕은 복사 : 주소값 복사
		
		//배열 복사 방법
		/*
		 * 1. for 문을 활용한 방법
		 * 새로운 배열을 만들어서 반복문을 통해 원본배열의 값들을 새로운 배열에 대입
		 */
		/*
			int[] origin = { 1, 2, 3, 4, 5 };
			//origin 배열과 크기가 같은 copy 배열 생성
			int[] copy = new int[origin.length];
			
			//orgin 배열에 있는 모든 값을 copy 배열로 전달
			for(int i=0; i< origin.length; i++) {
				copy[i] = origin[i];
			}
			copy[2] = 99;
			
			System.out.println("==원본 배열 출력==");
			for(int i=0; i< origin.length; i++) {
				System.out.print(origin[i] + " ");
			}
			System.out.println(); //개행
			
			System.out.println("==복사본 배열 출력==");
			for(int i=0; i< copy.length; i++) {
				System.out.print(copy[i] + " ");
			}
			System.out.println();
		*/
		
		//2. 새로운 배열 생성 후 arraycopy() 메소드를 이용해서 복사하기
		int[] origin = {1,2,3,4,5};
		int[] copy = new int[10]; // 0,0,0,0,3,4,5,0,0,0
		
		//System.arraycopy(원본배열, 복사시작지점인덱스, 복사본배열, 복사본배열시작인덱스, 복사 갯수)
		System.arraycopy(origin, 2, copy, 4, 3);
		
		System.out.println("==복사본 배열 출력==");
		for(int i=0; i< copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		//int[] copy = origin.clone(); //이거 한줄로 위에 코드의 역할과 같음
	}

}
