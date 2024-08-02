package l.io.ex3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filebyte {
	/*
	 * "바이트 스트립 기반"을 통한 입출력해보기"
	 * 
	 * -바이트스트림 : 데이터를 1바이트 단위로 전송하는 통로(좁은통로-> 한글깨짐)
	 * -기반스트림 : 외부매체와 직접적으로 연갈하는 통로
	 * 
	 * xxxInputStream : xxx 매체로부터 데이터를 입력받는 통로(외부로부터 데이터를 읽어오겠다.)
	 * xxxOutputStream : xxx 매체로부터 데이터를 출력하는 통로(외부매체로 데이터를 내보내겠다.)
	 */
	
	//프로그램(자바) -> 외부매체(파일) 데이터를 출력(프로그램상의 데이터를 파일로 내보내보자)
	public void fileSave() {
		
		//1. FileOutputStream 객체 생성
		//해당파일이 없으면 새로 만들어주고 통로연결 / 있으면 해당 파일에 통로연결
		try(FileOutputStream fout = new FileOutputStream("byte_test.txt");) {
			
		fout.write(10);
		fout.flush();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		finally {
//			try {
//				fout.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		

	}

	public void fileRead() {

		FileInputStream fin = null;
		try {
			// 1. 스트림 생성
			fin = new FileInputStream("byte_test.txt");
//				System.out.println(fin.read());
//				System.out.println(fin.read());
//				System.out.println(fin.read());
//				System.out.println(fin.read());
//				System.out.println(fin.read());
//				System.out.println(fin.read());
//				System.out.println(fin.read());
//				System.out.println(fin.read()); //퍄일의 끝을 만나는 순간 -1을 반환한다
				while(true) {
					int value = fin.read();
					if(value == -1) {
						break;
					}
					System.out.println((char)value);
				}
			 
			// 2.파일로부터 데이터를 읽어들이고자 할때 read 메소드를 사용
			// 1byte씩 읽어옴
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
