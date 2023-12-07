package day14.Io.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;


// 파일 생성 하는 코드 
public class FileInputEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			OutputStream os = new FileOutputStream("test.txt"); // 상대경로, 예외발생
//			OutputStream os = new FileOutputStream("C:\\Users\\Playdata\\Desktop\\@java\\workspace\\java-partice\test.txt"); // 절대경로
//			OutputStream os = new FileOutputStream("test2.txt");
			
			while( true ) {
				System.out.println("문자열 입력해주세요 : ");
				String str = sc.nextLine() + "\r\n"; // 줄바꿈 아래쪽(\n)에 처음부분(\r)에 커서 위치 
				
				if ( str.equalsIgnoreCase("exit\r\n") ) {
					System.out.println(str.length()+"byte 만큼 사용됨");
					break;
				}
				
				os.write(str.getBytes()); // 예외발생. 읽어들인 문자 str의 길이(getBytes())만큼 써주세요.
//				System.out.println(str); //화면 출력
				
 			}// while end 
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
