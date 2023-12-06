package day13.Io;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		InputStream is = System.in; // 표준 입력
	
		try {
			System.out.println("단일 문자 입력");
			//int num = is.read();// 예외발생, try catch 추가, '0'~'9' : 48~57 ASCII code
			
			int num1 = is.read() - 48;
			is.read(); is.read(); // char는 2바이트니까 2개 넣어서..화이트 스페이스 제거 하기 위함 자바에서는 문자 2바이트
			int num2 = is.read() - 48;
			
			System.out.println(num1 + num2);
			 // 아스키 코드로 출력됨 int type이니깐
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
